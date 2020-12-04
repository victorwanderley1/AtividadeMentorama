/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadementorama;
import java.util.ArrayList;
/**
 *
 * @author Victor-Vanessa
 */
public class EditarLista {
    private void adicionarCategoria(ArrayList<String> lista, String nomeCategoria){
        lista.add(nomeCategoria);
    }

    private void removerCategoria(ArrayList<String> lista, int numeroDaCategoria){
        lista.remove(numeroDaCategoria);
    }
}
