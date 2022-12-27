package week_1.banma1234.app;

public class Calculater {
	private String number;
	private String operator = "";
		/* number와 operator는 각각 입력받은 숫자, 연산자를 뜻하며 inputHandler()에 의해
		숫자와 연산자가 걸러져 각각 형식에 맞는 필드값에 저장된다. */
	private String display = "";	// 실시간 연산과정(=출력값)
	private int result = 0;			// 결과값
	
	public int getNumber() {
		return Integer.parseInt(number);	// number필드 접근시 정수형으로 파싱
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
			/* 전달받은 파라미터 값에따라 로직 처리
			 - '=' : 출력값을 결과값으로 초기화
			 - 'init' : 출력값을 공백으로 초기화
			 - 그외 : 현재 출력값에 전달받을 파라미터(문자열)을 추가
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
			/* 전달받은 파라미터 값에따라 로직 처리
			 - '+' : 현재 결과값에 파라미터 값을 더한다
			 - '-' : 현재 결과값에 파라미터 값을 뺀다
			 - '*' : 현재 결과값에 파라미터 값을 곱한다
			 - '/' : 현재 결과값에 파라미터 값을 나눈다
			 - '=' : continue
			 - ' ' : 전달받은 파라미터 값을 그대로 결과값에 초기화
			 - 'init' : 현재 결과값을 0으로 초기화
			*/
	}
	
	public void init() {
		this.setNumber("0");
		this.setOperator("");
		this.setDisplay("init");
		this.setResult(0);
		/* 모든 데이터를 초기화 */
	}
	
	public void inputHandler(String input) {
		if (input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/")) {
			this.setOperator(input);
		} else {
			this.setNumber(input);
		}
		/* 전달받은 파라미터 값이 연산자일 경우 operator필드에 값을 저장, 그 외의 경우 number필드에 저장한다. */
	}

}
