/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadementorama;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Victor-Vanessa
 */
public class TodoList {

    public static void main(String[] args) {
        // TODO code application logic here
        Menu menu = new Menu();
        List<String> listaCategorias = new ArrayList();
        TodoList todoList = new TodoList();
        while (true){
        System.out.println(menu.imprimirMenu());
        int escolha = menu.escolhaMenu();
            switch (escolha){
                case 1:
                    System.out.println("Categorias:");
                    todoList.imprimirLista(listaCategorias);
                case 2:
                  System.out.println(menu.menuAdicionarTarefa());
                  try{
                      Scanner entrada = new Scanner(System.in);
                      String nomeCategoria = entrada.next();
                      listaCategorias.add(nomeCategoria);
                    }catch(NullPointerException e){
                      System.err.println("Erro gerado: "+e);
                    }
                case 3:
                    System.out.println(menu.menuRemoverTarefa());
                    todoList.imprimirLista(listaCategorias);
            }
        }
    }
    public void imprimirLista(List<String> lista){
        try{
            int posicao = 0;
            for (String nomesNaLista: lista){
                System.out.println(++posicao + " "  + nomesNaLista);
            }
        }catch (NullPointerException e){
            System.out.println("Lista Vazia: Erro "+e);
        }
    }
}
