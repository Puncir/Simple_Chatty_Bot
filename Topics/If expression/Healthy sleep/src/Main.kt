fun main() {    
    val aHours = readln().toInt()
    val bHours = readln().toInt()
    val hHours = readln().toInt()

    if (hHours in aHours..bHours) {
        println("Normal")
    } else if (hHours < aHours) {
        println("Deficiency")
    } else if (hHours > bHours) {
        println("Excess")
    }

}