/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arithmethicprog;

/**
 *
 * @author USER
 */
//Question 1
/*import java.util.Scanner;
public class ArithmethicProg {

    public static void main(String[] args) {
 // Declare and initialize variables a and b
        int a = 5, b = 10;

        // Perform addition and print the result
        int sum = a + b;
        System.out.println("1. " + a + " + " + b + " = " + sum);

        // Perform subtraction and print the result
        int minus = a - b;
        System.out.println("2. " + a + " - " + b + " = " + minus);

        // Perform multiplication and print the result
        int multiply = a * b;
        System.out.println("3. " + a + " x " + b + " = " + multiply);

        // Perform division and print the result
        int divide = a / b;
        System.out.println("4. " + a + " / " + b + " = " + divide);

        // Perform modulus and print the remainder
        int modulus = a % b;
        System.out.println("5. Remainder = " + modulus);

        // Perform increment and decrement operations
        // and print the results
        a++;
        b--;
        System.out.print("6. Increment of 5 = ");
        System.out.println(a);
        System.out.print("7. Decrement of 10 = ");
        System.out.println(b);        
    }}

//Question 2

/*import java.util.Scanner;

public class ArithmethicProg {

    public static void main(String[] args) {
        // Declare variables to store name, age, hobby, and favorite food
        String name, hobby, favoritefood;
        int age;
        Scanner read = new Scanner(System.in);

        // Prompt the user to enter their name 
        //and read it using read.nextLine()
        System.out.println("Please enter name:");
        name = read.nextLine();

        // Prompt the user to enter their age 
        //and read it using read.nextInt()
        System.out.println("Please enter age:");
        age = read.nextInt();

        // Prompt the user to enter their hobby and read it using read.nextLine()
        // (the first read.nextLine() is 
        //to consume the newline character left by read.nextInt())
        System.out.println("Please enter hobby:");
        read.nextLine();
        hobby = read.nextLine();

        // Prompt the user to enter their favorite food 
        //and read it using read.nextLine()
        System.out.println("Please enter favorite food:");
        favoritefood = read.nextLine();
        read.close();

        // Print the user's information
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
        System.out.println("Hobby :" + hobby);
        System.out.println("Favorite food :" + favoritefood);        
    }}*/

//Question 3

/*import java.util.Scanner;

public class ArithmethicProg {

    public static void main(String[] args) {
        
        // Declare variables to store birth year and current year
        int birth_year, current_year;
        Scanner read = new Scanner(System.in);

        // Prompt the user to enter the birth year 
        //and read it using read.nextInt()
        System.out.println("Please enter birth year:");
        birth_year = read.nextInt();

        // Prompt the user to enter the current year 
        //and read it using read.nextInt()
        System.out.println("Please enter current year:");
        current_year = read.nextInt();
        // Close the Scanner object after reading all input
        read.close();

        // Calculate the age by subtracting the birth year from the current year
        int age = current_year - birth_year;
        // Print the calculated age
        System.out.println("Your age is " + age);
    }}*/

//Question 4

/*import java.util.Scanner;

public class ArithmethicProg {

    public static void main(String[] args) {
        
        // Declare variables to store name, ID, subject, and test marks
        String name, id, subject;
        double Test1, Test2;
        Scanner read = new Scanner(System.in);

        // Prompt the user to enter the name and read it using read.nextLine()
        System.out.println("Enter name :");
        name = read.nextLine();

        // Prompt the user to enter the ID and read it using read.nextLine()
        System.out.println("Enter ID :");
        id = read.nextLine();

        // Prompt the user to enter the subject and read it 
        //using read.nextLine()
        System.out.println("Enter subject :");
        subject = read.nextLine();

        // Prompt the user to enter the Test1 mark and read it 
        //using read.nextDouble()
        System.out.println("Enter Test1 mark (/100) :");
        Test1 = read.nextDouble();

        // Prompt the user to enter the Test2 mark and read it 
        //using read.nextDouble()
        System.out.println("Enter Test2 mark (/100) :");
        Test2 = read.nextDouble();
        read.close();

        // Calculate the average mark by adding the two test marks 
        //and dividing by 2
        double average = (Test1 + Test2) / 2;
        // Print the average mark
        System.out.println("The average mark is " + average);
    }}*/

// Question 5

/*import java.util.Scanner;

public class ArithmethicProg {

    public static void main(String[] args) {
        // Declare variables to store item name, quantity, price, 
        //and discount rate
        String item_name;
        int quantity = 0;
        double price = 0, discount_rate = 0;
        Scanner read = new Scanner(System.in);
        
        // Prompt the user to enter the item name and read it 
        //using read.nextLine()
        System.out.println("Enter item name :");
        item_name = read.nextLine();
        
        // Prompt the user to enter the price and read it 
        //using read.nextDouble()
        System.out.println("Enter price ( RM ) :");
        price = read.nextDouble();
        
        // Prompt the user to enter the quantity and read it 
        //using read.nextInt()
        System.out.println("Enter quantity :");
        quantity = read.nextInt();
        
        // Calculate the total price by multiplying the price and quantity
        double sum = price * quantity;
        System.out.println("Total price = RM " +sum);
        
        // Prompt the user to enter the discount rate and read it 
        //using read.nextDouble()
        System.out.println("Enter discount rate (%) :");
        discount_rate = read.nextDouble();
        read.close();
        // Calculate the final price after applying the discount
        double finalprice = sum - (sum * discount_rate / 100);
        // Print the final price after discount        
        System.out.println("Price after discount is RM " +finalprice);
        
    }}*/

//Question 6

/*import java.util.Scanner;

public class ArithmethicProg {

    public static void main(String[] args) {
        // Declare variables to store height and weight
        double height, weight;
        Scanner read = new Scanner(System.in);
        
        // Prompt the user to enter height in metres
        System.out.println("Enter height in metres");
        // Read the user's height input and store it in the height variable
        height = read.nextDouble();
        
        // Prompt the user to enter weight in kilograms
        System.out.println("Enter weight in kilograms");
        // Read the user's weight input and store it in the weight variable
        weight = read.nextDouble();
        read.close();
        
        // Calculate the BMI using the formula: weight / (height * height)
        double BMI = weight / (height * height);
        System.out.println("Your BMI is " +BMI);
       
    }}*/

//Question 7

/*import java.util.Scanner;

public class ArithmethicProg {

    public static void main(String[] args) {
    
        int a = 5;
                      
        System.out.println("Initial values:");
        System.out.println("a = " + a);

        System.out.println("\nPre-increment (++a):");
        // Pre-increment: Increments the value of 'a' by 1 
        //and then uses the updated value
        System.out.println("a = " + ++a);
        System.out.println("a = " + a);

        System.out.println("\nPost-increment (a++):");
        // Post-increment: Uses the current value of 'a'
        //and then increments it by 1
        System.out.println("a = " + a++);
        System.out.println("a = " + a);

        System.out.println("\nPre-decrement (--a):");
        // Pre-decrement: Decrements the value of 'a' by 1 
        //and then uses the updated value
        System.out.println("a = " + --a);
        System.out.println("a = " + a);

        System.out.println("\nPost-decrement (a--):");
        // Post-decrement: Uses the current value of 'a' 
        //and then decrements it by 1
        System.out.println("a = " + a--);
        System.out.println("a = " + a);
    }}*/
        
        

        




