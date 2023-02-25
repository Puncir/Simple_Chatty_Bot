fun main() {
    val first = readln().toInt()
    val second = readln().toInt()
    val third = readln().toInt()
    val fourth = readln().toInt()
    val middle = readln().toInt()
    println(middle in first..second || middle in third..fourth)
}