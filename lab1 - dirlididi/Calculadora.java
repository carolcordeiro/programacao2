/**
 * 
 * LAboratório de Programação 2 - Lab 1
 * 
 * @author Caroline de Oliveira Cordeiro - 121111059   
 */

import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String operador = sc.next();

        if (operador.equals("+")){
            double num1 = sc.nextFloat();
            double num2 = sc.nextFloat();
            double result = num1 + num2;
            System.out.println("RESULTADO: " + result);

        }else if(operador.equals("-")){
            double num1 = sc.nextFloat();
            double num2 = sc.nextFloat();
            double result = num1 - num2;
            System.out.println("RESULTADO: " + result);

        }else if(operador.equals("*")){
            double num1 = sc.nextFloat();
            double num2 = sc.nextFloat();
            double result = num1 * num2;
            System.out.println("RESULTADO: " + result);

        }else if(operador.equals("/")){
            double num1 = sc.nextFloat();
            double num2 = sc.nextFloat();
            
            if (num2 != 0){
                double result = num1 / num2;
                System.out.println("RESULTADO: " + result);   
            }else{
                System.out.println("ERRO");
            }
        }else{
            System.out.println("ENTRADA INVALIDA");
        }
    }
}