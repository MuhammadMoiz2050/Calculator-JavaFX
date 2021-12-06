package application;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;



public class MainProcess {
	
public double converter(float n) {
	return n*176.20;
}
@FXML 
Button mybutton = new Button();
public Label result;
private float num1 = 0;
private float num2;
private boolean start = true;
private Calculation obj = new Calculation();
private String operator = "";
private Label c;


@FXML
	public void processNumbers(ActionEvent event) {
		if(start) {
			result.setText("");
			start = false;
			
		}
		String value = ((Button)event.getSource()).getText();
		result.setText(value);
	}
	
	public void processOperators(ActionEvent event) {
		
		String value = ((Button)event.getSource()).getText();
		
		if(!value.equals("=")) {
			if (!operator.isEmpty()) 
			
			switch(operator) {
			case"C":
				result.setText("");
				this.num1 = 0;
				this.num2 = 0;
				break;
				
			case"CE":
				result.setText("");
				this.num1 = 0;
				this.num2 = 0;
				break;
				
			default:
				break;
			}
			
			operator = value;
			num1 = Long.parseLong(result.getText());
			result.setText("");
			return;
		}
		else {
		if(operator.isEmpty())
			return;
		num2 = Long.parseLong(result.getText());
		float cal = obj.calculation(num1, num2, operator);
		result.setText(String.valueOf(cal));
		
		operator = "";
		num1 = 0;
		num2 = 0;
		start = true;
	}
	
}
	
	public void scene2(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("CurrencyConverter.fxml"));
		Scene scene = new Scene(root,400,400);
		Stage secondaryStage = new Stage();
		secondaryStage.setTitle("Calcuator");
		secondaryStage.setScene(scene);
		secondaryStage.show();
		
	}
	public void conversionn(ActionEvent event) {
		String value = ((Button)event.getSource()).getText();
		float x = Long.parseLong(result.getText());
		//c.setText("");
		//x = Integer.parseInt(value);
		double result = converter(x);
		String val = Double.toString(result);
		c.setText(val);
		x = 0;
		result = 0;
	}
	
}
