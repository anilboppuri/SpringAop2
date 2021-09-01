package in.javaport.aspect;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

// @Before, @After, @Pointcut @Aspect
// execution and within
// * and ..


@Aspect
public class LoggingAspect {
	
	// First example
    //@Before("execution( public String get*(. .))") 
    //@Before("execution( public String get*(*))")
    //Before("execution( public String getName())")
/*    @Before("getAll()")
	   public void loggingAdvice() { 
		   System.out.println("this is logging advice... applied to all classes in model package"); 
	   }

	    
	     @Pointcut("execution(public *  in.javaport.model. .* ( . . ))")
	   public void getAll() {                                      
	   }
*/
/*	     @Before("addMethod()")
		   public void loggingAdvice() { 
			   System.out.println("this is logging advice... applied to all classes in model package"); 
		   } 

	@After("addMethod()") 
	   public void validationAdvice() 
	   {
	   System.out.println("this is validation after advice.... applied for add method");
	   }
	
	 @AfterReturning("addMethod()") 
	   public void exitedTarget(){
	   System.out.println(".... from afterreturning");
	   
	   }
  
	    @Pointcut("execution(public * add(..))")
		   public void addMethod(){
			   
		   }  
	     */
	
    @Before("allEmployeeMethods()")
		   public void loggingAdvice() { 
			   System.out.println("this is logging advice... applied to all classes in model package"); 
		   } 

	
	    @Pointcut("within(in.javaport.model.*)")
		   public void allEmployeeMethods(){
			   
		   }
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	    /* 
	     * 
	     @Before("allEmployeeMethods()")
	     public void loggingAdvice2(){
	    	 
	    	 System.out.println("this is logging before advice for all Employee methods......");
	     }
	
	     * 
	     **/
	     
	     
	     
	     
	     
	 /*
	   

	 
	   *  
	   *  
	   *  
	   
	   @Before("allCustomerMethods()")
	   public void securityAdvice(){
		   
		   System.out.println("security advice...");
	   }
	   
	  @AfterReturning("allCustomerMethods()") 
	   public void exitedTarget(){
	   System.out.println(".... from afterreturning");
	   
	   }
	  
	  */
	  
	 	// for sub packages and all classes //
	//  .. (means 0 or more ) public void allCircleMethods() { }

}










// execution is for methods and within is for classes