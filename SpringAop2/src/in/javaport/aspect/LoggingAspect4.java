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

@Aspect
public class LoggingAspect4 {
	
	// Fourth example ....

	
	   @Pointcut("execution( public String getName())") 
	   public void getAll() { }
	   
	   @Around("getAll()")
	   public String  myAroundAdvice(ProceedingJoinPoint proceeding) { 
          Object value= null;
		   try{ 
			   System.out.println("Before advice.");  // verify the security authorize/ authenticated 
			   
	           		 value = proceeding.proceed(); 
	           System.out.println("After advice.."+ value);  // you may encrypt  // mvc view resolver - welcome welome.html
	           
	   
	   }catch(Throwable e ){
		   e.printStackTrace();
		   } 
	   System.out.println("After finally ..."); 
	   return (String) value;         
	   }
	  
	  
}
