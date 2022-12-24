import model.Child;
import model.Gift;
import model.Santa;
import service.impl.ChildServiceImpl;
import service.impl.ServiceSantaImpl;

import java.util.*;

public class Main {
    public static ChildServiceImpl childService = new ChildServiceImpl();
    public static ServiceSantaImpl serviceSanta = new ServiceSantaImpl();
    public static void main(String[] args) {
        Gift gift1 = new Gift("Car",4);
        Gift gift2 = new Gift("Doll",4);
        Gift gift3 = new Gift("Ball",4);
        Gift gift4 = new Gift("Sword",4);
        Gift gift5 = new Gift("Helicopter",4);
        Deque<Gift>gifts = new ArrayDeque<>(Arrays.asList(gift1,gift2,gift3,gift4,gift5));

        Child child1 = new Child(1L, "Iskhak", 20, new Gift(), 0,5);
        Child child2 = new Child(2L, "AbdulKhafiz", 18, new Gift(), 1,3);
        Child child3 = new Child(3L, "Alibek", 20, new Gift(), 2,3);
        Child child4 = new Child(4L, "Bais", 20, new Gift(), 1,5);
        Child child5 = new Child(5L, "Asad", 20, new Gift(), 3,6);
        List<Child>children = new ArrayList<>(Arrays.asList(child1,child2,child3,child4,child5));

        Santa santa = new Santa(gifts,1,0,0);
        List<Santa> santas = new ArrayList<>(List.of(santa));
        commands(children,santas);

    }
    public static void commands(List<Child> children, List<Santa>santas){
        try {
            while (true){
                System.out.println("""
                        ---------Choice--------
                        1 -> Create children db,
                        2 -> Show all children,
                        3 -> Find child by name,
                        ------------------------
                        4 -> Create santa db,
                        5 -> Show santa,
                        6 -> Give a gift,
                        7 -> Find gift by name;
                        """);
                int choice = new Scanner(System.in).nextInt();
                switch (choice){
                    case 1 -> System.out.println(childService.createDB(children));
                    case 2 -> System.out.println(childService.getAllChild());
                    case 3 -> childService.findByName();
                    case 4 -> serviceSanta.createDB(santas,children);
                    case 5 -> System.out.println(serviceSanta.getAllSanta());
                    case 6 -> System.out.println(serviceSanta.giveAGift());
                    case 7 -> System.out.println(serviceSanta.findByGiftName());
                }
            }
        }catch (InputMismatchException e){
            System.err.println("Wrong input!");
        }
    }
}