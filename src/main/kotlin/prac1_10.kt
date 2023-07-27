class Car(
    val type: String = "Sedan",
    val model: String = "Honda Civic",
    val price: Int = 20000,
    val owner: String = "John Doe",
    val milesDriven: Int = 0
) {

    fun getCarPrice(): Int {
        return price
    }

    fun getCarInformation(): String {
        return "Car type: ${type}, model: ${model}, price: ${price}, owner: ${owner}, miles driven: ${milesDriven}"
    }

    fun getOriginalCarPrice(): Int {
        return price
    }

    fun getCurrentCarPrice(): Int {
        val currentCarPrice = price - (price * milesDriven / 100000)
        return currentCarPrice
    }

    fun displayCarInfo() {
        println(getCarInformation())
    }
}

fun main() {
    // Create a car object
    val car = Car(
        type = "Sedan",
        model = "Honda Civic",
        price = 20000,
        owner = "John Doe",
        milesDriven = 50000
    )

    // Get the car price
    println(car.getCarPrice())

    // Get the car information
    println(car.getCarInformation())

    // Get the original car price
    println(car.getOriginalCarPrice())

    // Get the current car price
    println(car.getCurrentCarPrice())

    // Display the car information
    car.displayCarInfo()
}
