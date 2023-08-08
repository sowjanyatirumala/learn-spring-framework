package com.mylearning.spring.learnspringframework.games

import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component

@Component
@Primary
class SuperMario implements GamingConsole {
    void moveUp() {
        System.out.println("Jump Mario!")
    }
    void moveDown() {
        System.out.println("Get into the hole Mario!")
    }
    void moveLeft() {
        System.out.println("Go back Mario!")
    }
    void moveRight() {
        System.out.println("Move forward Mario!")
    }
    void findLuigi() {
        System.out.println("Find Luigi!")
    }
}
