import java.util.*

    fun calcularPreuBase(fullEquip: Boolean): Double {
        return when (fullEquip) {
            false -> 30000.0 // Precio base para el modelo normal
            true -> 40000.0 // Precio base para el modelo Full Equip
        }
    }

    fun calcularPreuActual(preuBase: Double, kmFurgo: Int, estatPneumatics: String, portabicis: Boolean, anysFurgo: Int): Double {
        var preuActual: Double = preuBase

        // Suma de valor amb portabicis
        preuActual += when (portabicis) {
            true -> 250
            false -> 0
        }

        // Depreciación por quilómetros
        when {
            kmFurgo in 0..5000 -> preuActual.toDouble()
            kmFurgo in 5000..10000 -> preuActual -= 200
            kmFurgo > 10000 -> preuActual -= 300
            else -> println("ERROR")
        }

        // Descuento según el estado de los neumáticos
        when (estatPneumatics) {
            "horrible" -> preuActual -= 500.0
            "millorable" -> preuActual -= 400.0
            "be" -> preuActual -= 300.0
            "molt be" -> preuActual -= 200.0
            "perfecte" -> preuActual -= 100.0
        }

        // Descuento extra segun la edad de la furgoneta y los quilometros
        val perdidaPorEdad = when {
            anysFurgo in 6..10 -> 0.0002
            anysFurgo > 10 -> 0.0004
            else -> 0.0
        }

        val perduaExtraKM = perdidaPorEdad * kmFurgo
        preuActual = preuBase - preuBase * perduaExtraKM.toDouble()

        return preuActual
    }