package org.singleton.project.ejb;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import org.singleton.project.api.App;

@Singleton
@Startup
public class AppService implements App
{
	
	@PostConstruct
	private void initialize(){
		System.out.println(">>>>>>>>>>>>>>>>>>>>>Control is in PostConstruct method");
	}

	public String doSomething() {
		return "Returning Result from Singleton Bean, Time:  "+ new Date().toString();
	}
	
}
