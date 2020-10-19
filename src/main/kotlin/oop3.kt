class Arithmetic{
    //properties, data members
    private val x : Int = 5
    private val y : Int = 3
//member functions = we have 3 of them ... add(), subtract(),product()
    fun add(){
        val sum: Int = x + y
        println("The sum is "+sum)
    }//end add()
    fun substract(){
        val minus: Int = x - y
        println("The subtraction is "+minus)
    }//end substract()
    fun product(){
        val answer: Int = x * y
        println("The multiplication is $answer")
    }//end product()
    fun division(){
        val answer:Int = x/y
        println("The division is $answer")
    }
}//end arithmetic class
fun main(args: Array<String>) {
//create an Arithmetic object
    val arithmetic_object = Arithmetic()
//use the arithmetic_object to access all functions
    arithmetic_object.add()
    arithmetic_object.substract()
    arithmetic_object.product()
    arithmetic_object.division()
}// END MAIN