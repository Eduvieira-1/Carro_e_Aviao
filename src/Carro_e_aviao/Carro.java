/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carro_e_aviao;

import javax.swing.JOptionPane;

/**
 *
 * @author Eduar
 */
public class Carro extends Meio_de_transporte{
    public int quilometragem;
    
    public void mover() {
        JOptionPane.showMessageDialog(null, descricao + "Começou a mover");
    }
}
