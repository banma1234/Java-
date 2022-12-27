package week_1.banma1234.app;

public class Calculater {
	private String number;
	private String operator = "";
		/* number�� operator�� ���� �Է¹��� ����, �����ڸ� ���ϸ� inputHandler()�� ����
		���ڿ� �����ڰ� �ɷ��� ���� ���Ŀ� �´� �ʵ尪�� ����ȴ�. */
	private String display = "";	// �ǽð� �������(=��°�)
	private int result = 0;			// �����
	
	public int getNumber() {
		return Integer.parseInt(number);	// number�ʵ� ���ٽ� ���������� �Ľ�
	}
	public void setNumber(String number) {
		this.number = number;
		this.setResult(this.getNumber());
		this.setDisplay(number);
	}
	
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
		this.setDisplay(operator);
	}
	
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String input) {		
		if (input.equals("=")) {
			this.display = String.valueOf(this.result);
		} else if (input.equals("init")) {
			this.display = "";
		} else {
			this.display += input + " ";
		}
			/* ���޹��� �Ķ���� �������� ���� ó��
			 - '=' : ��°��� ��������� �ʱ�ȭ
			 - 'init' : ��°��� �������� �ʱ�ȭ
			 - �׿� : ���� ��°��� ���޹��� �Ķ����(���ڿ�)�� �߰�
			*/
	}
	
	public int getResult() {
		return result;
	}
	public void setResult(int number) {
		switch(this.getOperator()) {
		case "+":{
			this.result += number;
		}break;
		case "-":{
			this.result -= number;
		}break;
		case "*":{
			this.result *= number;
		}break;
		case "/":{
			this.result /= number;
		}break;
		case "=":{
			
		}break;
		case "init":{
			this.result = 0;
		}break;
		case "":{
			this.result = number;
		}break;
		}
			/* ���޹��� �Ķ���� �������� ���� ó��
			 - '+' : ���� ������� �Ķ���� ���� ���Ѵ�
			 - '-' : ���� ������� �Ķ���� ���� ����
			 - '*' : ���� ������� �Ķ���� ���� ���Ѵ�
			 - '/' : ���� ������� �Ķ���� ���� ������
			 - '=' : continue
			 - ' ' : ���޹��� �Ķ���� ���� �״�� ������� �ʱ�ȭ
			 - 'init' : ���� ������� 0���� �ʱ�ȭ
			*/
	}
	
	public void init() {
		this.setNumber("0");
		this.setOperator("");
		this.setDisplay("init");
		this.setResult(0);
		/* ��� �����͸� �ʱ�ȭ */
	}
	
	public void inputHandler(String input) {
		if (input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/")) {
			this.setOperator(input);
		} else {
			this.setNumber(input);
		}
		/* ���޹��� �Ķ���� ���� �������� ��� operator�ʵ忡 ���� ����, �� ���� ��� number�ʵ忡 �����Ѵ�. */
	}

}
