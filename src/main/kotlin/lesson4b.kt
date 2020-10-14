fun main(args: Array<String>) {
    for (number in 1..50)
        if (number in 1..30){
            println("$number")
            continue
        }
    else{
            break
        }
}