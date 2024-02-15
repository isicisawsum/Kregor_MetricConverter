import java.util.Scanner; //importing Scanner
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //naming Scanner

        boolean going = true; //looping variable

        do {
            System.out.println("Enter a measurement (In meters) to be converted into miles, feet, and inches."); //asking user to input number

            if (in.hasNextDouble()) //statement detecting if user entered a double
            {
                double meters = in.nextDouble(); //defining meters

                double miles = (meters / 1609); //calculating miles

                double feet = (meters * 3.281); //calculating feet

                double inches = (feet * 12); //calculating inches

                System.out.println(meters + " meters converted into miles is " + miles + " miles, converted into feet is " + feet + " feet, and converted into inches is " + inches + " inches."); //outputting all calculations

                going = false; //ending loop
            }
            else if (!in.hasNextDouble()) //user didn't input a measurement
            {
                String trash = in.nextLine(); //defining variable trash
                
                System.out.println(trash + " is not a measurement! Try again!"); //telling user to re-type
            }
        }while (going); //loops while going = true
    }
}
