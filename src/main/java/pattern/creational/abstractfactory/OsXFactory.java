/**
 * 
 */
package pattern.creational.abstractfactory;

/**
 * @author Monic.Bhanushali
 *
 */
public class OsXFactory extends OperatingSystemFactory{

	@Override
	public String getInbuiltApps(InbuiltApps name) {
		switch (name) {
		case SIRI:
			return "Hi Its Siri";
		default:
			return "App not inbuilt";
		}
	}

}
