import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)

    // Menu del programa
    menu()
    println("La teva furgo es una Volkswagen Grand California, molt maca!")

    // Model Furgoneta
    var fullEquip: Boolean = false
    do {
        print("Es la Camper Full Equip? ('true' o 'false'): ")
        val modelFurgo: String = readln().lowercase(Locale.getDefault())

        if (modelFurgo == "false")fullEquip=false
        if (modelFurgo == "true")fullEquip=true

    } while (modelFurgo !in listOf("true", "false"))




    // Preguntem els quilometres recorreguts de la furgoneta
    println("Quants quilometres correguts te la teva furgo?: ")
    val kmFurgo: Int = scanner.nextInt()


    // Preguntem l'estat dels pneumatics
    var estatPneumatics: String
    do {
        print("Introdueix l'estat dels pneumàtics ('menys5000', 'menys10000', '10000omés'): ")
        estatPneumatics = scanner.nextLine()
    } while (estatPneumatics !in listOf("menys5000", "menys10000", "10000omés"))

    // Resultats
    val preuFurgonetaBase = calcularPreuBase(fullEquip)
    val preuFurgonetaFinal = calcularPreuActual(preuFurgonetaBase, kmFurgo, estatPneumatics)

    println("Resultats!!!")
    println("El preu BASE de la teva furgoneta es $preuFurgonetaBase!")
    println("El preu FINAL de la teva furgoneta es $preuFurgonetaFinal!")

}
