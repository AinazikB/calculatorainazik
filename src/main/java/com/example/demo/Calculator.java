package com.example.demo;

public class Calculator {
    private char operator;
    private double result;
    private double op1;
    private double op2;

    public void setOp1(double op1) {
        this.op1 = op1;
    }

    public void setOp2(double op2) {
        this.op2 = op2;
    }

    public double getResult() {
        return result;
    }
    public void setOperator(char operator) {
        this.operator = operator;
    }
    public void Calculate(){
        if (operator == '+'){
            this.result = op1 + op2;
        } else if (operator == '-') {
            this.result = op1 - op2;
        } else if (operator == 'x') {
            this.result= op1 * op2;
        } else if (operator == '/') {
            if (op2 != 0){
                this.result = op1 / op2;
            } else {
                System.out.println("Error");
            }
        } else {
            System.out.println("Incorrect input");
        }
    }
}
