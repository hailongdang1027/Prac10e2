package ru.mirea.ikbo0720;

public class FunctionalChair implements Chair{
    int sum(int a, int b){
        return a + b;
    }

    @Override
    public String toString() {
        return "Functional chair here..";
    }
}
