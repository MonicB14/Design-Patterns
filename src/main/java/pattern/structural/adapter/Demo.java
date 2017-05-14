/**
 * 
 */
package pattern.structural.adapter;

import java.util.Scanner;

/**
 * This Demo is to show the use of adapter pattern.
 * Adapter works as a bridge between two incompatible types.
 * In this example we will pass a media file which can be an audio/video to our media player.
 * This media player has an adapter which identifies the file type and routes it to correct player.
 * @author Monic.Bhanushali
 *
 */
public class Demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		MBMediaPlayer player = new MBMediaPlayer();
		
		System.out.print("Enter name of file to be played : ");
		String name = scan.next();
		
		player.play(name);
	}

}
