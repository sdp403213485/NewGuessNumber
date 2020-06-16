package com.twschool.practice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuessNumberTest {
    @Test
    public void should_return_4A0B_when_input_1234_given_1234(){
        //given
        String userAnswer = "1234";
        String gameAnsewr = "1234";
        String Expected = "4A0B";
        GuessNumber guessNumber = new GuessNumber();
        //when
        String result =guessNumber.answer(userAnswer,gameAnsewr);
        //then
        assertEquals(Expected,result);
    }

    @Test
    public void should_return_0A4B_when_input_4321_given_1234(){
        //given
        String userAnswer = "4321";
        String gameAnsewr = "1234";
        String Expected = "0A4B";
        GuessNumber guessNumber = new GuessNumber();
        //when
        String result =guessNumber.answer(userAnswer,gameAnsewr);
        //then
        assertEquals(Expected,result);
    }

    @Test
    public void should_return_0A0B_when_input_5678_given_1234(){
        //given
        String userAnswer = "5678";
        String gameAnsewr = "1234";
        String Expected = "0A0B";
        GuessNumber guessNumber = new GuessNumber();
        //when
        String result =guessNumber.answer(userAnswer,gameAnsewr);
        //then
        assertEquals(Expected,result);
    }

    @Test
    public void should_return_2A2B_when_input_1243_given_1234(){
        //given
        String userAnswer = "1243";
        String gameAnsewr = "1234";
        String Expected = "2A2B";
        GuessNumber guessNumber = new GuessNumber();
        //when
        String result =guessNumber.answer(userAnswer,gameAnsewr);
        //then
        assertEquals(Expected,result);
    }
}
