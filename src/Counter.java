/**
 * Created by rad on 06/11/2015.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) throws FileNotFoundException {

        double sum = 0;

        File myFile = new File("numbers.txt");
        Scanner scan = new Scanner(myFile);

        while (scan.hasNextDouble()) {
            sum += scan.nextDouble();
        }

        // output results in the correct way
        System.out.print("The total sum of is " + sum);

    }
}
