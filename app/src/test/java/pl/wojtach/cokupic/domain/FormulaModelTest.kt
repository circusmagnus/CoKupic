package pl.wojtach.cokupic.domain

import org.amshove.kluent.shouldEqual
import org.junit.Test

class FormulaModelTest {

    @Test
    fun `Get Snapshot on fresh FormulaModel returns snapshot with empty values, given id and timestamp from creation time`() {
        val testId = 1L
        val testTime = 2L
        val formulaModel = FormulaModel(testId) { testTime }

        formulaModel.snapshot shouldEqual FormulaSnapshot(
            id = testId,
            name = "",
            description = "",
            products = emptySet(),
            timestamp = testTime
        )
    }
}