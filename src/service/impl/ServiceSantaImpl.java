package service.impl;

import model.Child;
import model.Gift;
import model.Santa;
import service.ServiceSanta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceSantaImpl implements ServiceSanta {
    private List<Santa>santaList = new ArrayList<>();
    private List<Child>childList = new ArrayList<>();

    @Override
    public String createDB(List<Santa> santas, List<Child>children) {
        santaList.addAll(santas);
        childList.addAll(children);
        return "Successfully created!";
    }

    @Override
    public List<Santa> getAllSanta() {
        return santaList;
    }

    @Override
    public String giveAGift() {
        List<Child>children = new ArrayList<>();
        for (Santa santa : santaList) {
            int x = 10;
            int y = 10;
            int counter = 0;
            int santaX = santa.getX();
            int santaY = santa.getY();
            while (!santa.getGiftBox().isEmpty()) {
                for (Child child : childList) {
                    if (santaX == child.getX() && santaY == child.getY() && santa.getGiftBox().size() > 0) {
                        child.setGift(santa.getGiftBox().getLast());
                        santa.getGiftBox().remove(santa.getGiftBox().getLast());
                        counter++;
                        children.add(child);
                        childList.remove(child);
                        break;
                    }
                }
                if (santaY == y) {
                    if (santa.getX() != x) {
                        santa.setX(santaX++);
                        santaY = 0;
                    } else {
                        return "All delivered successfully!";
                    }
                } else {
                    santa.setY(santaY++);
                }
            }
            childList.addAll(children);
            santa.setX(santaX);
            santa.setY(santaY);
        }
        return "Successfully gift!";
    }

    @Override
    public Gift findByGiftName() {
        System.out.println("Enter gift name: ");
        String name = new Scanner(System.in).nextLine();
        for (Santa santa : santaList) {
            for (Gift giftBox : santa.getGiftBox()) {
                if (giftBox.getName().equals(name)){
                    return giftBox;
                }
            }
        }
        return null;
    }
}
