package orderedStructures;

public class Arithmetic extends Progression {
	private double commonDifference; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
	}
	
	@Override
	public double nextValue() throws IllegalStateException{
		if(!this.hasExecFirst)
			throw new IllegalStateException("firstValue() method has not been called");
		
		current = current + commonDifference; 
		return current;
	}
	
	public String toString(){
		return "Arith(" + firstValue() + ", " + this.commonDifference + ")";
	}
	
	@Override
	public double getTerm(int n) throws IndexOutOfBoundsException { 
		if (n <= 0) 
			throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 

		return firstValue() + commonDifference*(n-1);
	} 

}
