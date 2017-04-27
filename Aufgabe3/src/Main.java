import java.util.Iterator;
import java.util.List;


public class Main {

	static Iterator<Integer> enumFrom(Integer start){
		while (true) yield return i++;
		
	}
	static <T> Iterator<T> take(Iterator<T> iterator, Integer count){
		for(Iterator<T> i : enumFrom(iterator)){
			System.out.print(i.toString());
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<Double> huhu = Optional.of (5.8);
		System.out.println(huhu.isPresent());
				
		for(Base b : Option.parseRNA("UACG"))System.out.println(b.toString());
		
		System.out.println("_____________________");		
		for(Base b : Option.parseRNA("UACXG"))System.out.println(b.toString());
		
		
		
	}
}
