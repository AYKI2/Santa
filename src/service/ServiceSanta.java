package service;

import model.Child;
import model.Gift;
import model.Santa;

import java.util.List;

public interface ServiceSanta {
    String createDB(List<Santa>santas, List<Child>children);
    List<Santa> getAllSanta();
    String giveAGift();
    Gift findByGiftName();
}
