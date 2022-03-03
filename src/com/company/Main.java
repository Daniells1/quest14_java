/*
Criar um programa para calcular o Índice de Massa Corporal de uma pessoa. Levando
em consideração que o cálculo é da seguinte forma:
IMC = PESO / ALTURA * ALTURA

 */

package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dígite a altura");
        double altura = scanner.nextDouble();
        System.out.println("Dígite o peso");
        double peso =  scanner.nextDouble();

        double imc = peso/(altura*altura);
        System.out.println("O seu IMC É = "+imc);
        if(imc < 18.6){
            System.out.println("Abaíxo do Peso");
        }else if(imc >= 18.6 && imc <=24.9){
            System.out.println("Peso Normal");
        }else if(imc >= 25 && imc <=29.9) {
                System.out.println("Sobrepeso");
        }else if(imc >= 30 && imc <=34.9) {
            System.out.println("Obesidade Grau 1");
        }else if(imc >= 35 && imc <=39.9) {
            System.out.println("Obesidade Grau 2");
        }else if(imc > 40) {
            System.out.println("Obesidade Grau 3");
        }



    }
}
