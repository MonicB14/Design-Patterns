/**
 * 
 */
package pattern.structural.adapter;

/**
 * @author Monic.Bhanushali
 *
 */
public class VideoPlayer implements MediaPlayer{

	public void play(String fileName) {
		System.out.println("Playing video file " + fileName);		
	}

}
