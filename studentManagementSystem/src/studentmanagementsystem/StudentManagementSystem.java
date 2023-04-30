
package studentmanagementsystem;

import checkstudentinformation.*;
import java.util.Scanner;

public class StudentManagementSystem {


    public static void main(String[] args) {
        
        Scanner A = new Scanner(System.in);
        
        System.out.println("Enter First Name");
        String firstName = A.nextLine();
        
        System.out.println("Enter last Name");
        String lastName = A.nextLine();
        
        System.out.println("Enter your Email");
        String email = A.nextLine();
        
        System.out.println("Enter Mobile Number");
        String num = A.nextLine();
        
        Student B = new Student();
        
        try{
            B.checkStudentInfo(firstName, lastName, email, num);
        }catch(checkStudentInformation e){
            System.out.println(e);
        }
        
    }
    
}
