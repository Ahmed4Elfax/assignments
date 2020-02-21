
public class calc implements ICalculator {

	@Override
	public int add(int x, int y) {
		
		return x+y;
	}

	@Override
	public float divide(int x, int y)throws Exception {
		if(x!=0) {
		if (y==0) {
			throw new Exception();
		}
		
		return (float) x/y;
	}
		else {
			return 0;
		}}

}
