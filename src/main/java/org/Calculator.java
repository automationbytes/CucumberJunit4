package org;

public class Calculator {
    private Integer result;

    public void add(Integer a, Integer b){
        result = a+b;
    //    return result;
    }

    public void sub(Integer a, Integer b){
        result = a-b;
        //    return result;
    }


    public Integer getResult(){
        return result;
    }
}
