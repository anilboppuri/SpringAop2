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
//  returning , JoinPoint, JoinPoint.getTarget, args(name) access to input parameters
@Aspect
public class LoggingAspect2 {
	
	// second example joinpoint

	@AfterReturning(pointcut = "args(name)", returning = "returnString")
	public void stringArugumentMethods(String name, String returnString) {
		System.out.println("A meth dat takes string arg is called " + name + 
				" and returning ..." + returnString);
	}
	
	
	/*
	@Before("allEmployeeMethods()")
	public void loggingAdvice(JoinPoint joinpoint) {
		System.out.println(joinpoint.toString());
	    System.out.println(joinpoint.getTarget());
	}
	
	@Pointcut("within(in.javaport.model.Employee)")
		 public void allEmployeeMethods() { }

	
*/	
	/*@AfterReturning(pointcut = "args()", returning = "returnString")
	public void stringArugumentMethods(String returnString) {
		System.out.println("A meth dat returns string is called and returning ..." + returnString);
	}
*/	
/*	@AfterReturning(pointcut = "args(..)", returning = "returnString")
	public void stringArugumentMethods(String returnString) {
		System.out.println("A meth dat returns string is called and returning ..." + returnString);
	}
*/
	
/*	@Pointcut("execution( public String get * ()")
	public void args(){
	}
*/	
	
	
	
	
	

	
	/*
		*/

	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*
*/	
	
	 
	
}
