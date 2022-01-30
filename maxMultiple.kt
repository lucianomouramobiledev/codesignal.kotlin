//https://app.codesignal.com/arcade/code-arcade/intro-gates/HEsmEacHr2s9wahjr
fun isDivisibleByDivisor(value: Int, divisor: Int): Boolean {
      return value % divisor == 0
}

fun isLessThanOrEqualToBound(value: Int, bound: Int): Boolean {
    return value<=bound
}

fun isGreaterThanZero(value: Int): Boolean{
    return value > 0
}

fun solution(divisor: Int, bound: Int): Int {   
    for(maxValue in bound downTo 0) {
        if(isDivisibleByDivisor(maxValue, divisor) &&
            isLessThanOrEqualToBound(maxValue, bound) &&
            isGreaterThanZero(maxValue)){
            return maxValue        
        }
    }
    return 0
}
