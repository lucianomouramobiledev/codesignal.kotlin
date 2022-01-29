//https://app.codesignal.com/arcade/intro/level-1/egbueTZRRL5Mm4TXN

fun solution(year: Int): Int {

  val yearModCentury = year % 100
  val centuryBase = year / 100

  if(yearModCentury!=null && yearModCentury != 0) {
      return centuryBase  +1
  }else {
      return centuryBase
  }
}

