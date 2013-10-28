/**
 * 
 */
package com.anirudh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author <a href="http://anirudhbhatnagar.com">Anirudh Bhatnagar</a>
 *
 */
@Controller
public class HomeController {
	
	@RequestMapping
	public String showHome(){
		return "home";
	}

}
