/**
 *
 * @author Zhipeng (Adrian) Mei
 */
import java.util.Scanner;
public class testFactors {
    
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
    
        int testNumber;
        ShowFactors testingShowFactors = new ShowFactors();
       
        //boolean condition. while loop for continous method run
        boolean done = false;
        while(!done){
            //prompt and get user's number input
            System.out.print("Enter a number, and I will display its prime factors in descending order\n(enter 0 to exist program): ");
            testNumber = in.nextInt();
            
            //"0" method to quit program
            if(testNumber != 0){
                testingShowFactors.showFactors(testNumber);                
            } else {
                System.out.println("Goodbye!");
                done = true;
            }   
        }
    }
}
