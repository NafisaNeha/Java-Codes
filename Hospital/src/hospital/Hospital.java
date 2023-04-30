package hospital;

import checkInfo.checkInfo;
import java.util.Scanner;

public class Hospital {

    public static void main(String[] args) {

        Scanner A = new Scanner(System.in);

        System.out.println("Enter Age");
        int age = A.nextInt();

        System.out.println("Enter Systolic Blood Pressure");
        int sBP = A.nextInt();

        System.out.println("Enter Diastolic Blood Pressure");
        int dBP = A.nextInt();

        Patient B = new Patient();

        try {
            B.checkInformation(age, sBP, dBP);
        } catch (checkInfo e) {
            System.out.println(e);
        }

    }

}
