package pl.wojtach.cokupic.domain

data class Product(
    val id: Long,
    val name: String,
    val quantity: Quantity,
    val location: Location?
)

sealed class Quantity {
    object None : Quantity()
    data class Undefined(val value: Int) : Quantity()
    data class Items(val value: Int) : Quantity()
    data class Grammes(val value: Int) : Quantity()
    data class Kilogrammes(val value: Int) : Quantity()
    data class Litres(val value: Int) : Quantity()
    data class Custom(val value: Int, val name: String) : Quantity()
}

sealed class Location {
    data class ByCoordinates(val longitude: Double, val latitude: Double) : Location()
    data class ByName(val name: String) : Location()
}