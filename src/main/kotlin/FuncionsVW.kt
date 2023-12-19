import java.util.*

    fun calcularPreuBase(fullEquip: Boolean): Double {
        return when (fullEquip) {
            false -> 30000.0 // Precio base para el modelo normal
            true -> 40000.0 // Precio base para el modelo Full Equip
        }
    }

    fun calcularPreuActual(preuBase: Double, kmFurgo: Int, estatPneumatics: String): Double {
        var preuActual: Double = preuBase

        // Depreciación por kilómetros
        when {
            kmFurgo in 0..5000 -> preuActual.toDouble()
            kmFurgo in 5000..10000 -> preuActual -= 200
            kmFurgo > 10000 -> preuActual -= 300
            else -> println("ERROR")
        }

        // Descuento según el estado de los neumáticos
        return when (estatPneumatics) {
            "Horrible" -> preuActual - 500.0
            "Millorable" -> preuActual - 400.0
            "Be" -> preuActual - 300.0
            "Molt be" -> preuActual - 200.0
            "Perfecte" -> preuActual - 100.0
            else -> preuActual
        }
    }