package sample;

import java.util.ArrayList;

class BinaryConverter {

    ArrayList<Integer> convertBinaryToDecimal(ArrayList<String> binaryStrings){
       ArrayList<Integer> numberList = new ArrayList<>();
        for (String string : binaryStrings) {
            int binary = Integer.parseInt(string, 2);
            numberList.add(binary);
        }
        return numberList;
    }
}
