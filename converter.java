
package jdd522;

import java.util.Scanner;
import static java.lang.System.out;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

class converter extends CurrencyConverter {
    Scanner sc = new Scanner(System.in);
    @Override
 void convertcurrency(){
 out.println("which currency would you like to convert to?\n"
         + "1: US Dollar\n"
         + "2: Euro\n"
         + "3: Yen");
 String input = sc.nextLine();
 out.println("Please enter the amount you would like to convert");
 String x = sc.nextLine();
 
 //convert string input to integer
 int a = Integer.parseInt(input);
 
 //convert amount input to double
 double b = Double.parseDouble(x);

 
        //create switch statement to excecute action based on input from user
        switch (a) {
            
            case 1:
                {
     try {
         FileWriter myWriter = new FileWriter("C:\\Users\\Dell\\Documents\\NetBeansProjects\\jdd522\\src\\jdd522\\calculations.docx");
         double ans = b * 0.061;
         out.println("your answer is: " + ans + " US dollars\n");
         myWriter.write(x + " X 16.52" + " = " + ans);
         myWriter.close();
         JDD522.MainMenu();
         break;
     } catch (IOException ex) {
         Logger.getLogger(converter.class.getName()).log(Level.SEVERE, null, ex);
     }
                    
                }
            case 2:
                {
                    try{
                        FileWriter myWriter = new FileWriter("C:\\Users\\Dell\\Documents\\NetBeansProjects\\jdd522\\src\\jdd522\\calculations.docx");
                         double ans = b * 0.053;
                    out.println("your answer is: " + ans + " euro\n");
                    myWriter.append(x + " X 0.053" + " = " + ans);
                    myWriter.close();
                    JDD522.MainMenu();
                    break;
                    } catch (IOException ex) {
                    Logger.getLogger(converter.class.getName()).log(Level.SEVERE, null, ex);}
                   
                }
            case 3:
                {
                    try {
                    FileWriter myWriter = new FileWriter("C:\\Users\\Dell\\Documents\\NetBeansProjects\\jdd522\\src\\jdd522\\calculations.docx");

                    double ans = b * 6.49;
                    out.println("your answer is: " + ans + " yen\n");
                    myWriter.write(x + " X 6.50" + " = " + ans);
                    myWriter.close();
                    JDD522.MainMenu();
                    break;
                    } catch (IOException ex) {
                    Logger.getLogger(converter.class.getName()).log(Level.SEVERE, null, ex);
}
                }
            default:
                break;
        
        }
 }   
}
