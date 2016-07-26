package ehcache;

import net.sf.ehcache.CacheManager;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EhCache {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-config.xml");
		
		Dog dog = (Dog) context.getBean("dog");
		
		for(int i = 0; i < 30; i++){
			System.out.println(dog.getRoversName());
			System.out.println(dog.getGirlDoggyName());
			System.out.println(dog.getSomeDogsName("george"));
			System.out.println(dog.getSomeDogsName("spanky"));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
		}
		CacheManager.getInstance().shutdown();
	}
	
	
}