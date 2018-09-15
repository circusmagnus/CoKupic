package pl.wojtach.cokupic.domain

data class Formula(
    val id: Long,
    val timestamp: Long,
    val name: String,
    val description: String,
    val products: Set<Product>
)