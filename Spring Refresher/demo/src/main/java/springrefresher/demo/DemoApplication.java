package springrefresher.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springrefresher.demo.game.ContraGame;
import springrefresher.demo.game.GameRunner;
import springrefresher.demo.game.MarioGame;
import springrefresher.demo.game.PacManGame;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
		MarioGame marioGame = new MarioGame();
		ContraGame contraGame = new ContraGame();
		PacManGame pacManGame = new PacManGame();

		GameRunner gameRunner = new GameRunner(marioGame);

		gameRunner.run(marioGame);
		gameRunner.run(contraGame);
		gameRunner.run(pacManGame);
	}

}
