package com.mylearning.spring.learnspringframework.web

import com.mylearning.spring.learnspringframework.service.ArithmeticService
import com.mylearning.spring.learnspringframework.service.GameService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class MyWebController {

    private ArithmeticService arithmaticService

    //Field injection
    @Autowired
    private GameService gameService

    //Setter injection
    @Autowired
    void setArithmeticService(ArithmeticService arithmeticService) {
        System.out.println("ArithmeticService is wired using setter injection")
        this.arithmaticService = arithmeticService
    }

    Long getSumOfArrayElements(List<Integer> numbersList) {
        return arithmaticService.calculateSumOfArrayElements(numbersList)
    }

    String getAvailableGameList() {
        System.out.println("GameService is wired using field injection")
        return gameService.availableGameList
    }

}
