package onlineshop;

import java.util.Scanner;
import exception.*;

public class OnlineShop {

    public static void main(String[] args) {

        Scanner A = new Scanner(System.in);

        System.out.println("Enter Name");
        String name = A.nextLine();

        System.out.println("Enter Address");
        String address = A.nextLine();

        System.out.println("Enter City");
        String city = A.nextLine();

        System.out.println("Enter number");
        String num = A.nextLine();

        Register B = new Register();

        try {
            B.checkCityNum(city, num);
        } catch (checkCityNumEx e) {
            System.out.println(e);
        }
    }

}
