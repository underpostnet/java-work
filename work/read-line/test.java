import java.io.*;
import java.util.*;

public class test
{
    public static void main(String args[]){  
        Scanner rl = new Scanner(System.in);
            
        System.out.println("ingrese altura: ");
        int altura = rl.nextInt(); 
        
        System.out.println("ingrese base: ");    
        int base = rl.nextInt();
        
        System.out.println("Area Triangulo: "+((altura*base)/2));
    }
}
