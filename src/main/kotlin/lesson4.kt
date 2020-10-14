fun main(){
    val a:Int = 2 //set a variable
    when{
        a in 0..10 -> println("$a is less than 10")
        a==10 -> println("$a is equal to 10")
        a in 10..100 -> println("$a is greater than 10")
        else-> println("Invalid") //means above condition were not met
    }
//    val studenName:String = " John"
//    val studentMarks:Int = 400
//    when (studentMarks) {
//        in 1..250 -> println("Student scored below average hence repeat")
//        in 260..300 -> println("Student scored above average hence join local school")
//        in 301..350 -> println("Student to join county school")
//        in 351..400 -> println("student to join extra county school")
//        in 401..500 -> println("Join a national school")
//    }
}