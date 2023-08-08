package com.mylearning.spring.learnspringframework

import com.mylearning.spring.learnspringframework.games.GameRunner
import com.mylearning.spring.learnspringframework.web.MyWebController
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.ConfigurableApplicationContext

@SpringBootApplication
class LearnSpringFrameworkApplication {

	static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication, args)

		GameRunner runner = context.getBean(GameRunner.class)
		runner.run()

		MyWebController controller = context.getBean(MyWebController.class)
		System.out.println("Sum of array elements: " + controller.getSumOfArrayElements([1, 2, 3, 4]))
		System.out.println("Available games: " + controller.getAvailableGameList())
	}

}
