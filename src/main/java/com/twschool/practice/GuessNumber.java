package com.twschool.practice;

public class GuessNumber {
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
        return 0;
    }

}
