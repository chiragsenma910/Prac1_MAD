fun main() {
    fun sum(a: Int , b: Int , c: Int): Int {
        return a + b + c
    }
    fun sub(a: Int , b: Int , c: Int): Int {
        return a - b -c
    }
    fun mul(a: Int , b: Int , c: Int): Int {
        return a * b * c
    }
    fun div(a: Int , b: Int ): Int {
        return a / b
    }
    println("enter the first number:- ")
    var x = readln().toInt()
    println("enter the first number:- ")
    var y = readln().toInt()
    println("enter the third number:- ")
    var z = readln().toInt()


    println("\n The Addition of  number is:-  " +sum(x,y,z))
    println("\n The Subtraction of three number is:- " +sub(x,y,z))
    println("\n The Multiplication of three number is:- " +mul(x,y,z))
    println("\n The Division of three number is:- " +div(x,y))

}