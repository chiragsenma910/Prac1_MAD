fun main(args: Array<String>) {
    print("Enter the NUmber:-")
    val number = readln().toInt()
    val result: Int
    result = factorial(number)
    println("Factorial of $number = $result")
}

tailrec fun factorial(n: Int,temp:Int=1): Int {
    return if(n == 1){
        temp
    }
    else{
        factorial(n-1,temp*n)
    }
}
