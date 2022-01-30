//https://app.codesignal.com/arcade/code-arcade/intro-gates/aiKck9MwwAKyF8D4L
fun sumOfDigits(n: String): Int {
    val arr = n.toList()
    val sum = arr.sumBy { "$it".toInt() }
    return sum
}

fun solution(n: Int): Int {
    var numberOfHours = n / 60
    var numberOfMinutes = 0
    if( n % 60 != 0) {
        numberOfMinutes = n % 60
    }
    
    return sumOfDigits(numberOfHours.toString()) + sumOfDigits(numberOfMinutes.toString())
}
