package com.itransition.courses.task4;

import java.util.ArrayList;

public class WhoWinner {
    public String result(int computerMove,int playerMove,String...str){
        ArrayList<Boolean> winners = new HelpTable().whoWin(computerMove,str.length);
        return winners.get(playerMove)? "You Win!": computerMove!=playerMove ? "You Lose  :(": "Draw";
    }
}


