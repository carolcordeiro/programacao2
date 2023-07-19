/**
 * 
 * LAboratório de Programação 2 - Lab 1
 * 
 * @author Caroline de Oliveira Cordeiro - 121111059   
 */

import java.util.Scanner;

public class MaiorQMedia{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String seq = sc.nextLine();

        int cont = 0;
        int media;

        for (int num : seq.nextInt()){
            media += num;
            cont += 1;
        }   
            System.out.println(media);

        /*        for (Integer num : seq.split(" ")){
            media += num;
        }

        media /= seq.lenght;

        for (int num : seq.split(" ")){
            if(num > media){
                System.out.print(num + " ");
            }
        }*/
    }
}