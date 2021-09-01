package in.javaport.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.javaport.model.Customer;
import in.javaport.service.PeopleService;

public class AopMain {

	public static void main(String []args) {
		
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        
       //   BeanFactory factory = new XmlBeanFactory(new FileSystemResource("D:\\jungle\\spring\\springaops\\src\\spring.xml"));
        //  PeopleService service = (PeopleService) factory.getBean("service");
        PeopleService service = (PeopleService) ctx.getBean("service");

         service.getEmployee().setName(" Anil from main");
         service.getCustomer().setName("Another customer");
           System.out.println(service.getEmployee().getName());
          System.out.println(service.getCustomer().getName());
        /*  System.out.println(service.getCustomer().getXXX());
          System.out.println(service.getCustomer().getXXX(20));
          System.out.println(service.getCustomer().add(20, 30));
         Customer customer = service.getCustomer();
         System.out.println(customer.add(10, 20));
         System.out.println(customer.add(10D, 20D));*/
          
   
	}

}
