import java.util.ArrayList;
import java.util.List;


public class Listen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Number[] numbers = new Number[4];
		//Integer[] integers = numbers;
		Object[] objects = numbers;
		/*Geben sie ein analoges Programm an, das Listen an
		Stelle von Arrays verwendet. Vergleichen Sie das Verhalten
		der beiden Programme. Was sagt das obige Programm 
		uber Arrays in Java? Nutzen Sie dieses Verhalten, um 
		einen Laufzeitfehler zu verursachen, der bei Listen verhindert wird.*/
		
		//Arrays sind in java kovariant
		
		objects[0] = ""; //object koennte ein String sein -> laufzeitfehler
		objects[1] = 4;
		
		List<Number> numbers1 = new ArrayList<Number>(4);
		//List<Integer> integers1 = numbers;
		List<Object> objects1 = numbers;
		
		//Listen sind in java invariant

	}

}
