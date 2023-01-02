package week_2.banma1234.app;

import java.util.InputMismatchException;

public class TextManager {
	String[] menuType = new String[]	{"������ȸ", "���ݺΰ�", "ȸ���߰�", "ȸ������"};
	
	public void startMsg() {
		System.out.println("  [ javaRaid ���ݰ��� ���α׷� ]  ");
	}
	
	public void playMsg() {
		System.out.println("===============================");
		System.out.println(" 1. ������ȸ");
		System.out.println(" 2. ���ݺΰ�");
		System.out.println(" 3. ȸ���߰�");
		System.out.println(" 4. ȸ������");
		System.out.println(" 9. ���α׷� ����");
		System.out.println("===============================");
		System.out.print(" �޴� ���� : ");
	}
	
	public void inputMsg(int input) {
		System.out.println("===============================");
		
		if (input == 9) {
			System.out.println("���α׷��� �����մϴ�.....");
		} else if (input != 1) {
			System.out.println("  [ " + menuType[input-1] + " ]  ");
			System.out.print("�Է� : ");
		}
	}
	
	public void showUserMsg(int userNumber, String userName, int penaltyCharge) {
		System.out.println(userNumber + ")" + userName + " : " + penaltyCharge);
	}
	
	public void validMsg() {
		System.out.println("ã���ô� ȸ���� �����ϴ�.");
	}
	
	public void errorMsg(InputMismatchException e) {
		System.out.println("�����ڵ� : " + e);
		System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�.");
	}

}
