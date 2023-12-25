import org.example.CYAN_BOLD
import org.example.CYAN_UNDERLINED
import org.example.RED_BOLD
import org.example.YELLOW
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
            println(RED_BOLD + "ERROR" + YELLOW)
        }else{
            valor = scan.nextInt()

            if(valor < pMin || valor > pMax){
                println(RED_BOLD + "ERROR" + YELLOW)
                correctType = false
            }
        }

        scan.nextLine()

    }while(!correctType)
    return valor
}

fun menu(){

    println("Benvingut al programa")
    println("Aqui podràs saber el preu actual de la teva furgo!")
    ascii()
}

fun llegirSoloNumero(scanner: Scanner): Int {
    while (true) {
        val input = scanner.next()

        try {
            return input.toInt()
        } catch (e: NumberFormatException) {
            print("Si us plau, introdueix un nombre vàlid. " + CYAN_BOLD + CYAN_UNDERLINED + "(No lletres!)" + YELLOW + ": ")
        }
    }
}

fun ascii() {
    println(
        CYAN_BOLD +  " ____  ______ _   ___      _______ _   _  _____ _    _ _______ _____ \n" +
            "|  _ \\|  ____| \\ | \\ \\    / /_   _| \\ | |/ ____| |  | |__   __/ ____|\n" +
            "| |_) | |__  |  \\| |\\ \\  / /  | | |  \\| | |  __| |  | |  | | | (___  \n" +
            "|  _ <|  __| | . ` | \\ \\/ /   | | | . ` | | |_ | |  | |  | |  \\___ \\ \n" +
            "| |_) | |____| |\\  |  \\  /   _| |_| |\\  | |__| | |__| |  | |  ____) |\n" +
            "|____/|______|_| \\_|   \\/   |_____|_| \\_|\\_____|\\____/   |_| |_____/ ")
    print(YELLOW)
}