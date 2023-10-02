package Main;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        /* Encapsulation */
        User u = new User(1213, "Jhon-Rhey", "Jhon-Rhey", "Mejos");
        u.setUserID(41222);
        int id = u.getUserID();
        System.out.println(id);
        
        
        Character c1 = new Character("Jhon-Rhey", "Hello", 100, 50, 5);
        Character c2 = new Character("Jhon-Rhey", "Hello", 100, 50, 5);
        System.out.println(c1.dialog);
        System.out.println(c2.dialog);
        
        Student a = new Student("Mejos", "Jhon-Rhey", "1", "BSCS", "C", 90.6f, 99.9f);
        
        System.out.println("Name: ");
        String name = s.nextLine();
        
        System.out.println("Price: ");
        float price = s.nextFloat();
        
        Product p = new Product(name, price);
        Person p1 = new Person("Jhon-Rhey", "Mejos", 'M', 22);
        Person p2 = new Person("Roronoa", "Zoro", 'M', 19);
        Person p3 = new Person("Tony Tony", "Chopper", 'M', 17);
        Person p4 = new Person("Nico", "Robin", 'F', 28);
        
        System.out.println(p1.firstname);
        System.out.println(p1.lastname);
        System.out.println(p1.sex);
        System.out.println(p1.age);
        System.out.println(p2.firstname);
        System.out.println(p2.lastname);
        System.out.println(p2.sex);
        System.out.println(p2.age);
        System.out.println(p3.firstname);
        System.out.println(p3.lastname);
        System.out.println(p3.sex);
        System.out.println(p3.age);
        System.out.println(p4.firstname);
        System.out.println(p4.lastname);
        System.out.println(p4.sex);
        System.out.println(p4.age);
        
        
        Product p5 = new Product("Egg",150.0f);
        Product p6 = new Product("Rice",12.50f);
        Product p7 = new Product("Chocolate",20.20f);
        Product p8 = new Product("Milktea",50.0f);
        
        System.out.println(p5.name);
        System.out.println(p5.price);
        System.out.println(p6.name);
        System.out.println(p6.price);
        System.out.println(p7.name);
        System.out.println(p7.price);
        System.out.println(p8.name);
        System.out.println(p8.price);
        
        
    }
    
}
