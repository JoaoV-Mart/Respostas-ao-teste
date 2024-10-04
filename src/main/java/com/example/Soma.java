package com.example;

public class Soma {

    public void Somar()
    {
        int indice=12, soma=0, k=1, i=1;
    
        while(i<indice)
        {
            k+=1;
            soma+=k;
            i++;
    
        }
    
        System.out.println("A soma é: " + soma);
    }
}
