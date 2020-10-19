import kotlin.math.sqrt

//classes

class Triangle{//header
    //body
    private var base: Double = 2.4
    private var height: Double = 5.4

    fun findArea() {
        println("This is finding area functions running...")
        val area: Double = 0.5 * base * height
        println("The area is "+ area)
    }
    fun findPerimeter() {
        println("This is finding perimeter functions running...")
        val perimeter: Double =sqrt((base * base) + (height * height)) + base + height
        println("The perimter is "+ perimeter)
    }
}
fun main(args: Array<String>) {
//we create an object using val,
//we initialize it to Triangle class.
// create object of Triangle class
    val triangle_object = Triangle()
//using the created object we call findArea() function
    triangle_object.findArea()
    triangle_object.findPerimeter()
}//end ma