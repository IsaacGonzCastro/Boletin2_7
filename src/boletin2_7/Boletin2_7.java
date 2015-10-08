
package boletin2_7;

import java.util.Scanner;


public class Boletin2_7 {

    public static void main(String[] args) {
        double n, i, t ;
        Scanner obx = new Scanner(System.in);
        System.out.println("Teclea nominal :");
        n = obx.nextDouble();
        System.out.println("Teclea interes anual :");
        i = obx.nextDouble();
        System.out.println("Teclea tempo :");
        t = obx.nextDouble();
        t = t*12;
        System.out.println("Renda mensual ="+(n*Math.pow((1+(i/1200)),t)*(i/1200))/(Math.pow((1+(i/1200)), t)-1));
 
    }
    
}
