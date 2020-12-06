/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadementorama;
import java.util.List;
/**
 *
 * @author Victor-Vanessa
 */
public class EditarLista {
    public void adicionarCategoria(List<String> lista, String nomeCategoria){
        lista.add(nomeCategoria);
    }

    public void removerCategoria(List<String> lista, int numeroDaCategoria){
        lista.remove(numeroDaCategoria);
    }
}
