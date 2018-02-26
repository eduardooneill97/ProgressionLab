package orderedStructures;

public class Geometric extends Progression {

	private double commonFactor; 
	
	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor; 
	}
	
	@Override
	public double nextValue() throws IllegalStateException{
		if(!this.hasExecFirst)
			throw new IllegalStateException("firstValue() method has not been called");
		
		current = current * commonFactor; 
		return current;
	}
	
	public String toString(){
		return "Geom(" + firstValue() + ", " + this.commonFactor + ")";
	}
	
	@Override
	public double getTerm(int n) throws IndexOutOfBoundsException { 
		if (n <= 0) 
			throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 

		return firstValue()*Math.pow(commonFactor, n-1);
	} 

}
