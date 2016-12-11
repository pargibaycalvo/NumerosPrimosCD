package NumerosPrimos;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class NumerosPrimos {

    /**
     * @param args the command line arguments
     */
    //Codificado por: sAfOrAs
    //LIstar los numeros según el numero de digitos indicado
    //Considero solo hasta numeros menores a 100000 (5 digitos), 
    //por el hecho de k buscar numeros primos a partir de 6 digitos, el proceso se hace muy lento.

    public static boolean primo = false;
    
    public int pedirdigitos(){
       Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero entre 1 y 5:");
       int num = sc.nextInt();
        System.out.println("");
        while(num<1||num>5){
            System.out.println("Introduzca un numero entre 1 y 5:");
            num = sc.nextInt();
            System.out.println("");
        }
        return num;
    }
    
    public int calcdigitos(int numero){
            int divisionEntera = numero;
            int contador=0; 
            while (divisionEntera != 0){
            divisionEntera = divisionEntera / 10;
            contador++;
        }
        return contador;
            
    public void calculoprimos(int i){   
        
            if (i < 4){
             primo = true;
            }else if (i % 2 == 0){
             primo = false; 
            }else{
                int contador1 = 0;  
                int i1 = 1; 
                int limite = (i - 1) / 2; 
             if  (limite % 2 == 0) {
                 limite--; 
             }
             while(i1 <= limite){
              if (i % i1 == 0){
                  contador1++;
              }
              i1 += 2;
              if (contador1 == 2){
                  i1 = limite + 1;
                    }
             }
 
              if (contador1 == 1){ 
                  primo = true;
            } 
        }
    }
    public void imprime(int i){ 
                if (primo == true){ 
                    System.out.println(i);    
            }
        }
        }
 
       
 
