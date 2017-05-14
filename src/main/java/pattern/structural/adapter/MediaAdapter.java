/**
 * 
 */
package pattern.structural.adapter;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author Monic.Bhanushali
 *
 */
public class MediaAdapter {
	
	private HashMap<String, String> mediaMappings;
	private MediaPlayer player;
	
	public MediaAdapter() {
		mediaMappings = new HashMap<String, String>();
		mediaMappings.put("mp3", "audio");
		mediaMappings.put("wav", "audio");
		mediaMappings.put("aiff", "audio");
		mediaMappings.put("org", "audio");
		mediaMappings.put("vox", "audio");
		mediaMappings.put("mp4", "video");
		mediaMappings.put("wmv", "video");
		mediaMappings.put("avi", "video");
		mediaMappings.put("mov", "video");
		mediaMappings.put("flv", "video");
	}

	public void playMedia(String fileName) {
		
		if(checkFileFormatType(fileName) == null){
			System.out.println("Sorry this media cannot be played :(");
			return;
		}
		
		if(checkFileFormatType(fileName).equals("audio")){
			player = new AudioPlayer();
			player.play(fileName);
		}
		else{
			player = new VideoPlayer();
			player.play(fileName);	
		}
	}

	private String checkFileFormatType(String fileName) {
		String format = getFormat(fileName);
			return mediaMappings.get(format);
	}

	private String getFormat(String fileName) {
		int index = fileName.lastIndexOf(".");
		return fileName.substring(index+1);
	}

}
