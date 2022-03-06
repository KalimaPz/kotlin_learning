
fun add( x:Number , y:Number)  :Double {
    return x.toDouble() + y.toDouble();
}


fun extractStudentId(studentId:String) : Array<String>{
// 59 35512 007
    var result : Array<String> = arrayOf()

    result += studentId.substring(0,2)
    result += studentId.substring(2,7)
    result += studentId.substring(7,10)

    return result
}

fun main() {
    var greeting : String = "Hello World!" // variable
    val constantNumber : Int = 1200 // immutable data
    val pi : Double = 3.1415
    val constString : String = "Hello Kotlin"
    println(greeting)
    println(constantNumber)
  for ( i in 3..5 ) {
    println(i)
    }

    println("Result : "+ add(3,2))

 extractStudentId("5935512007").forEach {
     println("$it")  // String template
 }
}