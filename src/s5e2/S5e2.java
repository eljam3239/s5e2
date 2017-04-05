/*
 * April 4
 * Determines if a customers pack
 */

package s5e2;
import java.util.Scanner;
/**
 *
 * @author eljam3239
 */
public class S5e2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //receives dimensions and mass of user's package
        Scanner input = new Scanner(System.in);
        double length, width, height, weight;
        System.out.println("Please input the weight of your package in kg: ");
        weight = input.nextDouble();
        System.out.println("Please input the height of your package in cm: ");
        height = input.nextDouble();
        System.out.println("Please input the length of your package in cm: ");
        length = input.nextDouble();
        System.out.println("Please input the width of your package in cm: ");
        width = input.nextDouble();
        //calculates the volume of the package based on the user's inputted dimensions
        double volume = width*height*length;
        //prints the dimensions and weight of the package and weither or not it passed the parameters
        if (volume>100000){
            System.out.println("Length(cm): "+length+"\nWidth(cm): "+width+"\nHeight(cm): "+height+"\nWeight(kg); "+weight+"\nToo volumous:(");
        }else if (weight>27){
            System.out.println("Length(cm): "+length+"\nWidth(cm): "+width+"\nHeight(cm): "+height+"\nWeight(kg); "+weight+"\nToo heavy:(");
        }else {
            System.out.println("Length(cm): "+length+"\nWidth(cm): "+width+"\nHeight(cm): "+height+"\nWeight(kg): "+weight+"\nAll good!");
        }
    }
    
}
