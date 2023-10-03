package com.example.numbersystem;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField binaryInput;
    @FXML
    private TextField octalInput;
    @FXML
    private TextField decimalInput;
    @FXML
    private TextField hexadecimalInput;

    @FXML
    protected void binaryInputOnKeyPressed() {
        String binaryValue = binaryInput.getText();
        if (isValidBinary(binaryValue)) {
            binaryToOctal(binaryValue);
            binaryToDecimal(binaryValue);
            binaryToHexadecimal(binaryValue);
        } else {
            clearOutputFields();
        }
    }

    @FXML
    protected void octalInputOnKeyPressed() {
        String octalValue = octalInput.getText();
        if (isValidOctal(octalValue)) {
            octalToBinary(octalValue);
            octalToDecimal(octalValue);
            octalToHexadecimal(octalValue);
        } else {
            clearOutputFields();
        }
    }

    @FXML
    protected void decimalInputOnKeyPressed() {
        String decimalValue = decimalInput.getText();
        if (isValidDecimal(decimalValue)) {
            decimalToBinary(decimalValue);
            decimalToOctal(decimalValue);
            decimalToHexadecimal(decimalValue);
        } else {
            clearOutputFields();
        }
    }

    @FXML
    protected void hexadecimalInputOnKeyPressed() {
        String hexadecimalValue = hexadecimalInput.getText();
        if (isValidHexadecimal(hexadecimalValue)) {
            hexadecimalToBinary(hexadecimalValue);
            hexadecimalToOctal(hexadecimalValue);
            hexadecimalToDecimal(hexadecimalValue);
        } else {
            clearOutputFields();
        }
    }

    @FXML
    protected void clearOutputFields() {
        binaryInput.clear();
        octalInput.clear();
        decimalInput.clear();
        hexadecimalInput.clear();
    }

    // Function for checking if number system is valid
    private boolean isValidBinary(String binaryValue) {
        return binaryValue.matches("[01]+");
    }

    private boolean isValidOctal(String octalValue) {
        return octalValue.matches("[0-7]+");
    }

    private boolean isValidDecimal(String decimalValue) {
        return decimalValue.matches("\\d+");
    }

    private boolean isValidHexadecimal(String hexadecimalValue) {
        return hexadecimalValue.matches("[0-9A-Fa-f]+");
    }

    // Functions for converting the number system
    private void binaryToOctal(String binaryValue) {
        try {
            int decimalValue = Integer.parseInt(binaryValue, 2);
            octalInput.setText(Integer.toOctalString(decimalValue));
        } catch (NumberFormatException e) {
        }
    }

    private void binaryToDecimal(String binaryValue) {
        try {
            int decimalValue = Integer.parseInt(binaryValue, 2);
            decimalInput.setText(Integer.toString(decimalValue));
        } catch (NumberFormatException e) {
        }
    }

    private void binaryToHexadecimal(String binaryValue) {
        try {
            int decimalValue = Integer.parseInt(binaryValue, 2);
            hexadecimalInput.setText(Integer.toHexString(decimalValue).toUpperCase());
        } catch (NumberFormatException e) {
        }
    }

    private void decimalToBinary(String decimalValue) {
        try {
            int decimal = Integer.parseInt(decimalValue);
            binaryInput.setText(Integer.toBinaryString(decimal));
        } catch (NumberFormatException e) {
        }
    }

    private void decimalToOctal(String decimalValue) {
        try {
            int decimal = Integer.parseInt(decimalValue);
            octalInput.setText(Integer.toOctalString(decimal));
        } catch (NumberFormatException e) {
        }
    }

    private void decimalToHexadecimal(String decimalValue) {
        try {
            int decimal = Integer.parseInt(decimalValue);
            hexadecimalInput.setText(Integer.toHexString(decimal).toUpperCase());
        } catch (NumberFormatException e) {
        }
    }

    private void octalToBinary(String octalValue) {
        try {
            int decimalValue = Integer.parseInt(octalValue, 8);
            binaryInput.setText(Integer.toBinaryString(decimalValue));
        } catch (NumberFormatException e) {
        }
    }

    private void octalToDecimal(String octalValue) {
        try {
            int decimalValue = Integer.parseInt(octalValue, 8);
            decimalInput.setText(Integer.toString(decimalValue));
        } catch (NumberFormatException e) {
        }
    }

    private void octalToHexadecimal(String octalValue) {
        try {
            int decimalValue = Integer.parseInt(octalValue, 8);
            hexadecimalInput.setText(Integer.toHexString(decimalValue).toUpperCase());
        } catch (NumberFormatException e) {
        }
    }

    private void hexadecimalToBinary(String hexadecimalValue) {
        try {
            int decimalValue = Integer.parseInt(hexadecimalValue, 16);
            binaryInput.setText(Integer.toBinaryString(decimalValue));
        } catch (NumberFormatException e) {
        }
    }

    private void hexadecimalToOctal(String hexadecimalValue) {
        try {
            int decimalValue = Integer.parseInt(hexadecimalValue, 16);
            octalInput.setText(Integer.toOctalString(decimalValue));
        } catch (NumberFormatException e) {
        }
    }

    private void hexadecimalToDecimal(String hexadecimalValue) {
        try {
            int decimalValue = Integer.parseInt(hexadecimalValue, 16);
            decimalInput.setText(Integer.toString(decimalValue));
        } catch (NumberFormatException e) {
        }
    }
}
