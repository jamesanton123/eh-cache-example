package ehcache;

import com.googlecode.ehcache.annotations.Cacheable;

public class Dog {	
	
	@Cacheable(cacheName = "dog")
	public String getRoversName(){
		System.out.println("Executing logic to get dogs name...This could take a while");
		return "rover";
	}	
	
	@Cacheable(cacheName = "dog")
	public String getGirlDoggyName(){
		System.out.println("Executing logic to get girl dogs name...This could take a while");
		return "suzanne";
	}	
	
	@Cacheable(cacheName = "dog")
	public String getSomeDogsName(String name){
		System.out.println("Executing logic to get some dogs name...This could take a while");
		return name;
	}	
}
