import java.util.Arrays;
import java.util.List;


public class Varianz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* Erlautern Sie fur jede Methode, die sich nicht definieren 
		lasst, warum sie sich nicht definieren lasst. Geben
		Sie fur jede Methode einen Beispielaufruf an. Der Beispielaufruf
		soll die Verwendung von Kovarianz bzw.
		Kontravarianz zeigen und jeweils illustrieren, warum es sinnvoll
		ist, dass die Methode definiert bzw. nicht
		definiert werden kann. Wie wurde sich das Verhalten
		andern, wenn die Methode set die Liste nicht ver¨andern
		sondern eine neue Liste zuruckliefern wurde? */
		
		
		List<Integer> huhu = Arrays.asList(0,0,0,0);
		coSet(huhu, 1, 555);
		
		conSet(huhu, 2, 666);
		
		Number haha = coGet(huhu, 1);
		int hehe = conGet(huhu, 2);
	}
	
	static <T> T coGet(List<? extends T> list, int index){
		
		return list.get(index);
		
	}
	static <T> T conGet(List<? super T> list, int index){
		//laesst sich nicht implementieren weil Int von Numbers erbt
		return  list.get(index);
		
	}
	static <T> void coSet(List<? extends T> list, int index, T value){
		//laesst sich nicht implementieren weil Int von Numbers erbt
		list.set(index, value);
		
	}
	static <T> void conSet(List<? super T> list, int index, T value){
		list.set(index, value);
	}

}
