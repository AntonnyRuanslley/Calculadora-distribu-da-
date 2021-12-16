
import java.io.*;
import java.rmi.*;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Calculadora {
    public static void main(String args[ ]) {
        //Cria e instala o security manager
        //    System.setSecurityManager (new RMISecurityManager () );
        try {
            while(true) {
                System.out.println("Calculadora Ligada\nInsira os valores\n");
                Scanner scn = new Scanner(System.in);
                String entrada = scn.nextLine();
                var aux = entrada.split(" ");
                int num1 = parseInt(aux[0].trim());
                int num2 = parseInt(aux[2].trim());
                char sinal = aux[1].trim().charAt(0);
                if (sinal == '+' || sinal == '-' || sinal == '/' || sinal == '*') {
                    RM1 obj = (RM1) Naming.lookup("rmi://localhost:160/RM1Server");
                    switch (sinal) {
                        case '+':
                            System.out.println(obj.adicao(num1, num2));
                            break;
                        case '-':
                            System.out.println(obj.subtracao(num1, num2));
                            break;
                        case '/':
                            System.out.println(obj.divisao(num1, num2));
                            break;
                        case '*':
                            System.out.println(obj.multiplicacao(num1, num2));
                    }
                } else {
                    RM2 obj2 = (RM2) Naming.lookup("rmi://localhost:150/RM2Server");
                    float num3 = num1;
                    float num4 = num1;
                    switch (sinal) {
                        case '^':
                            System.out.println(obj2.potenciacao(num3, num4));
                            break;
                        case '%':
                            System.out.println(obj2.porcentagem(num1, num2));
                            break;
                        case 'V':
                            System.out.println(obj2.raizQuadrada(num3, num4));
                    }
                }
            }
        } catch(Exception e) {
            System.out.println("Calculadora erro "+ e.getMessage());
        }
        System.exit(0);
    }
}