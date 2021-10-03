/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * Leandro Higor Pereira de Melo Silvério - Vinicius Araujo Ribeiro
 */
public class Trabalho_em_sala_Raizes_Tabuada_Potencia_Fatorial {
    
    
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        float valor_a, res;
        int menu, pot, aux, num, res_a = 0;
        boolean primo;
        primo = true;
//////        
        //Pedindo Valor ao Usuário
        System.out.println("----------------------------------------------");
        System.out.print("Digite o Valor de 1 até 5 que deseja descobrir:");
        valor_a = entrada.nextInt();
        System.out.println("----------------------------------------------");
        
        //Pedindo o resultado desejado
        if (valor_a < 1 || valor_a > 5 ) {
            System.out.println("Valor inválido, Finalizando!");
        }else{
            System.out.println("\n\n-------------------------------------------------");
            System.out.println("Digite 1 -> para tabuada de (+)");
            System.out.println("Digite 2 -> para tabuada de (-)");
            System.out.println("Digite 3 -> para tabuada de (x)");
            System.out.println("Digite 4 -> para tabuada de (/)");
            System.out.println("Digite 5 -> para (raiz²)");
            System.out.println("Digite 6 -> para (potência)");
            System.out.println("Digite 7 -> para (fatorial)");
            System.out.println("Digite 8 -> para (nº primo)");
            System.out.println("-------------------------------------------------");
            menu = entrada.nextInt();
        
        //Validação da equação pedida    
            switch (menu) {
                //Adição
                case 1: res = 1 + valor_a; 
                    System.out.println("1 + " + valor_a + " = " + res);
                    
                    res = 2 + valor_a; 
                    System.out.println("2 + " + valor_a + " = " + res);
                    
                    res = 3 + valor_a; 
                    System.out.println("3 + " + valor_a + " = " + res);
                    
                    res = 4 + valor_a; 
                    System.out.println("4 + " + valor_a + " = " + res);
                    
                    res = 5 + valor_a; 
                    System.out.println("5 + " + valor_a + " = " + res);
                    
                    res = 6 + valor_a; 
                    System.out.println("6 + " + valor_a + " = " + res);
                    
                    res = 7 + valor_a; 
                    System.out.println("7 + " + valor_a + " = " + res);
                    
                    res = 8 + valor_a; 
                    System.out.println("8 + " + valor_a + " = " + res);
                    
                    res = 9 + valor_a; 
                    System.out.println("9 + " + valor_a + " = " + res);
                   
                    res = 10 + valor_a; 
                    System.out.println("10 + " + valor_a + " = " + res);
                    break;
                
                //Subtração    
                case 2: res = 1 - valor_a; 
                    System.out.println("1 - " + valor_a + " = " + res);
                    
                    res = 2 - valor_a; 
                    System.out.println("2 - " + valor_a + " = " + res);
                    
                    res = 3 - valor_a; 
                    System.out.println("3 - " + valor_a + " = " + res);
                    
                    res = 4 - valor_a; 
                    System.out.println("4 - " + valor_a + " = " + res);
                    
                    res = 5 - valor_a; 
                    System.out.println("5 - " + valor_a + " = " + res);
                    
                    res = 6 - valor_a; 
                    System.out.println("6 - " + valor_a + " = " + res);
                    
                    res = 7 - valor_a; 
                    System.out.println("7 - " + valor_a + " = " + res);
                    
                    res = 8 - valor_a; 
                    System.out.println("8 - " + valor_a + " = " + res);
                    
                    res = 9 - valor_a; 
                    System.out.println("9 - " + valor_a + " = " + res);
                   
                    res = 10 - valor_a; 
                    System.out.println("10 - " + valor_a + " = " + res);
                    break;
                
                //Multiplicação    
                case 3: res = 1 * valor_a; 
                    System.out.println("1 * " + valor_a + " = " + res);
                    
                    res = 2 * valor_a; 
                    System.out.println("2 * " + valor_a + " = " + res);
                    
                    res = 3 * valor_a; 
                    System.out.println("3 * " + valor_a + " = " + res);
                    
                    res = 4 * valor_a; 
                    System.out.println("4 * " + valor_a + " = " + res);
                    
                    res = 5 * valor_a; 
                    System.out.println("5 * " + valor_a + " = " + res);
                    
                    res = 6 * valor_a; 
                    System.out.println("6 * " + valor_a + " = " + res);
                    
                    res = 7 * valor_a; 
                    System.out.println("7 * " + valor_a + " = " + res);
                    
                    res = 8 * valor_a; 
                    System.out.println("8 * " + valor_a + " = " + res);
                    
                    res = 9 * valor_a; 
                    System.out.println("9 * " + valor_a + " = " + res);
                   
                    res = 10 * valor_a; 
                    System.out.println("10 * " + valor_a + " = " + res);
                    break;
                
                //Divisão    
                case 4: res = 1 / valor_a; 
                    System.out.println("1 / " + valor_a + " = " + res);
                    
                    res = 2 / valor_a; 
                    System.out.println("2 / " + valor_a + " = " + res);
                    
                    res = 3 / valor_a; 
                    System.out.println("3 / " + valor_a + " = " + res);
                    
                    res = 4 / valor_a; 
                    System.out.println("4 / " + valor_a + " = " + res);
                    
                    res = 5 / valor_a; 
                    System.out.println("5 / " + valor_a + " = " + res);
                    
                    res = 6 / valor_a; 
                    System.out.println("6 / " + valor_a + " = " + res);
                    
                    res = 7 / valor_a; 
                    System.out.println("7 / " + valor_a + " = " + res);
                    
                    res = 8 / valor_a; 
                    System.out.println("8 / " + valor_a + " = " + res);
                    
                    res = 9 / valor_a; 
                    System.out.println("9 / " + valor_a + " = " + res);
                   
                    res = 10 / valor_a; 
                    System.out.println("10 / " + valor_a + " = " + res);
                    break;
                
                //Raiz    
                case 5: res = (float) java.lang.Math.sqrt(valor_a);
                    System.out.println("A raiz quadrada é: " + res);
                    break;
                
                //Potência    
                case 6:
                    System.out.print("Digite o valor da potência: ");
                    pot = entrada.nextInt();
                    
                    if (pot == 0)
                        res = 1;
                    else{
                        res = valor_a;
                        
                        while (pot > 1){
                            res = res * valor_a;
                            pot--;
                        }
                    }
                    System.out.println("O resultado é: " + res);
                    break;
                
                //Fatorial
                case 7:
                    res = 1;;
                    aux = (int) valor_a;
                    
                    while(aux > 1){
                        res = res * aux;
                        aux--;
                    }
                    System.out.println("O fatorial de " + valor_a + " é: " + res);
                    break;
                    
                //Números primos    
                case 8:
                    System.out.print("Digite um número para ver todos os primos até ele: ");
                    num = entrada.nextInt();
                    res = num;
                    primo = true;
                    
                    for (int i = 0; i <= num; i++) {
                        primo = true;
                        
                        if (i == 1){
                            primo = false;
                        }
                        
                        if (primo) {
                            if ((i%2 == 0) && (i != 2)){
                                primo = false;
                            }
                        }
                        
                        if (primo) {
                            for (int j = 3; j <= (i/2); j++) {
                                if (i % j == 0) {
                                    primo = false;
                                    break;
                                }
                            }
                        }
                        
                        if (primo) {
                            System.out.println("[ " + i + " ]");
                        }
                    }

                   
                }
            }
        }
    }

     
    
    
