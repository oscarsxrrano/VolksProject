/**
 * This program calculates a van price with its properties using java.util.Scanner
 * @author oscarsxrrano
 * @since 26/12/2023
 * @return preuFurgonetaBase preuFurgonetaFinal
 */

import org.example.*
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    // Menu del programa
    /**
     * Program menu
     * @author oscarsxrrano
     * @since 26/12/2023
     * @return println
     */

    print(YELLOW_BOLD_BRIGHT + BLACK_BACKGROUND)
    menu()
    print(RESET + YELLOW)
    println("\nLa teva furgo es una Volkswagen Grand California, molt maca!")
    print(RESET + YELLOW)

    // Model Furgoneta
    /**
     * Here you calculate if the van is normal or Full-Equip
     * @author oscarsxrrano
     * @since 26/12/2023
     * @param fullEquip A Boolean parameter
     */

    var fullEquip: Boolean = false
    do {
        print("Es la Camper Full Equip? " + CYAN_BOLD + CYAN_UNDERLINED + "('true' o 'false')" + YELLOW + ": ")
        val modelFurgo: String = readln().lowercase(Locale.getDefault())

        if (modelFurgo == "false")fullEquip=false
        if (modelFurgo == "true")fullEquip=true

    } while (modelFurgo !in listOf("true", "false"))
    println()

    // Portabicis
    /**
     * Here you calculate if the van can carry a bike or not
     * @author oscarsxrrano
     * @since 26/12/2023
     * @param portabicis A Boolean parameter that says if the van has a bike
     */

    var portabicis: Boolean = false
    do {
        print("La furgoneta te portabicis? " + CYAN_BOLD + CYAN_UNDERLINED + "('true' o 'false')" + YELLOW + ": ")
        val biciSiONo: String = readln().lowercase(Locale.getDefault())

        if (biciSiONo == "false")portabicis=false
        if (biciSiONo == "true")portabicis=true

    } while (biciSiONo !in listOf("true", "false"))
    println()

    // Preguntem els quilometres recorreguts de la furgoneta
    /**
     * Here you calculate the kilometers traveled
     * @author oscarsxrrano
     * @since 26/12/2023
     * @param kmFurgo Int parameter that says the van kilometers
     */

    var kmFurgo: Int

    do {
        print("Quants quilòmetres correguts té la teva furgo?: ")
        kmFurgo = llegirSoloNumero(scanner)

    } while (kmFurgo < 0)

    // Preguntem l'estat dels pneumatics
    /**
     * Here you calculate the tire condition
     * @author oscarsxrrano
     * @since 26/12/2023
     * @param estatPneumatics String parameter that says the tire condition
     */

    var estatPneumatics: String
    do {
        println()
        print("Introdueix l'estat dels pneumàtics. \nOpcions: " + CYAN_BOLD + CYAN_UNDERLINED + "('horrible', 'millorable', 'be', 'molt be', 'perfecte')" + RESET + YELLOW + ": ")
        estatPneumatics = readln().lowercase(Locale.getDefault())
    } while (estatPneumatics !in listOf("horrible", "millorable", "be", "molt be", "perfecte"))

    // Anys de la furgoneta i altra perdua de valor depenent l'any
    /**
     * Here you calculate the age of the van
     * @author oscarsxrrano
     * @since 26/12/2023
     * @param anysFurgo Int parameter that says the age of the van
     */

    println()
    var anysFurgo: Int

    do {
        print("Quants anys té la teva furgo?: ")
        anysFurgo = llegirSoloNumero(scanner)

    } while (anysFurgo < 0)

    // Resultats
    val preuFurgonetaBase = calcularPreuBase(fullEquip)
    val preuFurgonetaFinal = calcularPreuActual(preuFurgonetaBase, kmFurgo, estatPneumatics, portabicis, anysFurgo)

    println("\n" + PURPLE_BOLD + "Resultats!!!")
    println("El preu BASE de la teva furgoneta es " + GREEN_BOLD_BRIGHT + "$preuFurgonetaBase" + PURPLE_BOLD + "! ")
    println("El preu FINAL de la teva furgoneta es " + GREEN_BOLD_BRIGHT + "$preuFurgonetaFinal" + PURPLE_BOLD + "! ")
}
