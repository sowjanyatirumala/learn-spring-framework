package com.mylearning.spring.learnspringframework.web

import com.mylearning.spring.learnspringframework.service.ArithmeticService
import com.mylearning.spring.learnspringframework.service.GameService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class MyWebController {

    @Autowired
    private ArithmeticService arithmaticService

    @Autowired
    private GameService gameService

    Long getSumOfArrayElements(List<Integer> numbersList) {
        return arithmaticService.calculateSumOfArrayElements(numbersList)
    }

    String getAvailableGameList() {
        return gameService.availableGameList
    }

}
