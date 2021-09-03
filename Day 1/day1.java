import java.util.Scanner;

class Student {
    int id;
    String name;
    float marks;
    Scanner sc = new Scanner(System.in);
    
    public void input() {
        System.out.println("Enter the id: ");
        id = sc.nextInt();
        sc.nextLine();// This line is must to ignore the error of nextstring
        System.out.println("Enter the name: ");
        name = sc.nextLine();
        System.out.println("Enter the Percentage: ");
        marks = sc.nextFloat();
    };
    
    public void display() {
        System.out.println("************************************");
        System.out.println("*******Entered Details are:*********");
        System.out.println("************************************");
        System.out.println("Student Name: "+name);
        System.out.println("Student id: "+id);
        System.out.println("Student Marks: "+marks);
    };
}

public class day1 {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.input();
        obj.display();
    }
}
