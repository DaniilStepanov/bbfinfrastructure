package com.spbpu.bbfinfrastructure.mutator.mutations

import com.spbpu.bbfinfrastructure.getAllPSIChildrenOfType
import com.spbpu.bbfinfrastructure.mutator.Transformation
import com.spbpu.bbfinfrastructure.psicreator.util.Factory
import org.jetbrains.kotlin.psi.KtStringTemplateExpression

class ReplaceStringConstant: Transformation() {
    override fun transform() {
        val stringConstant = file.getAllPSIChildrenOfType<KtStringTemplateExpression>().first()
        val newConstant = Factory.psiFactory.createStringTemplate("Bye bye, world!")
        checker.replaceNodeIfPossible(stringConstant, newConstant)
    }
}