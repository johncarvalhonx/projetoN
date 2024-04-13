/*
 * Autor: João Pedro Villas Boas de Carvalho
 * Data: 23/04/2023
 * Descrição: Trabalho de APS 3 Semestre
 */
package pProjetoN.main;

import java.io.File;

import javax.sound.sampled.*;

public class Musica {
	private static Clip clip;
	
	public static void mainMenuTheme() {
        try {
        	String diretorioUser = System.getProperty("user.dir");
        	String arquivoPath = diretorioUser + "/music/Main Menu.wav";
            File arquivo = new File(arquivoPath);
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(arquivo);
            clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            FloatControl volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            float volume = -15.0f; 
            volumeControl.setValue(volume);

        } catch (Exception e) {
            System.out.println("Erro ao reproduzir som: " + e.getMessage());
        }
    }
	
	public static void ambientOneTheme() {
		try {
        	String diretorioUser = System.getProperty("user.dir");
        	String arquivoPath = diretorioUser + "/music/Arriving at NatureCorp.wav";
            File arquivo = new File(arquivoPath);
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(arquivo);
            clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            FloatControl volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            float volume = -15.0f; 
            volumeControl.setValue(volume);
        } catch (Exception e) {
            System.out.println("Erro ao reproduzir som: " + e.getMessage());
        }
	}
	
	public static void battleTheme() {
		try {
        	String diretorioUser = System.getProperty("user.dir");
        	String arquivoPath = diretorioUser + "/music/Battle Music.wav";
            File arquivo = new File(arquivoPath);
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(arquivo);
            clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            FloatControl volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            float volume = -15.0f; 
            volumeControl.setValue(volume);
        } catch (Exception e) {
            System.out.println("Erro ao reproduzir som: " + e.getMessage());
        }
	}
	
	public static void ambientTheme() {
		try {
        	String diretorioUser = System.getProperty("user.dir");
        	String arquivoPath = diretorioUser + "/music/Ambient Music.wav";
            File arquivo = new File(arquivoPath);
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(arquivo);
            clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            FloatControl volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            float volume = -15.0f; 
            volumeControl.setValue(volume);
        } catch (Exception e) {
            System.out.println("Erro ao reproduzir som: " + e.getMessage());
        }
	}
	
	public static void finalBattleTheme() {
        try {
        	String diretorioUser = System.getProperty("user.dir");
        	String arquivoPath = diretorioUser + "/music/Blood Code.wav";
            File arquivo = new File(arquivoPath);
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(arquivo);
            clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            FloatControl volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            float volume = -15.0f; 
            volumeControl.setValue(volume);
        } catch (Exception e) {
            System.out.println("Erro ao reproduzir som: " + e.getMessage());
        }
    }
	
	public static void musicStop() {
        if (clip != null) {
            clip.stop();
            clip.close();
        }
	}

}
