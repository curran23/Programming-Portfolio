
import java.util.Iterator;

public class Street 
{
	//--------------------------------------------------------------
	// Instance Variables
	//--------------------------------------------------------------
	private String[] houseNumbers;

	
	//--------------------------------------------------------------
	// Constructors
	//--------------------------------------------------------------
	public Street() 
	{
		houseNumbers = new String[11];
		houseNumbers[0] = "1010";
		houseNumbers[1] = "1011";
		houseNumbers[2] = "1012";
		houseNumbers[3] = "1013";
		houseNumbers[4] = "1014";
		houseNumbers[5] = "1015";
		houseNumbers[6] = "1016";
		houseNumbers[7] = "1017";
		houseNumbers[8] = "1018";
		houseNumbers[9] = "1019";
		
	}

	//--------------------------------------------------------------
	// Class Methods
	//--------------------------------------------------------------
	
	 public String getEvenHouses() 
	 {
		 StringBuffer output = new StringBuffer();
		 
		 HelperInnerEvenIterator iterator = this.new HelperInnerEvenIterator();
	     while (iterator.hasNext()) 
	     {
	            output.append((iterator.next() + " "));
	     }
	     
	     return output.toString();
	    }
	    
	 
	 
	 
	 
	 
	 
	 
	//--------------------------------------------------------------
	// Helper Inner Classes
	//--------------------------------------------------------------
	
	private class HelperInnerEvenIterator implements Iterator 
	{
	    //Instance Variables    
		private int next = 0;
	        
		
		@Override
	    public boolean hasNext() 
	    {
			return (next <= houseNumbers.length - 1);
	    }
	        
		@Override
	    public String next() 
	    {
            String value = houseNumbers[next];
	       
            next += 2;
	        
            return value;
	    }


		@Override
		public void remove() 
		{
		    //Unimplemented because I don't want the inner class to remove houses.
				
		}
	 }
	
	
}
