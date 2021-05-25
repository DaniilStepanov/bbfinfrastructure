package kotlinx

object Warnings {
    const val NOTHING_TO_INLINE = "NOTHING_TO_INLINE"
    const val UNUSED_VARIABLE = "UNUSED_VARIABLE"
    const val UNUSED_PARAMETER = "UNUSED_PARAMETER"
    const val OVERRIDE_BY_INLINE = "OVERRIDE_BY_INLINE"
    const val DUPLICATE_LABEL_IN_WHEN = "DUPLICATE_LABEL_IN_WHEN"
    const val NON_EXHAUSTIVE_WHEN = "NON_EXHAUSTIVE_WHEN"
    const val USELESS_NULLABLE_CHECK = "USELESS_NULLABLE_CHECK"
    const val ALWAYS_NULL = "ALWAYS_NULL"
    const val IMPLICIT_CAST_TO_ANY = "IMPLICIT_CAST_TO_ANY"
    const val CAST_NEVER_SUCCEEDS = "CAST_NEVER_SUCCEEDS"
    const val USELESS_CAST = "USELESS_CAST"
    const val UNCHECKED_CAST = "UNCHECKED_CAST"
    const val USELESS_ELVIS_ON_LAMBDA_EXPRESSION = "USELESS_ELVIS_ON_LAMBDA_EXPRESSION"
    const val USELESS_ELVIS = "USELESS_ELVIS"
    const val UNSAFE_CALL = "UNSAFE_CALL"
    const val UNSAFE_IMPLICIT_INVOKE_CALL = "UNSAFE_IMPLICIT_INVOKE_CALL"
    const val UNSAFE_INFIX_CALL = "UNSAFE_INFIX_CALL"
    const val UNNECESSARY_SAFE_CALL = "UNNECESSARY_SAFE_CALL"
    const val UNEXPECTED_SAFE_CALL = "UNEXPECTED_SAFE_CALL"
    const val UNNECESSARY_NOT_NULL_ASSERTION = "UNNECESSARY_NOT_NULL_ASSERTION"
    const val NOT_NULL_ASSERTION_ON_LAMBDA_EXPRESSION = "NOT_NULL_ASSERTION_ON_LAMBDA_EXPRESSION"
    const val SENSELESS_NULL_IN_WHEN = "SENSELESS_NULL_IN_WHEN"
    const val SENSELESS_COMPARISON = "SENSELESS_COMPARISON"
    const val UNUSED_LAMBDA_EXPRESSION = "UNUSED_LAMBDA_EXPRESSION"
    const val UNUSED_EXPRESSION = "UNUSED_EXPRESSION"
    const val UNUSED_CHANGED_VALUE = "UNUSED_CHANGED_VALUE"
    const val UNUSED_VALUE = "UNUSED_VALUE"
    const val VARIABLE_WITH_REDUNDANT_INITIALIZER = "VARIABLE_WITH_REDUNDANT_INITIALIZER"
    const val ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE = "ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE"
    const val UNUSED_TYPEALIAS_PARAMETER = "UNUSED_TYPEALIAS_PARAMETER"
    const val UNREACHABLE_CODE = "UNREACHABLE_CODE"
    const val LABEL_NAME_CLASH = "LABEL_NAME_CLASH"
    const val DELEGATE_PD_METHOD_NONE_APPLICABLE = "DELEGATE_PD_METHOD_NONE_APPLICABLE"
    const val TYPE_ARGUMENTS_REDUNDANT_IN_SUPER_QUALIFIER = "TYPE_ARGUMENTS_REDUNDANT_IN_SUPER_QUALIFIER"
    const val REIFIED_TYPE_UNSAFE_SUBSTITUTION = "REIFIED_TYPE_UNSAFE_SUBSTITUTION"
    const val TAIL_RECURSION_IN_TRY_IS_NOT_SUPPORTED = "TAIL_RECURSION_IN_TRY_IS_NOT_SUPPORTED"
    const val NON_TAIL_RECURSIVE_CALL = "NON_TAIL_RECURSIVE_CALL"
    const val ACCESSOR_PARAMETER_NAME_SHADOWING = "ACCESSOR_PARAMETER_NAME_SHADOWING"
    const val DIFFERENT_NAMES_FOR_THE_SAME_PARAMETER_IN_SUPERTYPES = "DIFFERENT_NAMES_FOR_THE_SAME_PARAMETER_IN_SUPERTYPES"
    const val PARAMETER_NAME_CHANGED_ON_OVERRIDE = "PARAMETER_NAME_CHANGED_ON_OVERRIDE"
    const val USELESS_VARARG_ON_PARAMETER = "USELESS_VARARG_ON_PARAMETER"
    const val NO_TAIL_CALLS_FOUND = "NO_TAIL_CALLS_FOUND"
    const val NON_FINAL_MEMBER_IN_OBJECT = "NON_FINAL_MEMBER_IN_OBJECT"
    const val NON_FINAL_MEMBER_IN_FINAL_CLASS = "NON_FINAL_MEMBER_IN_FINAL_CLASS"
    const val MISPLACED_TYPE_PARAMETER_CONSTRAINTS = "MISPLACED_TYPE_PARAMETER_CONSTRAINTS"
    const val FINAL_UPPER_BOUND = "FINAL_UPPER_BOUND"
    const val DEPRECATION = "DEPRECATION"
    const val REDUNDANT_OPEN_IN_INTERFACE = "REDUNDANT_OPEN_IN_INTERFACE"
    const val REDUNDANT_ANNOTATION_TARGET = "REDUNDANT_ANNOTATION_TARGET"
    const val DEPRECATED_MODIFIER_CONTAINING_DECLARATION = "DEPRECATED_MODIFIER_CONTAINING_DECLARATION"
    const val REDUNDANT_MODIFIER = "REDUNDANT_MODIFIER"
    const val DEPRECATED_MODIFIER_PAIR = "DEPRECATED_MODIFIER_PAIR"
    const val EXPANSIVE_INHERITANCE_IN_JAVA = "EXPANSIVE_INHERITANCE_IN_JAVA"
    const val FINITE_BOUNDS_VIOLATION_IN_JAVA = "FINITE_BOUNDS_VIOLATION_IN_JAVA"
    const val REDUNDANT_PROJECTION = "REDUNDANT_PROJECTION"
}