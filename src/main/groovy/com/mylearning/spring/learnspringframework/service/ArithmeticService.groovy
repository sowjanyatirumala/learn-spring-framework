package com.mylearning.spring.learnspringframework.service

import org.springframework.stereotype.Component

@Component
class ArithmeticService {

    int calculateSum(int a, int b) {
        return a + b
    }

    int calculateDifference(int a, int b) {
        return a - b
    }

    long multiply(int a, int b) {
        return a * b
    }

    BigDecimal divide(int a, int b) {
        return a / b
    }

    int calculateMod(int a, int b) {
        return a % b
    }

    long calculateSumOfArrayElements(List<Integer> numbersList) {
        return numbersList.stream().reduce(Integer::sum).get()
    }
}
