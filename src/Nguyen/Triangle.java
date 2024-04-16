package Nguyen;

public class Triangle {
	public static int number1;
	public static int number2;
	public static int number3;

     public static int maxLength() {
		if (number1 >= number2)
			if (number1 > number3)
				return number1;
			else
				return number3;
		if (number2 > number3)
			return number2;
		else
			return number3;
	}
}
