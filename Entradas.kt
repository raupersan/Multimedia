fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
	val edad=age
    var precio=0
    if (edad<13)
    	precio=15
    else if (edad>12 && edad<61){
        if (isMonday)
        precio=25
        else
        precio=30
    }
    else if (edad>60&& edad<100)
	    precio= 20
    else
    	precio=-1
    return precio
}
