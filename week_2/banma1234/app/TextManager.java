package week_2.banma1234.app;

import java.util.InputMismatchException;

public class TextManager {
	String[] menuType = new String[]	{"벌금조회", "벌금부과", "회원추가", "회원삭제"};		// 출력정보
	
	public void startMsg() {
		System.out.println("  [ javaRaid 벌금관리 프로그램 ]  ");	// 프로그램 최초 구동시 출력
	}
	
	public void playMsg() {		// 메뉴목록 출력
		System.out.println("===============================");
		System.out.println(" 1. 벌금조회");
		System.out.println(" 2. 벌금부과");
		System.out.println(" 3. 회원추가");
		System.out.println(" 4. 회원삭제");
		System.out.println(" 9. 프로그램 종료");
		System.out.println("===============================");
		System.out.print(" 메뉴 선택 : ");
	}
	
	public void inputMsg(int input) {	// 사용자 값 입력시 출력
		System.out.println("===============================");
		
		if (input == 9) {
			System.out.println("프로그램을 종료합니다.....");
		} else if (input != 1) {
			System.out.println("  [ " + menuType[input-1] + " ]  ");
			System.out.print("입력 : ");
		}
	}
	
	public void showUserMsg(int userNumber, String userName, int penaltyCharge) {	// 회원정보 출력
		System.out.println(userNumber + ")" + userName + " : " + penaltyCharge);
	}
	
	public void validMsg() {	// 회원정보 불일치시 출력
		System.out.println("찾으시는 회원이 없습니다.");
	}
	
	public void errorMsg(InputMismatchException e) {	// 메뉴선택 단계에서 잘못된 값 입력시 출력
		System.out.println("에러코드 : " + e);
		System.out.println("잘못된 값을 입력하셨습니다.");
	}

}
