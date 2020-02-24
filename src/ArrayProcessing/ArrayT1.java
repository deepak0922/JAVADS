package ArrayProcessing;

import java.util.Scanner;

//Task1 Array Processing
public class ArrayT1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //create an integer array
        int[] arrInt=new int[10];
        //print the created array
        for (int i = 0; i <arrInt.length ; i++) {
            System.out.print(arrInt[i]+",");
        }
        System.out.println();
        //static initialization
        arrInt[0]=1;
        arrInt[1]=2;
        arrInt[2]=3;
        arrInt[3]=4;
        arrInt[4]=5;
        arrInt[5]=6;
        arrInt[6]=7;
        arrInt[7]=8;
        arrInt[8]=9;
        arrInt[9]=10;
        //printing the static initialized array
        System.out.println("Printing the static initialized array");
        for (int i = 0; i <arrInt.length ; i++) {
            System.out.print(arrInt[i]+",");
        }
        System.out.println();
        //command line initialization
        for(int i=0; i<args.length && i < arrInt.length; i++){
            arrInt[i]=Integer.parseInt(args[i]);
        }
        //Print array command line initialized array
        System.out.println("Printing array command line initialized array");
        for (int i = 0; i <arrInt.length ; i++) {
            System.out.print(arrInt[i]+",");
        }
        //User given initialized
        System.out.println("Enter 10 Integers");
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i]=sc.nextInt();
        }
        System.out.println();
        //Printing the user initialized array
        System.out.println("Printing the user initialized array");
        for (int i = 0; i < arrInt.length; i++) {
            System.out.println(arrInt[i]);
        }
        //Sum and Average
        int sum=0;
        for (int i = 0; i <arrInt.length ; i++) {
            sum=sum+arrInt[i];
        }
        double avg=sum/arrInt.length;
        System.out.println("Sum = "+sum+" and Average = "+avg);
    }

}
