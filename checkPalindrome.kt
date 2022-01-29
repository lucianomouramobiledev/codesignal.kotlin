//https://app.codesignal.com/arcade/intro/level-1/s5PbmwxfECC52PWyQ/solutions

fun solution(inputString: String): Boolean {  
    val stringLenght = inputString.count()
    for(position in 1..stringLenght/2){
        val currentItem = inputString.get(position-1)
        val correspondentItem = inputString.get(stringLenght - position)
        if(currentItem.compareTo(correspondentItem)!=0) {
            return false
        }        
    }
    return true
}

