package orderedStructures;

public class Fibonacci extends Progression {

	private double prev; 
	
	public Fibonacci() { 
		this(1); 
		prev = 0; 
	}
	private Fibonacci(double first) {
		super(first);
	}

	@Override
	public double nextValue() throws IllegalStateException{
        // add the necessary code here
		if(!this.hasExecFirst)
			throw new IllegalStateException("firstValue() method has not been called");
		
		double newPrev = current;
		current = current + prev;
		prev = newPrev;
		return current;
	}
	
	@Override	
	public double firstValue() { 
		double value = super.firstValue(); 
		prev = 0; 
		return value; 
	}

}
