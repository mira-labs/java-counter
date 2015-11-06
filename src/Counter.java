/**
 * Created by rad on 06/11/2015.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args){
        Scanner input = null;
        double sum = 0;
        try {
            File file = new File("numbers.txt");
            //This is the entire logic - not using arrays
            input = new Scanner(file);
            while (input.hasNextDouble()) {
                sum += input.nextDouble();
            }
            // output results in the correct way
            System.out.printf("The total sum of the "
                    + "doubles in the input file is %f\n", sum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            input.close();
        }
    }


}
