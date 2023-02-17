import java.util.Scanner;
public class App {

    static String isPalindrom(int number){
        int temp=number,reverseNumber=0,lastNumber;
        while(temp != 0){

            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }

        if (number == reverseNumber){
            return (number + " - sayısı palindromdur.");
        }
        else 
            return (number + " - sayısı palindrom değildir!");
    }
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int n = inp.nextInt(); 
        System.out.print(isPalindrom(n));
    }
}