//10. Write Different types of Class & Constructor. Create a class Car and set various members like type, model, price, owner, milesDrive. add the function getCarPrice in it.
// Create an object of Car class and access property of it. (getCarInformation(), getOriginalCarPrice(), getCurrentCarPrice(), displayCarInfo() etc.)

//10.1 Creating class using primary constructor
class Car1 (var type: String, var name: String, var model: String, var price: String, var owner: String, var milesDrive: String){
    fun displayCarInfo(){
        println("\n------Car-1 Information------")
        println("Type: $type")
        println("Name: $name")
        println("Model: $model")
        println("Owner name: $owner")
        println("Miles drove: $milesDrive")
    }
}

//10.2 Creating class using primary constructor with 'init' block
class Car2{
    var type = ""
    var name = ""
    var model = ""
    var price = ""
    var owner = ""
    var milesDrive = ""
    init{
        println("\nEnter the details of car-2")
        print("Enter vehicle type: ")
        type = readln()
        print("Enter name: ")
        name = readln()
        print("Enter model: ")
        model = readln()
        print("Enter owner name: ")
        owner = readln()
        print("Enter price: ")
        price = readln()
        print("Enter mileDrove: ")
        milesDrive = readln()
    }
    fun displayCarInfo(){
        println("\n------Car-2 Information------")
        println("Type: $type")
        println("Name: $name")
        println("Model: $model")
        println("Owner name: $owner")
        println("Miles drove: $milesDrive")
    }
}
//10.3 Creating class using secondary constructor using 'constructor' keyword
class Car3{
    var type = ""
    var name = ""
    var model = ""
    var price = ""
    var owner = ""
    var milesDrive = ""

    constructor (type: String,name: String,model: String,price: String,owner: String,milesDrive: String){
        this.type = type
        this.name = name
        this.model = model
        this.price = price
        this.owner = owner
        this.milesDrive = milesDrive
    }
    fun getCarPrice(){
        println("Price: $price")
    }
    fun displayCarInfo(){
        println("\n------Car-3 Information------")
        println("Type: $type")
        println("Name: $name")
        println("Model: $model")
        println("Owner name: $owner")
        println("Miles drove: $milesDrive")
    }
}
fun main(args: Array<String>) {
    var c1 = Car1("4-Wheeler","Kia","Hybrid","1200000","chirag","12000")
    c1.displayCarInfo()

    var c2 = Car2()
    c2.displayCarInfo()

    var c3 = Car3("4-Wheeler","Alcazar","XUV","2300000","Vansh","12000")
    c3.displayCarInfo()
    c3.getCarPrice()
}
