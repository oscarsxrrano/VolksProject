fun main() {
    val funcionsVW = FuncionsVW()
    val funcionsEntrada = FuncionsEntrada()

    println("Benvingut a la calculadora de preus de Volkswagen Grand California!")
    print("Introdueix el model ('normal' o 'fullEquip'): ")
    val model = readLine()

    if (model != null) {
        val preuBase = funcionsVW.calcularPreuBase(model)

        print("Introdueix els quilòmetres recorreguts: ")
        val quilometres = funcionsEntrada.llegirLong()

        print("Introdueix l'estat dels pneumàtics ('menys5000', 'menys10000', '10000omés'): ")
        val estatPneumatics = readLine()

        if (estatPneumatics != null) {
            val preuActual = funcionsVW.calcularPreuActual(preuBase, quilometres, estatPneumatics)

            println("Preu base original de la furgo: $preuBase €")
            println("Preu actual de la furgo: $preuActual €")
        } else {
            println("Estat dels pneumàtics no vàlid.")
        }
    } else {
        println("Model no vàlid.")
    }
}
