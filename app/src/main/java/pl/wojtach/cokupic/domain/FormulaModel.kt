package pl.wojtach.cokupic.domain

class FormulaModel {

    var snapshot = FormulaSnapshot(
        id = -1,
        timestamp = System.currentTimeMillis(),
        name = "",
        description = "",
        products = emptyList()
    )
}