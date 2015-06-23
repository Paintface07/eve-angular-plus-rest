package eve.angular.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import eve.angular.app.exception.EveApiException;
import eve.angular.app.model.EveApiAuth;

@RestController
public class RootController {

	@RequestMapping(value="/", method=RequestMethod.POST)
	public @ResponseBody List<String> authenticate(@RequestBody EveApiAuth authData) {
		System.out.println(">>> vCode: " + authData.getvCode());
		System.out.println(">>> apiKey: " + authData.getApiKey());
		List<String> errors = new ArrayList<String>();
//		try {
			System.out.println(">>> AUTHENTICATED");
//		} catch (EveApiException ex) {
//			errors.add("Could not reach the Eve API.");
//		}
		
		return errors;
	}
}
