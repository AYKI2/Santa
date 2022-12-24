package model;

import exception.TooMuchException;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class Santa {
    private Deque<Gift> giftBox;
    private int speed;
    private int x;
    private int y;

    public Santa(Deque<Gift> giftBox, int speed, int x, int y) {
        if(giftBox.size() > 5){
            throw new TooMuchException("The size does not match!");
        }else {
            this.giftBox = giftBox;
        }
        this.speed = speed;
        this.x = x;
        this.y = y;
    }

    public Deque<Gift> getGiftBox() {
        return giftBox;
    }

    public void setGiftBox(Deque<Gift> giftBox) {
        this.giftBox = giftBox;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "\nSanta: " +
                "\ngiftBox = " + giftBox +
                "\nspeed = " + speed +
                "\nx = " + x +
                "\ny = " + y;
    }
}
