/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numprimos;
/**
 *
 * @author Ped90
 */
import NumerosPrimos.NumerosPrimos;
public class calculo {
    public static void main(String arg[]){
        NumerosPrimos p1 = new NumerosPrimos();
        int numDigitos = p1.pedirdigitos();
        int ndigitos=0;
        for(int i = 1; i <= 99999; i++ )      
        ndigitos = p1.calcdigitos(i);
        
        
        if(ndigitos == numDigitos){
            p1.calcprimos(i);
            p1.imprime(i);
        }
        
        
        {
        }
}
