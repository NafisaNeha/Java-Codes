

package spring19.exception.pkg6.b;
import java.util.Scanner;

public class Spring19Exception6B {


    public static void main(String[] args) {
        Student obj = new Student();
        
        Scanner scan = new Scanner(System.in);
        String first,lastName,email,mobile;
        int age;
        try{
            first = scan.nextLine();
            if(first.contains(" "))
            {
                throw new NotValidNameException();
            }
            obj.firstName = first;
            lastName = scan.nextLine();
            if(lastName.contains(" ")){
                throw new NotValidNameException();
            }
            obj.lastName= lastName;
            obj.age = scan.nextInt();
            String a = scan.nextLine();
            email = scan.nextLine();
            if(!email.endsWith("@gmail.com")){
                throw new NotValidEmailException();
            }
            obj.email= email;
            mobile = scan.nextLine();
            if(!mobile.startsWith("+8801")){
                throw new NotValidNumber();
            }
            
        }catch(NotValidNumber e){
            System.out.println("");
        }
    }
    
}
