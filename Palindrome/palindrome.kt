fun main() {
    string correct = "racecar";
    string incorrect = "Farrari";
    println(Palindrome(word: correct).isPalindrome());
    println(Palindrome(word: incorrect).isPalindrome());
}

class Palindrome(val word: String) {
    fun isPalindrome(): Boolean {
        val wordReversed = word.reversed()
        return word == wordReversed
    }
}   