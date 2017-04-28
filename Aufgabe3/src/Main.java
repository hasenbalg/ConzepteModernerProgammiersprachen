import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class Main {

	static Iterator<Integer> enumFrom(Integer start){
		/*die einen Iterator liefert, 
		der startend mit dem Wert start 
		alle Nachfolger dieser Zahl liefert.*/
		List<Integer> iter =  new ArrayList<Integer>();
		while(iter.size()< 100){
			iter.add(start++);
			
		}
		//Iterable<Integer> iterable = iter;
		return iter.iterator();
	}
	static <T> Iterator<T> take(Iterator<T> iterator, Integer count){
		/*die einen Iterator liefert, der die 
		ersten count Elemente des ubergebenen Iterator liefert.
		Verwenden Sie eine while-Schleife und die zuvor 
		definierten Iteratoren, um alle Zahlen von 1000 bis 1009 auf
		der Konsole auszugeben. */
		List<Integer> huhu = new ArrayList<>();
		while(iterator.hasNext())huhu.add((Integer) iterator.next());
		
		return (Iterator<T>) huhu.subList(0, count+1).iterator();
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<Double> huhu = Optional.of (5.8);
		System.out.println(huhu.isPresent());
				
		for(Base b : Option.parseRNA("UACG"))System.out.println(b.toString());
		
		System.out.println("_____________________");		
		//for(Base b : Option.parseRNA("UACXG"))System.out.println(b.toString());
		
		Iterator<Integer> haha = take(enumFrom(1000),9); 
		while(haha.hasNext())System.out.println(haha.next());
		
	}
}
