package week_1.banma1234.app;

import java.util.*;

public class App {
	
	public static void main(String[] args) {
		TextManager msg = new TextManager();	// �޼��� ����� ����ϴ� Textmaneger class 'msg' ����
		App app = new App();					// ���α׷� ������ ����ϴ� App class 'app' ����

		msg.startMsg();
		app.play();		// app ����
	}
	
	public void play() {
		Scanner sc = new Scanner(System.in);	// ����ڰ� �Է��� ����ϴ� Scanner class 'sc' ����
		TextManager msg = new TextManager();	// �޼��� ����� ����ϴ� Textmaneger class 'msg' ����
		Calculater cal = new Calculater();		// ������ ����� ����ϴ� Caculater class 'cal' ����
		
		String inputText = "";
		boolean isStop = false;		// �ݺ��� Ż���� �����ϴ� flag
		
		try {
			do {	// ��������
				inputText = "";
				msg.displayMsg(cal.getDisplay());		// 'cal'�� display���� �ҷ��� msg.displayMsg()�� ����
				msg.inputMsg();	inputText = sc.next();	// ����ڰ� �Է�
				
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
					/* ������� �Է°��� ���� ���� ó��
					 - 'q' : �ݺ��� Ż��
					 - 'clear' : ��� ������ �ʱ�ȭ
					 - '=' : ��� ���� �� �ȳ��� ���
					 - �׿� : ��� ����
					*/
				
			} while (!isStop);	// flag�� true��� �ݺ��� ����
			
		} catch(NumberFormatException e) {	// �߸��� �� �Է½� ȣ��
			msg.errorMsg(e);
		}
	}

}
