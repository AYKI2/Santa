package service;

import model.Child;

import java.util.List;

public interface ChildService {
    String createDB(List<Child> people);
    List<Child> getAllChild();
    void findByName();
}
