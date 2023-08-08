package com.mylearning.spring.learnspringframework.games

import org.springframework.stereotype.Component

@Component
class SpaceWalk implements GamingConsole {

    void moveUp() {
        System.out.println("Move forward!")
    }

    void moveDown() {
        System.out.println("Move back!")
    }

    void moveLeft() {
        System.out.println("Move left!")
    }

    void moveRight() {
        System.out.println("Move right!")
    }
}
