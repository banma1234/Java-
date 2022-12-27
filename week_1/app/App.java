package week_1.app;

import java.util.*;

public class App {
	
	public static void main(String[] args) {
		TextManager msg = new TextManager();
		App app = new App();

		msg.startMsg();
		app.play();
	}
	
	public void play() {
		Scanner sc = new Scanner(System.in);
		TextManager msg = new TextManager();
		Calculater cal = new Calculater();
		
		String inputText = "";
		boolean isStop = false;
		
		do {
			inputText = "";
			msg.displayMsg(cal.getDisplay());
			msg.inputMsg();	inputText = sc.next();
			
			if (inputText.equals("q")) {
				isStop = true;
			} else if (inputText.equals("clear")) {
				cal.init();
			} else if (inputText.equals("=")) {
				cal.setOperator("=");
				msg.endMsg(cal.getResult());
				cal.init();
			} else {
				cal.inputHandler(inputText);
			}
			
		} while (!isStop);
	}

}
