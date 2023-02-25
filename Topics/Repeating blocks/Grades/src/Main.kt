fun main() {
    val students = readln().toInt()
    var dGrad = 0
    var cGrad = 0
    var bGrad = 0
    var aGrad = 0
    repeat(students){
        val grades = readln().toInt()
        dGrad = if (grades == 2) ++dGrad else dGrad
        cGrad = if (grades == 3) ++cGrad else cGrad
        bGrad = if (grades == 4) ++bGrad else bGrad
        aGrad = if (grades == 5) ++aGrad else aGrad
    }
    println("$dGrad $cGrad $bGrad $aGrad")
}