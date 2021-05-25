package com.spbpu.bbfinfrastructure.psicreator.util

import com.intellij.psi.PsiFile
import com.spbpu.bbfinfrastructure.psicreator.PSICreator
import org.jetbrains.kotlin.psi.KtPsiFactory

object Factory {
    val file = PSICreator.getPSIForText("")
    val psiFactory = KtPsiFactory(file.project)
}
