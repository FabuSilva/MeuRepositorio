package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro paramentro!");
        int n1= sc.nextInt();
        System.out.println("Digite o segundo paramentro");
        int n2= sc.nextInt();
        if(!check(n1,n2)){
            throw new ParametrosInvalidosException();
        }
        contador(n1,n2);

    }

    public static boolean check(int n1, int n2) {
        if(n1 >= n2){
            return false;
        }
        return true;
    }

    public static void contador(int n1, int n2){
        int contagem = n2-n1;
        for(int i=0; i<= contagem;i++){
            System.out.println("Imprimindo o número "+i);
        }
    }
}
