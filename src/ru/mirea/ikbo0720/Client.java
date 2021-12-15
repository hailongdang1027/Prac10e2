package ru.mirea.ikbo0720;

public class Client {
    public Chair chair;

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public void sit(){
        System.out.println("Sitting on: " + chair);
    }
}
