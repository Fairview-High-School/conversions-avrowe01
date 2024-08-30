import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author Alice Rowe
 * @version 8/26/2024
 */
public class Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Ounces to Milliliters");
        System.out.println("6. Milliliters to Ounces");
        System.out.println("7. Hours to Minutes");
        System.out.println("8. Minutes to Hours");
        System.out.println("9. Feet to Miles");
        System.out.println("10. Miles to Feet");
        //Add 2 more conversions, each both ways, to add choices 7, 8, 9, and 10.
        //You can add even more if you would like.

        int selection = keyboard.nextInt();
        keyboard.nextLine();  //go past the endline and be ready for more input

        if (selection == 1)
        {
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit");
        }
        if (selection == 2)
        {
            System.out.println("Enter Fahrenheit: ");
            double fahrenheit = keyboard.nextDouble();
            keyboard.nextLine();
            double celsius = (fahrenheit - 32) * (5.0/9.0);
            System.out.println(fahrenheit + " degrees Fahrenheit is " + celsius + " degrees Fahrenheit");
            //add the code to ask the user to enter Fahrenheit and then convert to Celsius
        }
        if (selection == 3)
        {
            System.out.println("Enter Feet: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double meters = feet * 0.3048;
            System.out.println(feet + " feet is " + meters + " meters");
        }
        if (selection == 4)
        {
            System.out.println("Enter Meters: ");
            double meters = keyboard.nextDouble();
            keyboard.nextLine();
            double feet = meters / 0.3048;
            System.out.println(meters + " meters is " + feet + " feet");
        }
        if (selection == 5)
        {
            System.out.println("Enter Ounces: ");
            double ounces = keyboard.nextDouble();
            keyboard.nextLine();
            double milliliters = ounces * 29.57353;
            System.out.println(ounces + " ounces is " + milliliters + " milliliters");
        }
        if (selection == 6)
        {
            System.out.println("Enter Milliliters: ");
            double milliliters = keyboard.nextDouble();
            keyboard.nextLine();
            double ounces = milliliters / 29.57353;
            System.out.println(milliliters + " milliliters is " + ounces + " ounces");
        }
        if (selection == 7)
        {
            System.out.println("Enter Hours: ");
            double hours = keyboard.nextDouble();
            keyboard.nextLine();
            double minutes = hours * 60.0;
            System.out.println(hours + " hours is " + minutes + " minutes");
        }
        if (selection == 8)
        {
            System.out.println("Enter Minutes: ");
            double minutes = keyboard.nextDouble();
            keyboard.nextLine();
            double hours = minutes / 60.0;
            System.out.println(minutes + " minutes is " + hours + " hours");
        }
        if (selection == 9)
        {
            System.out.println("Enter Feet: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double miles = feet / 5280.0;
            System.out.println(feet + " feet is " + miles + " miles");
        }
        if (selection == 10)
        {
            System.out.println("Enter Miles: ");
            double miles = keyboard.nextDouble();
            keyboard.nextLine();
            double feet = miles * 5280.0;
            System.out.println(miles + " miles is " + feet + " feet");
        }
        //add more if statements here.
    }
}