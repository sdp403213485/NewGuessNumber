package com.twschool.practice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuessNumberTest {
    @Test
    public void should_return_4A0B_when_input_1234_given_1234(){
        //given
        String userAnswer = "1234";
        String gameAnsewr = "1234";
        GuessNumber guessNumber = new GuessNumber();
        //when
        String result =guessNumber.answer(userAnswer,gameAnsewr);
        //then
        assertEquals(result,gameAnsewr);

    }
}
