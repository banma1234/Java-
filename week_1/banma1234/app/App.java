package week_1.banma1234.app;

import java.util.*;

public class App {
	
	public static void main(String[] args) {
		TextManager msg = new TextManager();	// 메세지 출력을 담당하는 Textmaneger class 'msg' 선언
		App app = new App();					// 프로그램 진행을 담당하는 App class 'app' 선언

		msg.startMsg();
		app.play();		// app 시작
	}
	
	public void play() {
		Scanner sc = new Scanner(System.in);	// 사용자값 입력을 담당하는 Scanner class 'sc' 선언
		TextManager msg = new TextManager();	// 메세지 출력을 담당하는 Textmaneger class 'msg' 선언
		Calculater cal = new Calculater();		// 계산기의 기능을 담당하는 Caculater class 'cal' 선언
		
		String inputText = "";
		boolean isStop = false;		// 반복문 탈출을 제어하는 flag
		
		try {
			do {	// 최초진행
				inputText = "";
				msg.displayMsg(cal.getDisplay());		// 'cal'의 display값을 불러와 msg.displayMsg()에 전달
				msg.inputMsg();	inputText = sc.next();	// 사용자값 입력
				
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
					/* 사용자의 입력값에 따라 로직 처리
					 - 'q' : 반복문 탈출
					 - 'clear' : 모든 데이터 초기화
					 - '=' : 계산 종료 및 안내문 출력
					 - 그외 : 계산 진행
					*/
				
			} while (!isStop);	// flag가 true라면 반복문 종료
			
		} catch(NumberFormatException e) {	// 잘못된 값 입력시 호출
			msg.errorMsg(e);
		}
	}

}
