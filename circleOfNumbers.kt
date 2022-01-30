//https://app.codesignal.com/arcade/code-arcade/intro-gates/vExYvcGnFsEYSt8nQ
fun solution(n: Int, firstNumber: Int): Int {
    var numberToWalk = n/2
    var firstNumberToWalk = firstNumber + numberToWalk
    if(firstNumberToWalk > n-1) {
    return firstNumberToWalk-n    
    }else {
        return firstNumberToWalk
    }
}
