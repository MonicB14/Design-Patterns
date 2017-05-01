/**
 * 
 */
package pattern.creational.abstractfactory;

/**
 * @author Monic.Bhanushali
 *
 */
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("\nAbstract Factory Pattern Demo.....\n");
		
		OperatingSystemFactory osf = InBuiltAppFactory.getOS(OSType.ANDROID);
		String ok = osf.getInbuiltApps(InbuiltApps.OK_GOOGLE);
		System.out.println("\nFactory name: " + osf.getClass().getSimpleName());
		System.out.println(ok);

		osf = InBuiltAppFactory.getOS(OSType.OSX);
		String siri = osf.getInbuiltApps(InbuiltApps.SIRI);
		System.out.println("\nFactory name: " + osf.getClass().getSimpleName());
		System.out.println(siri);
		
		osf = InBuiltAppFactory.getOS(OSType.WINDOWS);
		String cortana = osf.getInbuiltApps(InbuiltApps.CORTANA);
		System.out.println("\nFactory name: " + osf.getClass().getSimpleName());
		System.out.println(cortana);
		
		
	}

}
