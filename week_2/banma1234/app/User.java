package week_2.banma1234.app;

public class User {
	private String userName;
	private int penaltyCount;
	
	public User(String userName, int penaltyCount) {
		super();
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
	public void increasePenaltyCount() {
		this.penaltyCount += 1;
	}
	
	public int getPenaltyCharge() {
		return this.penaltyCount * 5000;
	}

}
