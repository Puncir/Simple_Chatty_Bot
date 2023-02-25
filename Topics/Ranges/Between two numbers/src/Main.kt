fun main() {
    val middle = readln().toInt()
    val first = readln().toInt()
    val second = readln().toInt()
    println(middle in first..second)
}