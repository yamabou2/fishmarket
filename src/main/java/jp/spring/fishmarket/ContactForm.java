package jp.spring.fishmarket;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ContactForm {
	
	@NotBlank
	private String kind;
	
	@NotBlank(message = "↑選択してください")
	private String firstTime;
	
	@NotBlank(message = "↑入力してください")
	private String mail;
	
	@NotBlank(message = "↑入力してください")
	private String subject;
	
	@NotBlank(message = "↑入力してください")
	private String message;
}
