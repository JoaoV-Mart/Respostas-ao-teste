package com.example;
import java.util.Scanner;

public class ChecaLetra {
    
    public void PertenceaString()
    {
        System.out.println("Escreva uma palavra:");

        Scanner s = new Scanner(System.in);
        String input = s.nextLine();

        int total = 0;
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i) == 'a' || input.charAt(i) == 'A')
            {
                total+=1;
            }

        }

        if(total > 0)
        {
            System.out.println("Existem "+total+ " letras 'A' minúsculas e/ou maiúsculas na frase digitada!");
        } else {
            System.out.println("Não existe a letra 'A' minúscula ou maiúscula na frase digitada!");
        }

        s.close();
    }
}
