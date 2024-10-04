package com.example;
import java.util.ArrayList;
import java.util.Scanner;

public class ChecaFibonacci {
    
    public void PertenceaFibonacci(){
        System.out.println("Digite um valor para saber se ele pertence à sequência de Fibonacci:");

        ArrayList<Integer> listaFibonacci = new ArrayList<>();
        Scanner leia = new Scanner(System.in);

        int valor = leia.nextInt();

        
        listaFibonacci.add(0);
        listaFibonacci.add(1);
        
        int j=2;
        while(true)
        {
            int numeroAdd = listaFibonacci.get(j-1)+listaFibonacci.get(j-2);
            
            if(numeroAdd > valor)
            {
                break;
            }
            
            listaFibonacci.add(numeroAdd);
            j++;
        }
        
        if(listaFibonacci.contains(valor))
        {
            System.out.println("Esse valor pertence à sequência de Fibonacci");
        } else {
            System.out.println("Esse valor não pertence à sequência de Fibonacci");
        }
        
        leia.close();

    }
}
