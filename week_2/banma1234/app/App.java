package week_2.banma1234.app;

import java.util.*;

public class App {
	String[] userInfo = new String[]	{"���ϼ�", "���ؼ�", "�ڹ���", "�ȼ���"};

	public static void main(String[] args) {
		App app = new App();

		app.play();
	}
	
	public void play() {
		Scanner sc = new Scanner(System.in);	// ����ڰ� �Է��� ����ϴ� Scanner class 'sc' ����
		TextManager msg = new TextManager();	// �޼��� ����� ����ϴ� Textmaneger class 'msg' ����
		
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
				case 1: {	// ������ȸ
					msg.inputMsg(menu);
					for(int i=0; i<user.size(); i++) {
						msg.showUserMsg(i+1, user.get(i).getUserName(), user.get(i).getPenaltyCharge());
					}
				} break;
				case 2: {	// ���ݺΰ�
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
				case 3: {	// ȸ���߰�
					msg.inputMsg(menu);
					String newName = sc.next();
					
					user.add(new User(newName, 0));
				} break;
				case 4: {	// ȸ������
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
				case 9: {	// ����
					msg.inputMsg(menu);
				} break;
				}
			} while (menu != 9);
		} catch(InputMismatchException e) {
			msg.errorMsg(e);
		}
		
	}
	
	

}
