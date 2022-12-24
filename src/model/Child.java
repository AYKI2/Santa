package model;

import java.util.List;
import java.util.Map;

public class Child {
    private long id;
    private String name;
    private int age;
    private Gift gift;
    private int x;
    private int y;

    public Child() {
    }

    public Child(long id, String name, int age, Gift gift, int x, int y) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gift = gift;
        this.x = x;
        this.y = y;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gift getGift() {
        return gift;
    }

    public void setGift(Gift gift) {
        this.gift = gift;
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
        return "\nChild: " +
                "\nid = " + id +
                "\nname = " + name +
                "\nage = " + age +
                "\ngift = " + gift +
                "\nx = " + x +
                "\ny = " + y;
    }
}
