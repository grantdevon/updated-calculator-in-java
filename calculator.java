
package jdd522;

import java.util.Scanner;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

//this is the calculator class to handle the calculator part of the applications
public class calculator implements functions {
Scanner input = new Scanner(System.in);
    @Override
    public void addition() {
        
        
     //prompt user for first digit
     System.out.println("Please enter your first digit");
     String a = input.nextLine();
     //prompt user for second digit
     System.out.println("Please enter your second digit");
     String b = input.nextLine();
     
     //convert both inputs into integers
     int x = Integer.parseInt(a);
     int y = Integer.parseInt(b);
     
     //create a int for the result of the x and y integers
     int results = x + y;
     
     System.out.println("your answer is " + results + "\n");
     try{
     FileWriter myWriter = new FileWriter("C:\\Users\\Dell\\Documents\\NetBeansProjects\\jdd522\\src\\jdd522\\calculations.docx");
     myWriter.write(results + " = " + x + " + " + y);
     myWriter.close();
     }catch(IOException ex){
     Logger.getLogger(converter.class.getName()).log(Level.SEVERE, null, ex);

     }
     
     //call main menu function after everything
     JDD522.MainMenu();
    }

    @Override
    public void subtraction() {
     //prompt user for first digit
     System.out.println("Please enter your first digit");
     String a = input.nextLine();
     //prompt user for second digit
     System.out.println("Please enter your second digit");
     String b = input.nextLine();
     
     //convert both inputs into integers
     int x = Integer.parseInt(a);
     int y = Integer.parseInt(b);
     
     //create a int for the result of the x and y integers
     int results = x - y;
     
     System.out.println("your answer is " + results + "\n");
     try{
     FileWriter myWriter = new FileWriter("C:\\Users\\Dell\\Documents\\NetBeansProjects\\jdd522\\src\\jdd522\\calculations.docx");
     myWriter.write(results + " = " + x + " - " + y);
     myWriter.close();
     }catch(IOException ex){
     Logger.getLogger(converter.class.getName()).log(Level.SEVERE, null, ex);

     }
     
     //call main menu function after everything
     JDD522.MainMenu();
    }

    @Override
    public void multiplication() {    
     //prompt user for first digit
     System.out.println("Please enter your first digit");
     String a = input.nextLine();
     //prompt user for second digit
     System.out.println("Please enter your second digit");
     String b = input.nextLine();
     
     //convert both inputs into integers
     int x = Integer.parseInt(a);
     int y = Integer.parseInt(b);
     
     //create a int for the result of the x and y integers
     int results = x * y;
     
     System.out.println("your answer is " + results + "\n");
     try{
     FileWriter myWriter = new FileWriter("C:\\Users\\Dell\\Documents\\NetBeansProjects\\jdd522\\src\\jdd522\\calculations.docx");
     myWriter.write(results + " = " + x + " X " + y);
     myWriter.close();
     }catch(IOException ex){
     Logger.getLogger(converter.class.getName()).log(Level.SEVERE, null, ex);

     }
     
     //call main menu function after everything
     JDD522.MainMenu();
    }

    
    @Override
    public void devision() {       
     //prompt user for first digit
     System.out.println("Please enter your first digit");
     String a = input.nextLine();
     //prompt user for second digit
     System.out.println("Please enter your second digit");
     String b = input.nextLine();
     
     //convert both inputs into integers
     int x = Integer.parseInt(a);
     int y = Integer.parseInt(b);
     
     //create a int for the result of the x and y integers
     double results = x / y;
     
     System.out.println("your answer is " + results + "\n");
     try{
     FileWriter myWriter = new FileWriter("C:\\Users\\Dell\\Documents\\NetBeansProjects\\jdd522\\src\\jdd522\\calculations.docx");
     myWriter.write(results + " = " + x + " / " + y);
     myWriter.close();
     }catch(IOException ex){
     Logger.getLogger(converter.class.getName()).log(Level.SEVERE, null, ex);

     }
     
     //call main menu function after everything
     JDD522.MainMenu();
    }
    
}
