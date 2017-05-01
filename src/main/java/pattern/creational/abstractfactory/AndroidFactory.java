/**
 * 
 */
package pattern.creational.abstractfactory;

/**
 * @author Monic.Bhanushali
 *
 */
public class AndroidFactory extends OperatingSystemFactory{

	@Override
	public String getInbuiltApps(InbuiltApps name) {
		switch (name) {
		case OK_GOOGLE:
			return "Hi Its Ok!Google";
		default:
			return "App not inbuilt";
		}
	}

}
