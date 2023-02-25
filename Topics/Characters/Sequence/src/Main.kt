fun main() {
    val first = readln().first()
    val second = readln().first()
    val third = readln().first()
    if (first + 1 == second && second + 1 == third) println(true)
    else println(false)
}