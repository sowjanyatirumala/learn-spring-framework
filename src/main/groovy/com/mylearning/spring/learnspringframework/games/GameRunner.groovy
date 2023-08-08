package com.mylearning.spring.learnspringframework.games

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class GameRunner {

//    @Autowired - commented to be taken care of by constructor injection
    private GamingConsole game

    //constructor injection
    @Autowired
    GameRunner(GamingConsole game) {
        System.out.println("GamingConsole is wired using constructor injection")
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
