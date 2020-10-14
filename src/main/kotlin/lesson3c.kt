//nested if else statement
import java.util.Scanner
fun main(){
    val scanner = Scanner(System.`in`)
    println("Enter your temperature")
    val temp = scanner.nextFloat()
    if (temp> 37.2){
//        println("Might have corona")

        val scanner1 = Scanner(System.`in`)
        println("Enter your signs")
        val cough:String = scanner1.nextLine()
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