/**
 * 
 */
package pattern.creational.abstractfactory;

/**
 * @author Monic.Bhanushali
 *
 */
public class WindowsFactory extends OperatingSystemFactory{

	@Override
	public String getInbuiltApps(InbuiltApps name) {
		switch (name) {
		case CORTANA:
			return "Hi Its Cortana";
		default:
			return "App not inbuilt";
		}
	}

}
