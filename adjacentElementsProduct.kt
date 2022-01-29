//https://app.codesignal.com/arcade/intro/level-2/xzKiBHjhoinnpdh6m
fun solution(inputArray: MutableList<Int>): Int {
    
    var largestProduct = inputArray.get(0) * inputArray.get(1)

    for(i in 0..inputArray.size-2) {
        val firstValue = inputArray.get(i)
        val secondValue = inputArray.get(i+1)
        val productOfAdjacentElements = firstValue * secondValue
        
        if(productOfAdjacentElements > largestProduct) {
            largestProduct = productOfAdjacentElements
        } 
    }
    return largestProduct
}

