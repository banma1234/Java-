package week_2.banma1234.app;

public class User {
	private String userName;	// ȸ����
	private int penaltyCount;	// ��Ģ ����
	
	public User(String userName, int penaltyCount) {	// User �ʵ�
		super();	// �ڽ� Ŭ���� �����ڿ��� �θ� Ŭ������ ���ٽ� ���Ǵ� �޼ҵ�
		this.userName = userName;
		this.penaltyCount = penaltyCount;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public int getPenaltyCount() {
		return penaltyCount;
	}
	public void increasePenaltyCount() {	// ��Ģ ���� + 1
		this.penaltyCount += 1;
	}
	
	public int getPenaltyCharge() {		// ��Ģ ���迡 ����(=5000)�� ���� ��(=���� ����)�� ��ȯ
		return this.penaltyCount * 5000;
	}

}
