/**
 * 
 */
package pattern.creational.singleton;

/**
 * In this class we implement singleton design pattern using Bill pugh's implementation.
 * When {@code SingletonCreator#getInstance()} is called {@code SingletonMaker} get loaded in JVM and as ClassLoading is
 * thread safe process we get only single instance of {@code SingletonCreator} class.
 * To list all the classes loaded by JVM use --verbose:class in cmd arguments.
 * @author Monic Bhanushali
 * 
 */
public class SingletonCreator {

	/**
	 * private constructor to prevent object creation through {@code new} keyword.
	 */
	private SingletonCreator(){}
	
	/**
	 * Method to get the singleton instance of class.
	 * @return {@code SingletonCreator} object
	 */
	public static SingletonCreator getInstance(){
		return SingletonMaker.INSTANCE;
	}
	
	/**
	 *
	 *{@code static} inner class to help in creation of SingletonCreator object.
	 */
	static class SingletonMaker{
		private static final SingletonCreator INSTANCE = new SingletonCreator();		
	}
	
}
