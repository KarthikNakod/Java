/*Develop a Java program to create a class Student with members USN and
Name. Include methods to accept and display student details. Create multiple
student objects and display their information.*/

import java.util.Scanner;
class StudentInput{
    String USN;
    String Name;

    void accept(Scanner sc){
        

        System.out.print("Enter USN :");
        USN = sc.nextLine();
        System.out.println();

        System.out.print("Enter Name :");
        Name = sc.nextLine();

    }

    void display(){
        System.out.println("---Student Details---");
        System.out.println("Name :"+Name);
        System.out.println("USN :"+USN);
    }
}

class Student{
    public static void main(String[] args) {
        StudentInput s1 = new StudentInput();
        StudentInput s2 = new StudentInput();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student 1 details :");

        s1.accept(sc);
        System.out.println("Enter Student 2 details :");

        s2.accept(sc);


        s1.display();
        s2.display();

        sc.close();
    }
}