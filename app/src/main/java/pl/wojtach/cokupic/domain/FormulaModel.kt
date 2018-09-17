package pl.wojtach.cokupic.domain

class FormulaModel(id: Long, private val getCurrentTimestamp: () -> Long = System::currentTimeMillis) {

    var snapshot: FormulaSnapshot = createNewState(id)
        private set

    private fun createNewState(id: Long): FormulaSnapshot {
        return FormulaSnapshot(
            id = id,
            timestamp = getCurrentTimestamp(),
            name = "",
            description = "",
            products = emptySet()
        )
    }
}