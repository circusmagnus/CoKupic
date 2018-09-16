package pl.wojtach.cokupic.domain

import spock.lang.Specification

class FormulaModelTest extends Specification {

    def formulaModel = new FormulaModel()

    def "On class creation should have snapshot with empty everything"() {

        setup:
        def result = 0

        when:
        result = 2 + 2

        then:
        result == 5
    }
}
