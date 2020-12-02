/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Akyr
 * Main class for the music class.
 * CURRENTLY ONLY ACCEPTS .WAV FILES
 */
public class Main {

    public static void main(String[] args) {
        musicPlayerForm musicPlayerForm = new musicPlayerForm();
        musicPlayerForm.setVisible(true);
        musicPlayerForm.setResizable(false);
        musicPlayerForm.setLocationRelativeTo(null);
    }
    
}