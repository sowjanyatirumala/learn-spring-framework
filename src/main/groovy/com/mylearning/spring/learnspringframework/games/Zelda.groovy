package com.mylearning.spring.learnspringframework.games

import org.springframework.stereotype.Component

@Component
class Zelda implements GamingConsole {

    void moveUp() {
        System.out.println("Fly Zelda!")
    }
    void moveDown() {
        System.out.println("Get down Zelda!")
    }

    void moveLeft() {
        System.out.println("Go to the left Zelda!")
    }

    void moveRight() {
        System.out.println("Move forward Zelda!")
    }

    void eatFood() {
        System.out.println("Eat!")
    }
}
