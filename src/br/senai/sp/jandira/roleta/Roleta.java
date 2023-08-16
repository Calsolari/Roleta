package br.senai.sp.jandira.roleta;

import java.util.Random;
import java.util.Scanner;

public class Roleta {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            int numeroEscolhido;
            int numeroSorteado;

            System.out.println("Bem-vindo à Roleta!");
            System.out.print("Escolha um número (0-36): ");
            numeroEscolhido = scanner.nextInt();

            if (numeroEscolhido < 0 || numeroEscolhido > 36) {
                System.out.println("Número inválido. O programa será encerrado.");
                return;
            }

            System.out.println("A roleta está girando...");
            numeroSorteado = random.nextInt(37); // Gera um número aleatório entre 0 e 36

            System.out.println("O número sorteado foi: " + numeroSorteado);

            if (numeroEscolhido == numeroSorteado) {
                System.out.println("Parabéns! Você acertou o número. O programa será encerrado.");
            } else {
                System.out.println("Que pena! Tente novamente na próxima vez.");
            }

            scanner.close();
        }
    }


