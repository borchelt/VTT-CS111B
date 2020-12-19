/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Wolfgang Borchelt & Akyr Bell
 */
public class VTT {

    public static void main(String args[]) {
        new VTTForm().setVisible(true);
        musicPlayerForm musicPlayerForm = new musicPlayerForm();
        musicPlayerForm.setVisible(true);
        musicPlayerForm.setResizable(false);
        musicPlayerForm.setLocationRelativeTo(null);
    }
}