package posmy.interview.boot.util;

import org.springframework.stereotype.Service;
import posmy.interview.boot.pojo.RequestPOJO;

@Service
public class CommonUtil {
    
	//this class is which all the common methods that will be shared by different modules will be implemented here
	
	public boolean requestValidation(RequestPOJO request) {
		boolean validRequest = true;
		
		// validate the requestBody here, if valid return true, else return false
		// implement the request validation here
		
		return validRequest;
	}
	
}