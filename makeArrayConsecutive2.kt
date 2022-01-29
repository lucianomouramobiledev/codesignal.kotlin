//https://app.codesignal.com/arcade/intro/level-2/bq2XnSr5kbHqpHGJC
fun solution(statues: MutableList<Int>): Int {
    statues.sort()
    var neededAditionalStatues = 0
    val minimumStatueSize = statues.get(0)
    val maximumStatueSize = statues.get(statues.size-1)
    
    for(position in 0..statues.size-2) {
        val currentValue = statues.get(position)
        var nextValue = statues.get(position+1)
        if(nextValue - currentValue > 1) {
            val difference = (nextValue - currentValue)
            neededAditionalStatues += difference-1
        }
    }
  return neededAditionalStatues
}
