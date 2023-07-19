/**
 * 
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Caroline de Oliveira Cordeiro - 121111059
 * 
 */

import java.util.Scanner;

public class Wally{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String linha = sc.nextLine();

        String ultimo = "?";
        
        while (!linha.equals("wally")){
            String[] nomes = linha.split(" ");
            for (String nome : nomes){
                
                if (nome.length() == 5){
                    ultimo = nome;
                }   
                
            }
            System.out.println(ultimo);
            ultimo = "?";
            linha = sc.nextLine();
        }
    }
}