/**
 * 
 */
package pattern.structural.adapter;

/**
 * @author Monic.Bhanushali
 *
 */
public class AudioPlayer implements MediaPlayer{

	public void play(String fileName) {
		System.out.println("Playing audio file " + fileName);
	}

}
