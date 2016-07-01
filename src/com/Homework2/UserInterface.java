package com.Homework2;

import com.epam.spb.lection2.*;
import com.sun.org.apache.xpath.internal.operations.Mult;


public class UserInterface {
    public static void main(String[] args) {

        MenuPrompt prompt = new MenuPrompt();
        GetInput input = new GetInput();
        Choice choice = new Choice();

        prompt.getPrompt();
        String answer = input.getUserInput("Choose example: ");
        int answ = Integer.parseInt(answer);
        choice.makeChoice(answ);

        boolean flag = true; //zero means exit

        while(flag) {
            prompt.getPrompt();
            answer = input.getUserInput("Choose example: ");
            answ = Integer.parseInt(answer);
            int checkReturnValue = choice.makeChoice(answ);

            if(checkReturnValue == 0){
                flag = false;
            }
        }
    }
}
