//if else and else if statements
fun main(){
    val studenName:String = " John"
    val studentMarks:Int = 400
    if (studentMarks in 1..250){
        println("Student scored below average hence repeat")
    }
    else if (studentMarks in 260..300){
        println("Student scored above average hence join local school")
    }
    else if(studentMarks in 301..350){
        println("Student to join county school")
    }
    else if (studentMarks in 351..400){
        println("student to join extra county school")
    }
    else if (studentMarks in 401..500){
        println("Join a national school")
    }
    else{
        print("input valid marks")
    }
}