//nested if else statement
fun main(){
    val temp:Float = 37.5F
    if (temp> 37.2){
        println("Might have corona")
        val cough:String = "Coughing"
        if (cough == "$cough"){
            println("One sign of corona")
            val testLose:String = "lOST"
            if (testLose == "$testLose"){
                println("Confirmed Corona 19, please quarantine")
            }
            else{
                println("No signs")
            }
        }else{
            println("Check for other symptoms")
        }

    }
    else{
        println("Has no symptoms of corona")
    }
}