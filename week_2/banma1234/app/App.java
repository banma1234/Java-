package week_2.banma1234.app;

import java.util.*;

public class App {
	String[] userInfo = new String[]	{"강하성", "김준수", "박범수", "안세훈"};	// 기본정보

	public static void main(String[] args) {
		App app = new App();	// 프로그램 진행을 담당하는 App class 'app' 선언

		app.play();		// app 시작
	}
	
	public void play() {
		Scanner sc = new Scanner(System.in);	// 사용자값 입력을 담당하는 Scanner class 'sc' 선언
		TextManager msg = new TextManager();	// 메세지 출력을 담당하는 Textmaneger class 'msg' 선언
		
		ArrayList<User> user = new ArrayList<User>();
		for(int i=0; i<userInfo.length; i++) {
			user.add(new User(userInfo[i], 0));
		}
		/* 클래스 객체를 ArrayList에 저장
		 - User class의 User필드를 참조타입으로 지정
		 - userInfo의 내용을 기본값으로 ArrayList에 우선 전달 
		*/
		
		int menu = 0;	// 반복문, switch문을 제어하는 변수
		
		msg.startMsg();
		try {
			do {	// 최초진행
				msg.playMsg();
				menu = sc.nextInt();
				
				switch(menu) {
				case 1: {	// 벌금조회
					msg.inputMsg(menu);
					for(int i=0; i<user.size(); i++) {		// ArrayList 탐색하며 user의 모든 정보 출력
						msg.showUserMsg(i+1, user.get(i).getUserName(), user.get(i).getPenaltyCharge());
					}
				} break;
				case 2: {	// 벌금부과
					msg.inputMsg(menu);
					String searchUserName = sc.next();	// 검색할 user의 이름
					
					for(int i=0; i<user.size(); i++) {
						if (user.get(i).getUserName().equals(searchUserName)) {
							user.get(i).increasePenaltyCount();
						} else if (i == user.size()-1) {
							msg.validMsg();
						}
					}
					/* ArrayList 탐색하며 검색할 user의 이름을 user필드의 데이터와 대조하며 다음과 같은 로직을 진행
					- 일치시 : 해당 user의 벌칙 count 1 증가
					- 불일치시 : 에러메세지 출력
					*/
				} break;
				case 3: {	// 회원추가
					msg.inputMsg(menu);
					String newName = sc.next();		// 추가할 user의 이름
					
					user.add(new User(newName, 0));	// 새로운 회원정보 추가
				} break;
				case 4: {	// 회원삭제
					msg.inputMsg(menu);
					String searchUserName = sc.next();		// 검색할 user의 이름
					
					for(int i=0; i<user.size(); i++) {
						if (user.get(i).getUserName().equals(searchUserName)) {
							user.remove(i);
						} else if (i == user.size()-1) {
							msg.validMsg();
						}
					}
					/* ArrayList 탐색하며 검색할 user의 이름을 user필드의 데이터와 대조하며 다음과 같은 로직을 진행
					- 일치시 : ArrayList에서 해당 user의 데이터 삭제
					- 불일치시 : 에러메세지 출력
					*/
				} break;
				case 9: {	// 종료
					msg.inputMsg(menu);
				} break;
				}
			} while (menu != 9);
		} catch(InputMismatchException e) {		// 잘못된 값 입력시 호출
			msg.errorMsg(e);
		}
		
	}
	
	

}
