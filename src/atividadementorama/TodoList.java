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
        
        while (true){
        System.out.println(menu.imprimirMenu());
        int escolha = menu.escolhaMenu();
            switch (escolha){
                case 1:
                  System.out.println(menu.menuAdicionarTarefa());
                  try{
                      Scanner entrada = new Scanner(System.in);
                      String nomeCategoria = entrada.next();
                      listaCategorias.add(nomeCategoria);
                    }catch(NullPointerException e){
                      System.err.println("Erro gerado: "+e);
                    }
                case 2:
                    System.out.println(menu.menuRemoverTarefa());
            }
        }
    }
}
