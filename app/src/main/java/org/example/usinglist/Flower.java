package org.example.usinglist;

/**
 * Created by ? on 01.07.2015.
 */
public class Flower {

    public String name;
    public int imageResource;
    public String instructions;

    public Flower(String id, int iR, String instr){
        name = id;
        imageResource = iR;
        instructions = instr;
    }

    @Override
    public String toString() {
        return name;
    }
}
