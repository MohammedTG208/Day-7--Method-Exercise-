import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 1st numbers:");
        int num1=input.nextInt();
        System.out.println("Enter 2nd numbers:");
        int num2=input.nextInt();
        System.out.println("Enter 3th numbers:");
        int num3=input.nextInt();
        smallest(num1,num2,num3);

        System.out.println("============2===========");
        System.out.println("Enter Number:");
        int number=input.nextInt();
        System.out.println( NPZ(number));

        System.out.println("============3===========");
        System.out.println("1. A password must have at least eight characters. \n" +
                "2. A password consists of only letters and digits. \n" +
                "3. A password must contain at least two digits \n" +
                "Input a password (You are agreeing to the above Terms and Conditions.): ");
        String password=input.next();
        CheckPassword(password);
         }

    // 1 - Write a Java method to find the smallest number among three numbers.
    static void smallest(int num1,int num2,int num3){
        if (num1<num2&&num1<num3){
            System.out.println("The smallest value is: "+num1);
        } else if (num2<num1&&num2<num3) {
            System.out.println("The smallest value is: "+num2);
        } else  {
            System.out.println("The smallest value is: "+num3);
        }
    }
    //2 - Write a Java method that check if the entered number is
    //negative or positive or zero.
    static String NPZ(int num){

            if (num>0){
                return "Positive Number.";
            } else if (num<0) {
                return "Negative Number.";
            }else {
                return "Number zero";
            }

    }
    //3 - Write a Java method to check whether a string is a valid password.
    static void CheckPassword(String password) {
        int containDigits = 0;
        int containletter=0;
        int islitter = 0;
        char check;
        if (password.length() >= 8) {
            for (char c:password.toCharArray()){
                if (Character.isLetter(c)){
                    containletter++;
                } else if (Character.isDigit(c)) {
                    containDigits++;
                }
            }
            if (containDigits>=2&&containletter>=2){
                System.out.println("Password is valid: "+password);
            }else {
                System.out.println("A password consists of only letters and digits. \n" +
                        "A password must contain at least two digits ");
            }
        } else {
            System.out.println("A password must have at least eight characters");
        }
    }
}