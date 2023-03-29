package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/testvar")
public class PathVariableDersi {
	// burada {value} fonksiyonun parametresine atanıyor
	// burada iki tane yolun olması da parametrenin isteğe bağlı olmasından
	@GetMapping(path = {"/message/{value}", "/message"})
	public String getMessage(@PathVariable(name = "value", required = false) String message) {
		return "Your message is: " + message;
	}

	// istemci tarafında keyParam girilmeli ve daha sonra mesaj eklenmeli
	@GetMapping(path = "/message2")
	public String getMessage2(@RequestParam(name = "keyParam", required = false, defaultValue = "this is default message!") String message) {
		// required ile parameter gerekli mi değil mi onıu söyledik
		// kullanıcı parametere verse de vermesede fonksiyon çalışaktır 
		return "Your message is: " + message;
	}

}
