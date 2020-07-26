
package jdd522;

import static java.lang.System.out;
import java.util.Scanner;


public class JDD522
{
    static void MainMenu(){
        try {
    //create scanner obj for user input
    Scanner input = new Scanner(System.in);
    //print out intructions for user
    out.println("Please choose from one of the options below");
    //print out options for user
    out.println("1: Addition\n"
              + "2: Subtraction\n"
              + "3: Multiplication\n"
              + "4: Devision\n"
              + "5: Simple & Compound interest\n"
              + "6: Currency converter\n"
              + "7: Exit");
    
    String x = input.nextLine();
    
    //convert string into int
    int y = Integer.parseInt(x);
    
   
    
    //create switch case for condition of user input
    switch (y) {
        case 1:
            calculator obj = new calculator();
            obj.addition();
            break;
        case 2:
            calculator obj1 = new calculator();
            obj1.subtraction();
            break;
        case 3:
            calculator obj2 = new calculator();
            obj2.multiplication();
            break;
        case 4:
            calculator obj3 = new calculator();
            obj3.devision();
            break;
        case 5:
            CalcSimpAndCompoundInterest obj4 = new CalcSimpAndCompoundInterest();
            obj4.selection();
            break;
        case 6:
            converter obj5 = new converter();
            obj5.convertcurrency();
            break;
        default:
    }
         } catch(NumberFormatException ne) {
        out.println("Please enter a number\n");
        JDD522.MainMenu();
        }
    }
    
    
    

    public static void main(String[] args) {
        MainMenu();
    }
}
