package com.mylearning.spring.learnspringframework.games

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class GameRunner {

    @Autowired
    private GamingConsole game

    GameRunner(GamingConsole game) {
        this.game = game
    }

    void run() {
        game.moveRight()
        game.moveUp()
        game.moveRight()
        game.moveLeft()
        game.moveDown()
    }
}
