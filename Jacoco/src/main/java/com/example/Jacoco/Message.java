package com.example.Jacoco;

import java.util.HashSet;
import java.util.Set;

public class Message {

    public String getMessage(String name) {
        StringBuilder s = new StringBuilder();
        if(name==null||name.trim().length()==0){
            s=s.append("Please provide your name");
        }
        else
        {
            s.append("Hello "+ name + "!");
        }


        return s.toString();
    }

    public  int getSum(int a, int b){

        return a+b;
    }


}
