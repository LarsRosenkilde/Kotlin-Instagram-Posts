class Palindrome(val word: String) {
    fun isPalindrome(): Boolean {
        val wordReversed = word.reversed()
        return word == wordReversed
    }
}   

fun main() {
    val word = "racecar"
    println(Palindrome(word: word).isPalindrome())
}

