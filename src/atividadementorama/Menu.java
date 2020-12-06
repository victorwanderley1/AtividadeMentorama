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
    public String imprimirMenu(){
        return "Bem vindo ao To Do List"
                + "\nEscolha qual opção deseja:"
                + "\n1) Visualizar Categorias"
                + "\n2) Adicionar Categoria"
                + "\n3) Excluir Categoria;"
                + "\n0) Sair do Programa\n";
    }
    public int escolhaMenu(){
        int escolha = 0;
        try{
            Scanner entrada = new Scanner(System.in);
            escolha = entrada.nextInt();
        }catch(Exception e){
            System.err.println(e);
        }
        return escolha;
    }
    public String menuAdicionarTarefa(){
        return "Digite o nome da categoria a ser adicionada";
    }
}
