class Payroll{
    private var basic: Double = 24000.0
    private var allowance: Double = 2000.0
    private var tax: Double = 3444.0
    private var name: String = "Hassan"
    // member function
    fun findGross() {
        val gross: Double = (basic + allowance) - tax
        println("Your name was: "+ name)
        println("Gross Pay is: "+ gross)
    }//end function
}
fun main(){
// create object of Payroll class
    val payroll_object = Payroll()
//using the object created call findGross() function
    payroll_object.findGross()
}