package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class CurrencyController {
@FXML
private Label c;

public double converter(int n) {
	return n*176.20;
}
@FXML
public void handler(ActionEvent event) {
	String value = ((Button)event.getSource()).getText();
	c.setText("");
	int x = Integer.parseInt(value);
	double result = converter(5);
	String val = Double.toString(result);
	c.setText(val);
	x = 0;
	result = 0;
}
}
