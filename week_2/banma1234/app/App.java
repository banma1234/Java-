package week_2.banma1234.app;

import java.util.*;

public class App {
	String[] userInfo = new String[]	{"강하성", "김준수", "박범수", "안세훈"};

	public static void main(String[] args) {
		App app = new App();

		app.play();
	}
	
	public void play() {
		Scanner sc = new Scanner(System.in);	// 사용자값 입력을 담당하는 Scanner class 'sc' 선언
		TextManager msg = new TextManager();	// 메세지 출력을 담당하는 Textmaneger class 'msg' 선언
		
		ArrayList<User> user = new ArrayList<User>();
		for(int i=0; i<userInfo.length; i++) {
			user.add(new User(userInfo[i], 0));
		}
		
		int menu = 0;
		
		msg.startMsg();
		try {
			do {
				msg.playMsg();
				menu = sc.nextInt();
				
				switch(menu) {
				case 1: {	// 벌금조회
					msg.inputMsg(menu);
					for(int i=0; i<user.size(); i++) {
						msg.showUserMsg(i+1, user.get(i).getUserName(), user.get(i).getPenaltyCharge());
					}
				} break;
				case 2: {	// 벌금부과
					msg.inputMsg(menu);
					String searchUserName = sc.next();
					
					for(int i=0; i<user.size(); i++) {
						if (user.get(i).getUserName().equals(searchUserName)) {
							user.get(i).increasePenaltyCount();
						} else if (i == user.size()-1) {
							msg.validMsg();
						}
					}
				} break;
				case 3: {	// 회원추가
					msg.inputMsg(menu);
					String newName = sc.next();
					
					user.add(new User(newName, 0));
				} break;
				case 4: {	// 회원삭제
					msg.inputMsg(menu);
					String searchUserName = sc.next();
					
					for(int i=0; i<user.size(); i++) {
						if (user.get(i).getUserName().equals(searchUserName)) {
							user.remove(i);
						} else if (i == user.size()-1) {
							msg.validMsg();
						}
					}
				} break;
				case 9: {	// 종료
					msg.inputMsg(menu);
				} break;
				}
			} while (menu != 9);
		} catch(InputMismatchException e) {
			msg.errorMsg(e);
		}
		
	}
	
	

}
