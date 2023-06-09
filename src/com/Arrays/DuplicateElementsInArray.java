package com.Arrays;

public class DuplicateElementsInArray {

    public static void main(String[] args) {
        String[] strArray = {"ramu", "hari", "phani", "phani", "Aparna", "hari", "krishna"};

        for (int i = 0; i < strArray.length - 1; i++) {
            for (int j = i + 1; j < strArray.length; j++) {
                if ((strArray[i].equals(strArray[j])) && (i != j)) {
                    System.out.println("Duplicate Element is : " + strArray[j]);
                }
            }
        }
    }

}
