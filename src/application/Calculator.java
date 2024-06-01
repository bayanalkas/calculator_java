// project 3 - cis 296
// Byan Alkas & Amal Mohamed

package application;
import java.util.Stack;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.text.Text;


public class Calculator {	
	
	int x = 0;
	int y = 0;
	int result = 0;

	@FXML
	TextField text;	 // set a text field

	@FXML
	Label ans; // set the answer button
	
	@FXML
	Button btnCalculate; // 
	
	@FXML
	Button clearBtn;
	
	@FXML
	Button btnAdd;

	@FXML
	Button btnSub;
	
	@FXML
	Button btnMultiply;	
	
	@FXML
	Button btnDivide;	
	
	@FXML
	Button btnZero;
	
	@FXML
	Button btnOne;
	
	@FXML
	Button btnTwo;
	
	@FXML
	Button btnThree;

	@FXML
	Button btnFour;

	@FXML
	Button btnFive;
	
	@FXML
	Button btnSix;
			
	@FXML
	Button btnSeven;
	
	@FXML
	Button btnEight;
	 
	@FXML
	Button btnNine;
	
	
	
	// create the method calculation that handles the buttons. 
    @FXML
    public void calculate (ActionEvent event) { 
		if (event.getSource() == btnZero) {
      		text.appendText("0");
      	} // handle the zero button
      	else if (event.getSource() == btnOne) {
      		text.appendText("1");
      	} // handle the one button
      	else if (event.getSource() == btnTwo) {
      		text.appendText("2");
      	} // handle the two button
      	else if (event.getSource() == btnThree) {
      		text.appendText("3");
      	} // handle the three button
      	else if (event.getSource() == btnFour) {
      		text.appendText("4");
      	} // handle the four button
      	else if (event.getSource() == btnFive) {
      		text.appendText("5");
      	} // handle the five button
      	else if (event.getSource() == btnSix) {
      		text.appendText("6");
      	} // handle the six button
      	else if (event.getSource() == btnSeven) {
      		text.appendText("7");
      	} // handle the seven button
      	else if (event.getSource() == btnEight) {
      		text.appendText("8");
      	} // handle the eight button
      	else if (event.getSource() == btnNine) {
      		text.appendText("9");
      	} // handle the nine button
      	else if (event.getSource() == btnAdd) {
      		text.appendText("+");
      	} // handle the add button
      	else if (event.getSource() == btnSub) {
      		text.appendText("-");
      	} // handle the subtract button
      	else if (event.getSource() == btnMultiply) {
      		text.appendText("*");
      	} // handle the multiplication button
      	else if (event.getSource() == btnDivide) {
      		text.appendText("/");
      	} // handle the divide button
      	else if (event.getSource() == btnCalculate) {
      		postfix p = new postfix(text.getText());
      		text.setText(ans.getText());
      		
      	} // handle the calculation button
    } // get the calculation method and the operation buttons to press.

 

	@FXML
    public void clear(ActionEvent event) {
    	text.setText(" ");
    	ans.setText("");
    } // clear number
    
    public void updateText(){
        text.setText(ans.getText());
    } // update the text file. 
    
    public void image() {
    	new Image(getClass().getResourceAsStream("zero.png"));
    	new Image(getClass().getResourceAsStream("one.png"));
    	new Image(getClass().getResourceAsStream("two.png"));
    	new Image(getClass().getResourceAsStream("three.png"));
    	new Image(getClass().getResourceAsStream("four.png"));
    	new Image(getClass().getResourceAsStream("five.png"));
    	new Image(getClass().getResourceAsStream("six.png"));
    	new Image(getClass().getResourceAsStream("seven.png"));
    	new Image(getClass().getResourceAsStream("eight.png"));
    	new Image(getClass().getResourceAsStream("nine.png"));
    	new Image(getClass().getResourceAsStream("plus.png"));
    	new Image(getClass().getResourceAsStream("minus.png"));
    	new Image(getClass().getResourceAsStream("times.png"));
    	new Image(getClass().getResourceAsStream("divide.png"));
    }   // display the images. 
}
			
			
