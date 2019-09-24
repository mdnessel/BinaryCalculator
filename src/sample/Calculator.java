package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.ArrayList;


public class Calculator {
    @FXML
    Button binaryOne;

    @FXML
    Button binaryZero;

    @FXML
    Button binaryPlus;

    @FXML
    Button binaryMinus;

    @FXML
    Button binaryMultiplication;

    @FXML
    Button binaryDivision;

    @FXML
    TextField inputField;

    private BinaryConverter converter;
    private ArrayList<String> binaryStrings;
    private String calculationType;

    Calculator(){
        this.converter = new BinaryConverter();
        this.binaryStrings = new ArrayList<>();
    }


    @FXML
    public void add(){
        binaryStrings.add(inputField.getText());
        inputField.setText("");
        calculationType = "addition";
    }

    @FXML
    public void subtract(){
        binaryStrings.add(inputField.getText());
        inputField.setText("");
        calculationType = "subtraction";
    }

    @FXML
    public void divide(){
        binaryStrings.add(inputField.getText());
        inputField.setText("");
        calculationType = "division";
    }

    @FXML
    public void multiply(){
        binaryStrings.add(inputField.getText());
        inputField.setText("");
        calculationType = "multiplication";
    }

    @FXML
    public void calculate() {
        int result = 0;
        binaryStrings.add(inputField.getText());
        ArrayList<Integer> numberList = converter.convertBinaryToDecimal(binaryStrings);
        switch (calculationType) {
            case "addition":
                result = numberList.get(0) + numberList.get(1);
                break;
            case "subtraction":
                result = numberList.get(0) - numberList.get(1);
                break;
            case "division":
                result = numberList.get(0) / numberList.get(1);
                break;
            case "multiplication":
                result = numberList.get(0) * numberList.get(1);
                break;
        }
        inputField.setText("Result: " + Integer.toBinaryString(result));
    }
}
