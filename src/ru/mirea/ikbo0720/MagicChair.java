package ru.mirea.ikbo0720;

public class MagicChair implements Chair{
    @Override
    public String toString() {
        return "MagicChair{}";
    }

    void doMagic(){
        System.out.println("Magic chair here..");
    }
}
