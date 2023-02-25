fun main() {
    val number = readln().toInt()
    for (i in 1..number){
        if (i * i <= number){
            println(i * i)
        } else break
    }
}