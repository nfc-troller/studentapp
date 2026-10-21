//fun main() {
//    println("enter a percentage ")
//    val percentage = readLine()!!.toInt()
//
//    val grade = when (percentage) {
//        in 70..100 -> "A"
//        in 60..69  -> "B"
//        in 50..59  -> "C"
//        in 40..49  -> "D"
//        in 30..39  -> "E"
//        in 0..29   -> "F"
//        else       -> "Error - invalid percentage"
//    }
//
//    println(grade)

//}
class Student(
    val name: String,
    var mark: Int
) {
    fun getGrade(): String {
        return when (mark) {
            in 70..100 -> "First"
            in 60..69  -> "2/1"
            in 50..59  -> "2/2"
            in 40..49  -> "Third"
            in 0..39   -> "Fail"
            else       -> "Error - invalid mark"
        }
    }
}

fun main() {
    val student = Student("Alice", 65)
    println("${student.name}'s Grade: ${student.getGrade()}")
}