import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public final class Option<T> {
	private final T value;

	private Option() {
		this.value = null;
	}

	public static <T> Option<T> empty() {
		return new Option<T>();
	}

	private Option(T value) {
		this.value = value;
	}

	public static <T> Option<T> of(T value) {
		return new Option<>(value);
	}

	public static <T> Option<T> ofNullable(T value) {
		return (Option<T>) (value == null ? empty() : of(value));
	}

	public T get() {
		if (value == null) {
			throw new NoSuchElementException("No value present");
		}
		return value;
	}

	public boolean isPresent() {
		return value != null;
	}

	public T orElse(T other) {
		return value != null ? value : other;
	}

	public String toString() {
		return value == null ? "Empty" : "Some(" + value.toString() + ")";
	}
	//e statische Methode parseBase, die einen Wert vom Typ char nimmt und einen
	// Wert vom Typ Option<Base> liefert.
	public static Option<Base> parseBase(char a){
		//http://stackoverflow.com/questions/4936819/java-check-if-enum-contains-a-given-string
		try {
		      Base x = Base.valueOf(Character.toString(a));
		       return of(x);
		       //yes
		    } catch (IllegalArgumentException ex) {  
		        //nope
		    	return empty();
		  }
	}
	
	public static List<Base> parseRNA(String x){
		List<Base> bases = new ArrayList<Base>();
		for(char c : x.toCharArray()){
			bases.add(
					 parseBase(c).get()
					);
		}
		return bases;
		
	}
}