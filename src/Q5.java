/**
 * Created by t00193720 on 21/09/2017.
 */

import java.util.Scanner;

    public class Q5 {
        public static void main(String[] args) {
            double pound;
            double convert;
            Scanner input = new Scanner(System.in);



                System.out.println("How many pounds would you like to convert:" );
            pound = input.nextDouble();
            convert = pound*1.13;
            System.out.println ("You will get €" +convert);

        }


    }

