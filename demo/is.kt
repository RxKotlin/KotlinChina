// kotlinc is.kt -d is.jar
// kotlin -classpath is.jar IsKt tested_string
// "IsKt" is default class name for this file

fun main(args: Array<String>) {
    if (args.size > 0) {
        println(getStringLength(args[0]))
        println(valitateStringLength(args[0]))
    }
}

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        // 此处已经将obj化为String类型了, 无需再做类型转换
        return obj.length
    }

    return null
}

fun valitateStringLength(obj: Any): Boolean {
    if (obj is String && obj.length > 0) {
        // 此处已经将obj化为String类型了, 就连if判断中也可以直接.length
        return true
    }

    return false
}
