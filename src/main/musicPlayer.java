/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
/**
 *
 * @author Akyr
 */

public class musicPlayer {
    
    protected Clip clip;
    protected File musicPath;
    
    /**
     * default constructor
     */
    public musicPlayer(){
    musicPath = new File("genericPath");
    }
    /**
     * main constructor
     * @param filePath 
     */
    public musicPlayer(String filePath){
    musicPath = new File(filePath);
    }
 
    /**
     * loads a .wav file
     * @param filepath the filepath of the .wav
     */
    public void loadMusic(String filepath){
        try{
            File audio = new File(filepath);
            musicPath = audio;
            
            if(musicPath.exists()){
              AudioInputStream audioInput  = AudioSystem.getAudioInputStream(musicPath);
              clip = AudioSystem.getClip();
              clip.open(audioInput);
              System.out.println("Initialized");
            }
            else{
                throw new IllegalArgumentException("test");
            }
        }
        catch(IOException | LineUnavailableException | UnsupportedAudioFileException e){
            throw new IllegalArgumentException("passed text:" + filepath);
        }
    }
    
}