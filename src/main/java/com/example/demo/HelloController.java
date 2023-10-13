package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    Calculator calc = new Calculator();


    @FXML
    private TextField input;

    @FXML
    protected void onButtonTwoClick(){
        String val = input.getText();
        input.setText(val + "2");
    }

    @FXML
    protected void onButtonThreeClick(){
        String val = input.getText();
        input.setText(val + "3");
    }
    @FXML
    protected void onButtonOneClick(){
        String val = input.getText();
        input.setText(val + "1");
    }
    @FXML
    protected void onButtonFourClick(){
        String val = input.getText();
        input.setText(val + "4");
    }
    @FXML
    protected void onButtonFiveClick(){
        String val = input.getText();
        input.setText(val + "5");
    }
    @FXML
    protected void onButtonSixClick(){
        String val = input.getText();
        input.setText(val + "6");
    }
    @FXML
    protected void onButtonSevenClick(){
        String val = input.getText();
        input.setText(val + "7");
    }
    @FXML
    protected void onButtonEightClick(){
        String val = input.getText();
        input.setText(val + "8");
    }
    @FXML
    protected void onButtonNineClick(){
        String val = input.getText();
        input.setText(val + "9");
    }
    @FXML
    protected void onButtonZeroClick(){
        String val = input.getText();
        input.setText(val + "0");
    }
    @FXML
    protected void onButtonClearClick(){
        input.setText("");
    }
    @FXML
    protected void onButtonPlusClick(){
        String val = input.getText();
        calc.setOperator('+');
        input.setText("");
        double d = Double.parseDouble(val);
        calc.setOp1(d);
    }

    @FXML
    protected void onButtonMinusClick(){
        String val = input.getText();
        calc.setOperator('-');
        input.setText("");
        double d = Double.parseDouble(val);
        calc.setOp1(d);
    }

    @FXML
    protected void onButtonMultipleClick(){
        String val = input.getText();
        calc.setOperator('x');
        input.setText("");
        double d = Double.parseDouble(val);
        calc.setOp1(d);
    }

    @FXML
    protected void onButtonDivisionClick(){
        String val = input.getText();
        calc.setOperator('/');
        input.setText("");
        double d = Double.parseDouble(val);
        calc.setOp1(d);
    }

    @FXML
    protected void onButtonEqualClick(){
        String val = input.getText();
        double d = Double.parseDouble(val);
        calc.setOp2(d);
        calc.Calculate();
        double s = calc.getResult();
        String str = String.valueOf(s);
        input.setText(str);
    }
}