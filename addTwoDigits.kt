//https://app.codesignal.com/arcade/code-arcade/intro-gates/wAGdN6FMPkx7WBq6
fun getModNumber(n: Int): Int{
    return n % 10
 }

fun solution(n: Int): Int {
    var primaryValue : Int = n 
    var sumOfDigits = 0
    while(primaryValue != 0 ) {
            var modNumberValue = getModNumber(primaryValue)
            sumOfDigits += modNumberValue
            primaryValue = primaryValue/10
    }
  return sumOfDigits
}
