import com.intellij.psi.PsiFile
import com.spbpu.bbfinfrastructure.compiler.Stream
import com.spbpu.bbfinfrastructure.mutator.Mutator
import com.spbpu.bbfinfrastructure.mutator.Transformation
import com.spbpu.bbfinfrastructure.mutator.checkers.MutationChecker
import com.spbpu.bbfinfrastructure.project.BBFFile
import com.spbpu.bbfinfrastructure.project.Project
import com.spbpu.bbfinfrastructure.psicreator.PSICreator
import com.spbpu.bbfinfrastructure.util.CompilerArgs
import com.stepanov.bbf.bugfinder.executor.compilers.JVMCompiler
import org.apache.log4j.PropertyConfigurator
import java.io.File
import kotlin.system.exitProcess

fun main() {
    //Init log4j
    PropertyConfigurator.configure("src/main/resources/bbfLog4j.properties")
    val project = Project.createFromCode(File("test/HelloWorld.kt").readText())
    val compiler = JVMCompiler("")
    val compilationResult = compiler.compile(project)
    val execResult = compiler.exec(compilationResult.pathToCompiled, Stream.BOTH)
    println("EXEC RESULT = $execResult")
    println(JVMCompiler("").checkCompiling(project))
    println("BEFORE = $project")
    mutate(project, project.files.first())
    println("AFTER = $project")
    exitProcess(0)
}

fun mutate(
    project: Project,
    curFile: BBFFile,
) {
    Transformation.checker = MutationChecker(
        CompilerArgs.getCompilersList(),
        project,
        curFile
    )
    Mutator(project).startMutate()
}
