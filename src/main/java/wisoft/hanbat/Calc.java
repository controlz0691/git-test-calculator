public class Calc {
	private int r = 0;
	
	public int add(int x, int y) { //add method
		return x+y;
	}

	public int sub(int x, int y) { //subtraction method
		return x-y;
	}
	public int mul(int x, int y) { //multiply method 1 2
		return x*y;
	}
	public void dec(int x) { //dec method
		r = r - x;
	}
}
