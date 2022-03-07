
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


fun foo() { // void function
    println("Hello Foo")
}

fun bar(x : Number) : Int { // returned function

    return x.toInt() * 2
}

fun printWithStringTemplate(count : Int) {
    if(count >= 1) {

        if(count == 1) {
            print("There is one item")
        } else {
            println("There are $count items")
        }
    } else {
        println("Item must more than 0")
    }


}

fun printFruits(fruits : Array<String>) {
            fruits.forEach {
            print("$it ")
        }
}

fun main() {

//    var greeting : String = "Hello World!" // variable
    var  greeting2 : String? = null;
    val constantNumber : Int = 1200 // immutable data
    val pi : Double = 3.1415
    val constString : String = "Hello Kotlin"
    println(greeting)
    println(constantNumber)
  for ( i in 3..5 ) {
    println(i)
    }

    println("Result : "+ add(3,2))

// extractStudentId("5935512007").forEach {
//     println("$it")  // String template
// }.
    val fruits : Array<String> = arrayOf("Apple","Banana","Kiwi","Nectarine")
   var greeting : String? = "test"
    var result : String = when(greeting) {
        // like a switch case
        null -> "Greeting is NULL"
        "test" -> "This is a test"
        else -> "Greeting is not NULL"
    }



//    println(result)
//    foo()
//    println(bar(10))
//    printWithStringTemplate(count = 1)

//        fruits.forEach {
//            print("$it ")
//        }

    printFruits(fruits)

}