//https://app.codesignal.com/arcade/intro/level-2/yuGuHvcCaFCKk56rJ
fun solution(n: Int): Int {
    
    var value = 1
    for(i in 1..n-1) {
    value = value + ( i * 4)    
    }

    return value
}
