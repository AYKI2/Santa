package service.impl;

import model.Child;
import service.ChildService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChildServiceImpl implements ChildService {
    private List<Child> childList = new ArrayList<>();

    @Override
    public String createDB(List<Child> people) {
        this.childList.addAll(people);
        return "Successfully created!";
    }

    @Override
    public List<Child> getAllChild() {
        return childList;
    }

    @Override
    public void findByName() {
        System.out.println("Write child name: ");
        String name = new Scanner(System.in).nextLine();
        List<Child> children = childList.stream().filter(x -> x.getName().equals(name)).toList();
        children.forEach(System.out::println);
    }
}
