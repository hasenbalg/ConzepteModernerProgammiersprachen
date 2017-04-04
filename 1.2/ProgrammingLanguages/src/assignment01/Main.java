package assignment01;
public class Main {

	private static Value[] x = {new CharValue('a'), new BoolValue(false), new CharValue('c')};
	public static void main(String[] args) {
		System.out.println(odd(true).toString());
		System.out.println(odd(false).toString());
		
		System.out.println(neg(new BoolValue(true)).toString());
		System.out.println("-----------------------------------");

		for (int i = 0; i < x.length; i++) {
			System.out.println(neg(x[i]).toString());
		}
	}
	
	private static Value odd(boolean b) {
		if (b) {
			return new CharValue('a');
		}else{
			return new BoolValue(true);
		}
	}
	
	private static Value neg( Value val){
		if(val instanceof BoolValue){
			return new BoolValue(!((BoolValue) val).getVal());
		}else{
			return val;
		}
	}

}



