package assignment01;

public class BoolValue extends Value{
	public boolean val;
	public BoolValue(boolean val){
		this.val = val;
	}
	
	public String toString(){
		return String.valueOf(val);
	}

	public boolean getVal() {
		return val;
	}

	public void setVal(boolean val) {
		this.val = val;
	}
}
