//https://app.codesignal.com/arcade/code-arcade/intro-gates/bszFiQAog96G9CXKg
fun solution(nCols: Int, nRows: Int, col: Int, row: Int): Int {
    val colBehindMe = (col - nCols)*(-1)
    val rowsBehindMe = (row - nRows)*(-1)
    return (rowsBehindMe*colBehindMe)+(nRows-row)
}
