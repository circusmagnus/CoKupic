package pl.wojtach.cokupic.domain

data class FormulaSnapshot(
    val id: Long,
    val timestamp: Long,
    val name: String,
    val description: String,
    val products: Set<Product>
)