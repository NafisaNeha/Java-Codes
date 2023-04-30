package studentmanagementsystem;

import checkstudentinformation.*;

public class Student {

    String firstName;
    String lastName;
    String email;
    int age;
    int num;

    public void checkStudentInfo(String firstName, String lastName, String email, String num) throws checkStudentInformation {

        for (int i = 0; i < firstName.length(); i++) {
            if (firstName.charAt(i) == ' ') {
                throw new checkStudentInformation("Invalid information");
            }
        }
        for (int i = 0; i < lastName.length(); i++) {
            if (lastName.charAt(i) == ' ') {
                throw new checkStudentInformation("Invalid information");
            }
        }

        if (email.endsWith("@gmail.com") && num.startsWith("+8801")) {
            System.out.println("Valid Information");
        } else {
            throw new checkStudentInformation("Invalid information");
        }

    }
}
