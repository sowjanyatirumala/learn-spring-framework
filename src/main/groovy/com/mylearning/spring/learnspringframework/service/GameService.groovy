package com.mylearning.spring.learnspringframework.service

import org.springframework.stereotype.Component

@Component
class GameService {
    String getAvailableGameList() {
         return "Super Mario, Zelda, Space Walk"
    }
}
