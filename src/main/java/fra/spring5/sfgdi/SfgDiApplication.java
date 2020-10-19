package fra.spring5.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import fra.spring5.sfgdi.controllers.ConstructorInjectedController;
import fra.spring5.sfgdi.controllers.I18nController;
import fra.spring5.sfgdi.controllers.MyController;
import fra.spring5.sfgdi.controllers.PropertyInjectedController;
import fra.spring5.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println("i18Controller "+i18nController.sayHello());
		
		MyController mycontroller = (MyController) ctx.getBean("myController");
		
		System.out.println("myController "+mycontroller.sayHello());
		
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println("property "+propertyInjectedController.getGreeting());
		
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println("setter "+setterInjectedController.getGreeting());
		
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println("constructor "+constructorInjectedController.getGreeting());
	}

}
