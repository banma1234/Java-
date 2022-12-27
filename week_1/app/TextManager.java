package week_1.app;

public class TextManager {
	public void startMsg() {	// ���α׷� ���� ������ ���
		System.out.println("�����Դϴ�.\n�ʱ�ȭ�Ϸ��� 'clear', ���������Ϸ��� 'q'�� �Է����ּ���.\n");
	}
	
	public void displayMsg(String input) {	// �ǽð� ������ ���
		System.out.println("==================================");
		System.out.println("display | " + input);
		System.out.println("==================================\n");
	};
	
	public void inputMsg() {	// ����� �� �Է½� ���
		System.out.print("�Է� : ");
	}
	
	public void endMsg(int result) {	// ��� �Ϸ�� ���
		System.out.println("\n==================================");
		System.out.println("��� : " + result);
		System.out.println("==================================");
		System.out.println("�����Ͻ÷��� 'q'�� �Է����ּ���.\n");
	}
	
	public void errorMsg(NumberFormatException e) {	// �߸��� �� �Է½� ���
		System.out.println("�����ڵ� : " + e);
		System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�.");
	}
}
