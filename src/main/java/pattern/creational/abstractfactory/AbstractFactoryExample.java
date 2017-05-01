/**
 * 
 */
package pattern.creational.abstractfactory;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * @author Monic.Bhanushali
 *
 */
public class AbstractFactoryExample {

	public static void main(String[] args) {
		
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		builderFactory.newDocumentBuilder();
	}
}
