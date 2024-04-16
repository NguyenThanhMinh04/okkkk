package Nguyen;

public class Sort1 {
	public int number1;
	public int number2;

	public Sort1(int number1, int number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
	}

	public void sortAsc() {
	if (number1 > number2) {
	int temp = number1;
	number1 = number2;
	number2 = temp;
	}

}
}
