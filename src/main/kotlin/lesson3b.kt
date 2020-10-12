//if else and else if statements
fun main(){
    val studenName:String = " John"
    val studentMarks:Int = 400
    if (studentMarks > 0 && studentMarks <= 250){
        println("Student scored below average hence repeat")
    }
    else if (studentMarks>259 && studentMarks<=300){
        println("Student scored above average hence join local school")
    }
    else if(studentMarks>300 && studentMarks<=350){
        println("Student to join county school")
    }
    else if (studentMarks> 350 && studentMarks <= 400){
        println("student to join extra county school")
    }
    else if (studentMarks > 400 && studentMarks <=500){
        println("Join a national school")
    }
    else{
        print("input valid marks")
    }
}