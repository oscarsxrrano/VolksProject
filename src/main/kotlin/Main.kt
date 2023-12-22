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
    println()



    // Preguntem els quilometres recorreguts de la furgoneta
    var kmFurgo: Int

    do {
        print("Quants quilòmetres correguts té la teva furgo?: ")
        while (!scanner.hasNextInt()) {
            println("Si us plau, introdueix un nombre vàlid. (No lletres!)")
            scanner.next()
        }
        kmFurgo = scanner.nextInt()
    } while (kmFurgo < 0)

    // Preguntem l'estat dels pneumatics
    var estatPneumatics: String
    do {
        println()
        print("Introdueix l'estat dels pneumàtics. \nOpcions: ('horrible', 'millorable', 'be', 'molt be', 'perfecte'): ")
        estatPneumatics = readln().lowercase(Locale.getDefault())
    } while (estatPneumatics !in listOf("horrible", "millorable", "be", "molt be", "perfecte"))

    // Resultats
    val preuFurgonetaBase = calcularPreuBase(fullEquip)
    val preuFurgonetaFinal = calcularPreuActual(preuFurgonetaBase, kmFurgo, estatPneumatics)

    println("Resultats!!!")
    println("El preu BASE de la teva furgoneta es $preuFurgonetaBase!")
    println("El preu FINAL de la teva furgoneta es $preuFurgonetaFinal!")

}
