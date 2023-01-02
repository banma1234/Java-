package week_2.banma1234.app;

import java.util.InputMismatchException;

public class TextManager {
	String[] menuType = new String[]	{"벌금조회", "벌금부과", "회원추가", "회원삭제"};
	
	public void startMsg() {
		System.out.println("  [ javaRaid 벌금관리 프로그램 ]  ");
	}
	
	public void playMsg() {
		System.out.println("===============================");
		System.out.println(" 1. 벌금조회");
		System.out.println(" 2. 벌금부과");
		System.out.println(" 3. 회원추가");
		System.out.println(" 4. 회원삭제");
		System.out.println(" 9. 프로그램 종료");
		System.out.println("===============================");
		System.out.print(" 메뉴 선택 : ");
	}
	
	public void inputMsg(int input) {
		System.out.println("===============================");
		
		if (input == 9) {
			System.out.println("프로그램을 종료합니다.....");
		} else if (input != 1) {
			System.out.println("  [ " + menuType[input-1] + " ]  ");
			System.out.print("입력 : ");
		}
	}
	
	public void showUserMsg(int userNumber, String userName, int penaltyCharge) {
		System.out.println(userNumber + ")" + userName + " : " + penaltyCharge);
	}
	
	public void validMsg() {
		System.out.println("찾으시는 회원이 없습니다.");
	}
	
	public void errorMsg(InputMismatchException e) {
		System.out.println("에러코드 : " + e);
		System.out.println("잘못된 값을 입력하셨습니다.");
	}

}
