package com.itransition.courses.task4;

public class Check {

    public boolean arguments(String... str) {
        if (str.length % 2 == 0) {
            System.out.println("Even number of moves entered");
            return true;
        }
        if(str.length < 2){
            System.out.println("The number of moves is less than two");
            return true;
        }
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    System.out.println("There are repetitive moves");
                    return true;
                }
            }
        }
        return false;
    }

    public boolean inputData(String str, int numberArguments) {
        try {
            return !str.equals("?") && (Integer.parseInt(str) > numberArguments || Integer.parseInt(str) < 0);
        }catch (Exception e) {
            System.out.println("This item is not on the menu");
            return true;
        }
    }
}