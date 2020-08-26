/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.acheonumero;

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jr
 */
public class Jogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PrintStream imprimir = System.out;
        Scanner sc = new Scanner(System.in);
        Random geradoDeNumero = new Random();

        int opcao;
        int escolhadocomputador;
        int escoladojogado = 0;

        imprimir.println("qual é o seu nome ? ");
        String nome = sc.next();
        imprimir.println("Muito prazer " + nome);
        imprimir.println("estou ancioso para começar o jogo\n ");
        imprimir.println("escolha uma das opções para saber se quer jogar ou não\n 1 para sim\n "
                + "2 para não ");
        imprimir.println("você que jogar comigo");
        while(true){
            
        opcao = sc.nextInt();
        if (opcao == 2) {
            imprimir.println("OK " + nome + "eu espero você na proxima , para jogar comigo");
        }else if(opcao >2){
            imprimir.println("Opção errada\n Escolha uma opção correta entre 1 e 2");
        }else if(opcao < 1){
            imprimir.println("Opção errada\n Escolha uma opção correta entre 1 e 2");
        } else {
            imprimir.println("ok , vou lhe explicar as regras");
            imprimir.println("você tem que escolher um numero de 0 a 10");
            imprimir.println("Se você acertar o numero foi gerado você sera o vencedor ");
            imprimir.println("ok , vamos começar");
            imprimir.println();
            break;
        }
        }
        
        escolhadocomputador = geradoDeNumero.nextInt(11);
        imprimir.println("Tudo certo " + nome + " ja escolhi o um numero ");
        imprimir.println("agora é com você , qual o numero eu selecionei ?");
        
       while(true){
           escoladojogado = sc.nextInt();
           if (escolhadocomputador != escoladojogado){
               imprimir.println("Resposta Errada");
           }else{
               imprimir.println("Parabens você ganhou");
               break;
           }
           


    }
        }

}
