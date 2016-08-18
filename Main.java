/*C
 * Author:Shuang Wu 
 * Last Revised:April 23rd 2014
 */
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.io.File;

public class Main {
    
   public static void main(String[] args) throws Exception {
	  /*there was music but the sound file is too huge to push to github.*/
       
//		   Clip music = AudioSystem.getClip();
//	        AudioInputStream file = AudioSystem.getAudioInputStream(new File("joe.wav"));//import joe.wav
//	        music.open(file);
//	        music.loop(Clip.LOOP_CONTINUOUSLY);
//	        SwingUtilities.invokeLater(new Runnable() {
//	            public void run() {
//	                 }
//	        });
//	        //I looked up how to import music online. 
//	        //And I learnt how to do it by the website:  http://bytes.com/topic/java/answers/948320-java-how-add-sound-application
//	        //but I changed the URL into using a file.
		   JFrame f = new JFrame("Retirement plan");//create a new JFrame called Retirement plan
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	        f.add(new RetirementPlanHorizontal());//Add the RetirementPlanHorizontal class to the JFrame
	        f.pack();
	        f.setSize(975, 560);//set the dimension
	        f.setResizable(false);//so the user cannot resize.
	        f.setVisible(true);

	   }
    } 
