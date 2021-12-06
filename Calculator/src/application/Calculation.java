package application;
import javafx.scene.control.Label;

public class Calculation {
	public float calculation(float x, float y, String operator) {
		
		switch(operator) {
		case "+":
			return x+y;
		case "-":
			return x-y;
		case "X":
			return x*y;
		case "/":
			if (y==0)
				return 0;
			else
				return x/y;
		default:
			return 0;
		}
	}
}
