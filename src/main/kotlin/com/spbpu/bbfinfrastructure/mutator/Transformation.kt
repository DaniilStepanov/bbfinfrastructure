package com.spbpu.bbfinfrastructure.mutator

import com.intellij.psi.PsiFile
import com.spbpu.bbfinfrastructure.mutator.checkers.MutationChecker
import org.apache.log4j.Logger

abstract class Transformation {
    abstract fun transform()

    companion object {
        lateinit var checker: MutationChecker
        val file: PsiFile
            get() = checker.curFile.psiFile

        //val curProject = checker.project
        internal val log = Logger.getLogger("mutatorLogger")
    }

}