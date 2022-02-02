fun checkZigZag(firstItem: Int, secondItem:Int, thirdItem:Int) :Boolean{
    if(firstItem < secondItem && secondItem > thirdItem) {
        return true
    } 
    else if(firstItem > secondItem && secondItem < thirdItem ) {
        return true
    }
    else {
        return false
    }
}

fun solution(numbers: MutableList<Int>): MutableList<Int> {
  
  var numbersReturn : MutableList<Int> = mutableListOf<Int>()
  
  var firstItem: Int = 0
  var secondItem: Int = 0
  var thirdItem: Int = 0

  for(item in 0..numbers.size-3) {
      firstItem = numbers.get(item)
      secondItem = numbers.get(item + 1)
      thirdItem = numbers.get(item + 2)
      val returns :Boolean = checkZigZag(firstItem, secondItem, thirdItem)
      if(returns == true){
           numbersReturn.add(1)
      }else{
           numbersReturn.add(0)
      }
      
  }
  return numbersReturn
}

