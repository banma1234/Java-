package week_1.app;

public class TextManager {
	public void startMsg() {	// 프로그램 최초 구동시 출력
		System.out.println("계산기입니다.\n초기화하려면 'clear', 강제종료하려면 'q'를 입력해주세요.\n");
	}
	
	public void displayMsg(String input) {	// 실시간 계산과정 출력
		System.out.println("==================================");
		System.out.println("display | " + input);
		System.out.println("==================================\n");
	};
	
	public void inputMsg() {	// 사용자 값 입력시 출력
		System.out.print("입력 : ");
	}
	
	public void endMsg(int result) {	// 계산 완료시 출력
		System.out.println("\n==================================");
		System.out.println("결과 : " + result);
		System.out.println("==================================");
		System.out.println("종료하시려면 'q'를 입력해주세요.\n");
	}
	
	public void errorMsg(NumberFormatException e) {	// 잘못된 값 입력시 출력
		System.out.println("에러코드 : " + e);
		System.out.println("잘못된 값을 입력하셨습니다.");
	}
}
