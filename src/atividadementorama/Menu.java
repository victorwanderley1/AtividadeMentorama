/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadementorama;

import java.util.Scanner;

/**
 *
 * @author Victor-Vanessa
 */
public class Menu {
    public void imprimirMenu(){
        System.out.println("Bem vindo ao To Do List");
        System.out.println("Escolha qual opção deseja:");
        System.out.println("1) Visualizar Categorias");
        System.out.println("2) Adicionar Categoria");
        System.out.println("3) Excluir Categoria");
        System.out.println("0) Sair do Programa\n");
    }
    public int escolhaMenu(){
        int escolha = 0;
        try{
            Scanner entrada = new Scanner(System.in);
            escolha = entrada.nextInt();
            entrada.close();
        }catch(Exception e){
            System.err.println(e);
        }
        return escolha;
    }
}
