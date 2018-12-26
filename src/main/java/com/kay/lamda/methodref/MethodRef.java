package com.kay.lamda.methodref;


import org.junit.jupiter.api.Test;

import java.util.function.Function;


public class MethodRef {

    @Test
    public void instance(){
        Function<String,Integer> function=(String s)->Integer.parseInt(s);
        System.out.println("result1: "+function.apply("100"));

    }


}
