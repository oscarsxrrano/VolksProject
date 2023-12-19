class FuncionsVW {

    fun calcularPreuBase(model: String): Double {
        return when (model) {
            "normal" -> 30000.0 // Precio base para el modelo normal
            "fullEquip" -> 40000.0 // Precio base para el modelo Full Equip
            else -> 0.0 // Modelo no válido
        }
    }

    fun calcularPreuActual(preuBase: Double, quilometres: Long, estatPneumatics: String): Double {
        var preuActual = preuBase

        // Depreciación por kilómetros
        preuActual -= (quilometres / 10000) * 500.0

        // Descuento según el estado de los neumáticos
        when {
            estatPneumatics == "menys5000" -> preuActual
            estatPneumatics == "menys10000" -> preuActual - 200.0
            else -> preuActual - 300.0
        }

        return preuActual
    }
}
