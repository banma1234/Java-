package week_1.app;

public class TextManager {
	public void startMsg() {
		System.out.println("�����Դϴ�.\n�ʱ�ȭ�Ϸ��� 'clear', ���������Ϸ��� 'q'�� �Է����ּ���.\n");
	}
	
	public void displayMsg(String input) {
		System.out.println("==================================");
		System.out.println("display | " + input);
		System.out.println("==================================\n");
	};
	
	public void inputMsg() {
		System.out.print("�Է� : ");
	}
	
	public void endMsg(int result) {
		System.out.println("\n==================================");
		System.out.println("��� : " + result);
		System.out.println("==================================");
		System.out.println("�����Ͻ÷��� 'q'�� �Է����ּ���.\n");
	}
}
