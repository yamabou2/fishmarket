package jp.spring.fishmarket;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;

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
	
	@GetMapping("/consumer")
    public String consumer() {
		
		return "consumer";
	}
	
	//フォームデータのやりとり
	@GetMapping("/contact")
	 public String contactForm(@ModelAttribute ContactForm contactForm) {
		return "contact";
	}
	
	@PostMapping("/result")
    public String result(@Valid @ModelAttribute ContactForm contactForm, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "contact";
		}
		
		return "result";
	}
}
