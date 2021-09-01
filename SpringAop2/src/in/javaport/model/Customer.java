package in.javaport.model;

public class Customer {

	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
		System.out.println("Customer setName is called");
	//	throw(new RuntimeException());
	}
	public String getXXX(){
		
		return "from getXXX";
	}
     public String getXXX(int x){
		
		return "from getXXX(int)";
	}
	
     public Integer add(int a, int b){
 		
 		return a+b;
 	}
	
	public double add(double a, double b){
		
		return a+b;
	}
     
     
     
     
     
     
     
     
	
	
	
	/*public String setNameReturn(String name) {
		this.name = name;
		System.out.println("Customer setNameReturn is called");
		return name;
	}
	
	*/
}
