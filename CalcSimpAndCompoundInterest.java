
package jdd522;

import static java.lang.System.out;
import java.util.Scanner;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


class CalcSimpAndCompoundInterest extends InterestCalculations {

    void selection(){
    Scanner sc = new Scanner(System.in);
    out.println("please choose between\n"
            + "1: Simple Interest\n"
            + "2: Compound Interest");
    
    String x = sc.nextLine();
    
    int y = Integer.parseInt(x);
    
    if (y == 1) {
    SimpleInterest();
    } else {
    CompoundInterest();
    }
    }
    
    @Override
    void SimpleInterest() {
     //get user input from user
     Scanner sc = new Scanner(System.in);
     System.out.println("Please enter the initial principle balance");
     String str = sc.nextLine();
     System.out.println("Please enter the anual interest rate");
     String str1 = sc.nextLine();
     System.out.println("Please enter the time in years");
     String str2 = sc.nextLine();

     //convert strings to doubles
     double P = Double.parseDouble(str);
     double R = Double.parseDouble(str1);
     double T = Double.parseDouble(str2);

     //perform the calculations
     //the initial formula is A = p ( 1 + rt)
     double rt1 = R / 100;
          
     double rt = rt1 * T;
          
     double x = 1 + rt;
          
     double A = P * x;
     
     System.out.println("The answer is " + A);
     try {
     FileWriter myWriter = new FileWriter("C:\\Users\\Dell\\Documents\\NetBeansProjects\\jdd522\\src\\jdd522\\calculations.docx");
     myWriter.write(P + "(" + 1 + rt + ")" + " = " + A );
     myWriter.close();
     }catch (IOException ex) {
     Logger.getLogger(converter.class.getName()).log(Level.SEVERE, null, ex);
     }
     
     JDD522.MainMenu();
    }

    @Override
    void CompoundInterest() {
         //get user input from user
     Scanner sc = new Scanner(System.in);
     System.out.println("Please enter the initial principle balance");
     String str = sc.nextLine();
     System.out.println("Please enter the anual interest rate");
     String str1 = sc.nextLine();
     System.out.println("Please enter number of time periods elapsed");
     String str2 = sc.nextLine();
     System.out.println("Please enter number of times interest applied per time period");
     String str3 = sc.nextLine();
     
     //convert strings to doubles
     double P = Double.parseDouble(str);
     double R = Double.parseDouble(str1);
     double T = Double.parseDouble(str2);
     double N = Double.parseDouble(str3);
     
     //calculate r/n
     double rnn = R/100;
     System.out.println(rnn);
     
     double rn = rnn/N;
     
     double rn1 = 1 + rn;
     System.out.println(rn1);
     
     //calculate nt
     double nt = N * T;
     System.out.println(nt);
     
     //calculate p ( rn1 ) ** nt
     double b = Math.pow(rn1,nt);
     System.out.println( b);
     
     double A = P * b;
     
     System.out.println("The answer is " + A);
     try {
     FileWriter myWriter = new FileWriter("C:\\Users\\Dell\\Documents\\NetBeansProjects\\jdd522\\src\\jdd522\\calculations.docx");
     myWriter.write(P + "(" + rn1 + ")" + "**" + nt + " = " + A );
     myWriter.close();
     
     }catch (IOException ex) {
     Logger.getLogger(converter.class.getName()).log(Level.SEVERE, null, ex);
     }
     
     JDD522.MainMenu();
    }
    
}
