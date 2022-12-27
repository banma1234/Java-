package week_1.app;

public class TextManager {
	public void startMsg() {
		System.out.println("계산기입니다.\n초기화하려면 'clear', 강제종료하려면 'q'를 입력해주세요.\n");
	}
	
	public void displayMsg(String input) {
		System.out.println("==================================");
		System.out.println("display | " + input);
		System.out.println("==================================\n");
	};
	
	public void inputMsg() {
		System.out.print("입력 : ");
	}
	
	public void endMsg(int result) {
		System.out.println("\n==================================");
		System.out.println("결과 : " + result);
		System.out.println("==================================");
		System.out.println("종료하시려면 'q'를 입력해주세요.\n");
	}
}
