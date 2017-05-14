/**
 * 
 */
package pattern.structural.adapter;

/**
 * This media player is internally composed of two players(Audio & Video).
 * An adapter programmed within this super player helps it to play the file using correct sub-player 
 * based on the file type.
 * @author Monic.Bhanushali
 *
 */
public class MBMediaPlayer{

	private MediaAdapter adapter;
	
	public MBMediaPlayer(){
		System.out.println("\n****** Welcome to MB MediaPlayer ******\n");
		adapter = new MediaAdapter();
	}
	
	public void play(String fileName) {
		adapter.playMedia(fileName);
		
	}

}
