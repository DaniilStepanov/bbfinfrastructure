package com.spbpu.bbfinfrastructure.mutator

import com.spbpu.bbfinfrastructure.mutator.mutations.ReplaceStringConstant
import com.spbpu.bbfinfrastructure.project.LANGUAGE
import com.spbpu.bbfinfrastructure.project.Project
import org.apache.log4j.Logger
import kotlin.random.Random
import kotlin.system.exitProcess

class Mutator(val project: Project) {

    private fun executeMutation(t: Transformation, probPercentage: Int = 50) {
        if (Random.nextInt(0, 100) < probPercentage) {
            log.debug("Cur transformation ${t::class.simpleName}")
            t.transform()
        }
    }


    fun startMutate() {
        for (bbfFile in project.files) {
            log.debug("Mutation of ${bbfFile.name} started")
            Transformation.checker.curFile = bbfFile
            when (bbfFile.getLanguage()) {
                //LANGUAGE.JAVA -> startJavaMutations()
                LANGUAGE.KOTLIN -> startKotlinMutations()
            }
            log.debug("End")
        }
    }


    //Stub
    private fun startJavaMutations() {
        println("STARTING JAVA MUTATIONS")
        println("END JAVA MUTATIONS")
        log.debug("Verify = ${verify()}")
        return
    }

    private fun startKotlinMutations() {
        executeMutation(ReplaceStringConstant(), 100)
    }


    private fun verify(): Boolean {
        val res = Transformation.checker.checkCompiling(project)
        if (!res) {
            log.debug("Cant compile project ${project}")
            System.exit(1)
        }
        return res
    }


    private val log = Logger.getLogger("bugFinderLogger")
    private val checker
        get() = Transformation.checker

}