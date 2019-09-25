package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.ArrayList;


public class Calculator {
    @FXML
    public Button binaryOne;

    @FXML
    public Button binaryZero;

    @FXML
    public Button binaryPlus;

    @FXML
    public Button binaryMinus;

    @FXML
    public Button binaryMultiplication;

    @FXML
    public Button binaryDivision;

    @FXML
    public Button binarySquare;

    @FXML
    public Button binarySquareRoot;

    @FXML
    public TextField inputField;

    @FXML
    public Button binaryClear;

    private BinaryConverter converter;
    private ArrayList<String> binaryStrings;
    private String calculationType;

    public Calculator(){
        this.converter = new BinaryConverter();
        this.binaryStrings = new ArrayList<>();
    }


    @FXML
    public void add(){
        binaryStrings.add(inputField.getText());
        inputField.clear();
        calculationType = "addition";
    }

    @FXML
    public void subtract(){
        binaryStrings.add(inputField.getText());
        inputField.clear();
        calculationType = "subtraction";
    }

    @FXML
    public void divide(){
        binaryStrings.add(inputField.getText());
        inputField.clear();
        calculationType = "division";
    }

    @FXML
    public void multiply(){
        binaryStrings.add(inputField.getText());
        inputField.clear();
        calculationType = "multiplication";
    }

    @FXML
    public void square(){
        binaryStrings.add(inputField.getText());
        inputField.clear();
        calculationType = "square";
    }

    @FXML
    public void squareRoot(){
        binaryStrings.add(inputField.getText());
        inputField.clear();
        calculationType = "squareRoot";
    }

    @FXML
    public void addOne(){
        inputField.setText(inputField.getText() + "1");
    }

    @FXML
    public void addZero(){
        inputField.setText(inputField.getText() + "0");
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
            case "square":
                result = numberList.get(0) * numberList.get(0);
                break;
            case "squareRoot":
                result = (int) Math.sqrt(numberList.get(0) * numberList.get(1));
                break;
        }
        inputField.setText("Result: " + Integer.toBinaryString(result));
        binaryStrings.clear();
    }

    @FXML
    public void clear(){
        inputField.clear();
    }
}
