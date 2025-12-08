package jp.spring.fishmarket;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MarketController {
	
	@GetMapping("/")
	public String index() {
		
		return "index";
	}
	
	@GetMapping("/supplier")
    public String supplier() {
		
		return "supplier";
	}
	
	@GetMapping("/contact")
    public String contact() {
		
		return "contact";
	}
}
