package week_2.banma1234.app;

public class User {
	private String userName;	// 회원명
	private int penaltyCount;	// 벌칙 누계
	
	public User(String userName, int penaltyCount) {	// User 필드
		super();	// 자식 클래스 생성자에서 부모 클래스에 접근시 사용되는 메소드
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
	public void increasePenaltyCount() {	// 벌칙 누계 + 1
		this.penaltyCount += 1;
	}
	
	public int getPenaltyCharge() {		// 벌칙 누계에 벌금(=5000)을 곱한 값(=실제 벌금)을 반환
		return this.penaltyCount * 5000;
	}

}
