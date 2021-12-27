package com.itransition.courses.task4;

import java.util.Scanner;

public class Processor {
    public void start(String...args){
        Check check = new Check();
        GenerationKey generate = new GenerationKey();
        String choice;
        int computerMove;

        if(check.arguments(args)){
            System.out.println("Restart the program with more than one odd number of moves");
            return;
        }
        String hmacKey = generate.hmacKey();
        computerMove =(int)(Math.random() * args.length);
        String hmac = generate.hmac(args[computerMove],hmacKey);

        System.out.println("HMAC:  " + hmac);
        System.out.println("Available moves:");
        for (int i = 0; i < args.length; i++)
            System.out.println(i+1 + " - " + args[i]);
        System.out.println("0 - Exit\n? - Help");
        do {
            do {
                System.out.println("Enter your move: ");
                choice = new Scanner(System.in).nextLine();
            }while(check.inputData(choice,args.length));
            if(choice.equals("?")){
                new HelpTable().show(computerMove,args);
            }
            else if(choice.equals("0")){
                return;
            }
            else {
                System.out.println("Your move: " + args[Integer.parseInt(choice) - 1] + "\nComputer move: " +
                        args[computerMove]);
                System.out.println(new WhoWinner().result(computerMove,Integer.parseInt(choice) - 1, args));
                System.out.println("HMAC key:  " + hmacKey);
                return;
            }
        }while (true);
    }
}
