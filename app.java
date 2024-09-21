import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        
        int a = 10; //liczba2
        double shoeSize = 9.5; //rozmiar 
        char myInitial = 'M'; //nazwa
        String myName = "Matthias"; //imię
        System.out.println(myName + " " + a + " " + shoeSize + " " + myInitial); //wyświetla wartość
        Scanner scanner = new Scanner(System.in);

System.out.println("Please enter a string: "); 
String input = scanner.nextLine();
System.out.println("You entered: " + input);

System.out.println("Please enter a number: "); 
String input2 = scanner.nextLine();
int number = Integer.parseInt(input2);
System.out.println("You entered: " + number);

System.out.println("Please enter a number: "); 
String input3 = scanner.nextLine();
double number2 = Double.parseDouble(input3);
System.out.println("You entered: " + number2);
    }
}