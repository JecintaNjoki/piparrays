fun main() {
    students()
    areas()
    numbers()
    println(namearrays("Walter","Meshack","Prudence"))

}
fun students(){
    val students= arrayOf("Julie","Danny","Collins","Brandon","Abel")
    println(students.contentToString())

}
fun areas() {
    var areas = arrayOf("ngumo","langata","westlands","karen")
    areas.forEach { area-> println(area.capitalize()) }

}
fun numbers() {
    var arrayofnums = arrayOf(72, 77, 14, 133, 28, 93, 50, 39, 13, 53, 41, 118, 22)
    println(arrayofnums[1] + arrayofnums[4])
    println(arrayofnums.indexOf(133))
    println(arrayofnums.sort())
    println(arrayofnums.contentToString())
}

fun namearrays(x: String,y: String,z: String): String{
    var nameStudents= arrayOf(x,y,z)
    return nameStudents.contentToString()
}
