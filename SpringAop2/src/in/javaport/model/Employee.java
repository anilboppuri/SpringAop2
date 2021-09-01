package in.javaport.model;

public class Employee {
	
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		
		return name + " concatinated for ....";
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
		System.out.println("from Employee class name is set");
	 //throw(new RuntimeException());
	}
	
	
	

}
