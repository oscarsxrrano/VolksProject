import java.util.*

fun calcPerc(pTotal : Int, pNoies : Int, pNois : Int) : Array<Float>{
    var percNois : Float = 0.0f
    var percNoies : Float = 0.0f
    var percentatges : Array<Float>

    percNois = pNois / pTotal.toFloat() * 100
    percNoies = pNoies / pTotal.toFloat() * 100
    percentatges = arrayOf(percNois, percNoies)

    return percentatges
}

fun readInt(pMessage : String, pMin : Int, pMax : Int) : Int{
    var valor : Int = 0
    val scan : Scanner = Scanner(System.`in`)
    var correctType : Boolean = false

    do{
        println(pMessage)
        correctType = scan.hasNextInt()

        if(!correctType){
            println("ERROR")
        }else{
            valor = scan.nextInt()

            if(valor < pMin || valor > pMax){
                println("ERROR")
                correctType = false
            }
        }

        scan.nextLine()

    }while(!correctType)
    return valor
}

fun menu(){
    println("Benvingut al programa")
    println("Aqui podràs saber el preu actual de la teva furgo!\n")
}