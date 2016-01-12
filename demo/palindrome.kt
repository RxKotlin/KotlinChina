// kotlinc palindrome.kt -d test.jar
// kotlin -classpath test.jar PalindromeKt tested_string
// "PalindromeKt" is default class name for this file

fun main(args: Array<String>) {
    if (args.size > 0) {
        println(isPalindrome(args[0]))
    }
}

fun isPalindrome(str: String): Boolean {
    val reversedStr = str.reversed()
    return str.equals(reversedStr)
}