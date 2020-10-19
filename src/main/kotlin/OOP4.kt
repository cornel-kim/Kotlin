class mammal{
    private var name:String = ""
    private var cover:String = ""
    private var walk:String = ""
    fun Person(name:String, cover:String, walk:String ){

        val brain:String = "Intelligent"
        val food:String = "Omnivore"
        println("The organism is a $name, it has $cover and walks on 2 $walk ,it is $brain and it is an $food")
    }

}
fun main(){
    val animal = mammal()
    animal.Person(name = "Mammal", cover = "Fur", walk = "legs")
}