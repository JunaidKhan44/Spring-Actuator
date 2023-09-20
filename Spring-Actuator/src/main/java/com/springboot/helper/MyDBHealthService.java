/**
 * 
 */
package com.springboot.helper;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @author hp
 *
 */
@Component
public class MyDBHealthService implements HealthIndicator{

	public static final String DB_SERVICE="Database Service";
	public boolean isHealthGood() {
		//u can write custom logic
		return true;
		
	}
	
	@Override
	public Health health() {
		
		if(isHealthGood()) {
			
			return Health.up().withDetail(DB_SERVICE, "Database Service is running up")
					.build();
		}
		return Health.down()
				.withDetail(DB_SERVICE, "Database Service is running down")
				.build();
	}

}
