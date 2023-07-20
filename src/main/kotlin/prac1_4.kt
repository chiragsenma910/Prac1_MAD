fun main() {
    print("enter a number: ")
    val num = readln().toInt()
    if (num != null)
        if (num % 2 == 0)
            println("$num is even")
        else
            println("$num is odd")
    else
        println("invalid input")
}