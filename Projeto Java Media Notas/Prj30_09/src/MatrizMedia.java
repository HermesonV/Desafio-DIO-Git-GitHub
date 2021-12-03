/*
Programador: Hermeson Vieira
Data: 30/09/2021
Objetivo: Calcule a média dos alunos de uma disciplina.
 */
import javax.swing.*;
public class MatrizMedia {
    public static void main (String args[]){
        double notas[][] = new double[3][2];
        double somap[] = new double[2];
        int i, j;
        double media, soma, mediap;
        
        for(i = 0; i < 3; i ++){
            soma = 0;
            for(j = 0; j < 2; j ++){
                notas[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota " + (j+1) + " do aluno " + (i+1)));
                soma = soma + notas[i][j];
            }
            media = soma/2;
            System.out.println("A média do aluno " + (i+1) + " é: " + media);
        }
        for(j = 0; j < 2; j ++){
            for(i = 0; i < 3; i ++){
                somap[j] = somap[j] + notas[i][j];
            }
            mediap = somap[j] / 3;
            System.out.println("A média da prova " + (j+1) + " é: " + mediap);
        }
    }
}