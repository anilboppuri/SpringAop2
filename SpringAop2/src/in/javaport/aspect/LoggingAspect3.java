package in.javaport.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
// AfterThrowing  exception, AfterThrowing exception and throwing=ex // finally block 
@Aspect
public class LoggingAspect3 {
	
	
	// Third example ...
	
	/*@AfterThrowing("args(name)")
	public void exceptionAdvise(String name) {
		System.out.println("An exception has been thrown" + name);

	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 @AfterThrowing(pointcut="args(name)", throwing="ex") 
	   public void exceptionAdvise(String name, RuntimeException ex){
		   System.out.println("An exception has been thrown: " + name +":   ex === "+ ex); 
	
	 }
	
	
	
	
		   
}
