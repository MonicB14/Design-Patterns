/**
 * 
 */
package pattern.creational.abstractfactory;

/**
 * @author Monic.Bhanushali
 *
 */
public class InBuiltAppFactory {

	private InBuiltAppFactory(){
	}
	
	public static OperatingSystemFactory getOS(OSType type){
		switch (type) {
		case WINDOWS:
			return new WindowsFactory();
		case OSX:
			return new OsXFactory();
		case ANDROID:
			return new AndroidFactory();
		default:
			return null;
		}
	}
}
