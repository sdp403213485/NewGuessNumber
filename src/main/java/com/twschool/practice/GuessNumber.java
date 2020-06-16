package com.twschool.practice;


import java.util.Scanner;

public class GuessNumber {
    public static void main(String[]args){
        String gameAnsewr ="1234";
        Scanner input=new Scanner(System.in);
        String userAnswer=input.next();

        GuessNumber guessNumber = new GuessNumber();
        String Output = guessNumber.answer(userAnswer,gameAnsewr);
        System.out.print(Output);
    }


    public String answer(String userAnswer, String gameAnsewr) {
        String Output = null;
        int ANum=this.ACheckNumber(userAnswer,gameAnsewr);
        int BNum=this.BCheckNumber(userAnswer,gameAnsewr);
        Output = ANum+"A"+BNum+"B";
        return Output;
    }

    public int ACheckNumber(String userAnswer, String gameAnsewr){
        int ANum = 0;
        for(int i = 0; i < userAnswer.length(); i++) {
            char c = userAnswer.charAt(i);
            if( c == gameAnsewr.charAt(i)){
                ANum = ANum + 1;
            }
        }
        return ANum;
    }

    public int BCheckNumber(String userAnswer, String gameAnsewr){
        int BNum = 0;
        for(int i = 0; i < userAnswer.length(); i++) {
            char c = userAnswer.charAt(i);
            for(int j = 0; j < userAnswer.length(); j++) {
                if( c == gameAnsewr.charAt(j) & i != j){
                    BNum = BNum + 1;
                }
            }
        }
        return BNum;
    }

}
