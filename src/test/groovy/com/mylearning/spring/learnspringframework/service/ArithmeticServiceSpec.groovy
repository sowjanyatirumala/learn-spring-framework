package com.mylearning.spring.learnspringframework.service

import spock.lang.Specification

class ArithmeticServiceSpec extends Specification {

    private ArithmeticService arithmeticService = new ArithmeticService()

    def "calculate sum - happy path"() {
        expect:
        arithmeticService.calculateSum(a, b) == expectedSum

        where:
        a  | b  || expectedSum
        1  | 0  || 1
        -1 | 1  || 0
        2  | 3  || 5
        -4 | -2 || -6
    }

    def "calculateDifference - happy path"() {
        expect:
        arithmeticService.calculateDifference(a, b) == expectedDifference

        where:
        a  | b  || expectedDifference
        1  | 0  || 1
        -1 | 1  || -2
        1  | 1  || 0
        -4 | -2 || -2
    }

    def "multiply - happy path"() {
        expect:
        arithmeticService.multiply(a, b) == expectedProduct

        where:
        a  | b  || expectedProduct
        1  | 0  || 0
        -1 | 1  || -1
        1  | 1  || 1
        -4 | -2 || 8
    }

    def "divide - divide by zero exception"() {
        when:
        arithmeticService.divide(1, 0)

        then:
        def errorThrown = thrown(ArithmeticException)
        errorThrown.class == ArithmeticException.class
        errorThrown.message == "Division by zero"
    }

    def "divide - happy path"() {
        expect:
        arithmeticService.divide(a, b) == expectedQuotient

        where:
        a  | b  || expectedQuotient
        0  | 2  || 0
        -1 | 1  || -1
        1  | 1  || 1
        -4 | -2 || 2
    }

    def "calculateMod - divide by zero exception"() {
        when:
        arithmeticService.calculateMod(1, 0)

        then:
        def errorThrown = thrown(ArithmeticException)
        errorThrown.class == ArithmeticException.class
        errorThrown.message == "/ by zero"
    }

    def "calculateMod - happy path"() {
        expect:
        arithmeticService.calculateMod(a, b) == expectedRemainder

        where:
        a  | b  || expectedRemainder
        -1 | 1  || 0
        1  | 1  || 0
        -4 | -2 || 0
        5  | 2  || 1
    }

    def "calculateSumOfArrayElements"() {
        given:
        def numbers = [1, 2, 3, -4, 5, 0]

        expect:
        arithmeticService.calculateSumOfArrayElements(numbers) == 7
    }
}
