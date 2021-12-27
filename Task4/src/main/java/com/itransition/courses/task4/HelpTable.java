package com.itransition.courses.task4;

import java.util.ArrayList;

public class HelpTable {
    ArrayList<Boolean> winners = new ArrayList<>();

    public ArrayList<Boolean> whoWin(int computerMove,int strLength){

        if( computerMove <= strLength/2 ){
            for (int i = 0; i < strLength; i++) {
                winners.add(i > computerMove && i <= computerMove + strLength / 2);
            }
        }else{
            for (int i = 0; i < strLength; i++) {
                winners.add(i < computerMove-strLength/2 || i > computerMove);
            }
        }
        return winners;
    }

    public void show(int computerMove, String...str){
        whoWin(computerMove,str.length);
        for (int i = 0; i < str.length; i++) {
            if (winners.get(i) && i != computerMove){
                System.out.println(i+1 + ". " + str[i] + " - WIN Move ");
            }
            else if(i!= computerMove){
                System.out.println(i+1 + ". " + str[i] + " - Lose Move ");
            }
            else
                System.out.println(i+1 + ". " + str[i] + " - Computer Move");
        }
    }
}
