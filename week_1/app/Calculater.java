package week_1.app;

public class Calculater {
	private String number;
	private String operator = "";
	private String display = "";
	private int result = 0;
	
	public int getNumber() {
		return Integer.parseInt(number);
	}
	public void setNumber(String number) {
		this.number = number;
		this.setResult(Integer.parseInt(number));
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
	}
	
	public void init() {
		this.setNumber("0");
		this.setOperator("");
		this.setDisplay("init");
		this.setResult(0);
	}
	
	public void inputHandler(String input) {
		if (input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/")) {
			this.setOperator(input);
		} else {
			this.setNumber(input);
		}
	}

}
