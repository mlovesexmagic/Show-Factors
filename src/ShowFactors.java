
/**
 *
 * @author Zhipeng (Adrian) Mei
 */
public class ShowFactors {
    
    public static void showFactors(int number){
        
        System.out.print("The factors for " + number + ": ");
        showFactors(number, 2); 
        System.out.println(" \n");
    }
    
    
    private static void showFactors(int number, int factor){
 
        if(number != 1){
            if(number % factor == 0){

                number = number / factor;
                showFactors(number, factor);
                System.out.print(factor + " ");

            } else {             
                showFactors(number, factor + 1);
            }
        }            
    }
  
}

