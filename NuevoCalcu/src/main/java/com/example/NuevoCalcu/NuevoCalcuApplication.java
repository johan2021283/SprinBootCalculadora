package com.example.NuevoCalcu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NuevoCalcuApplication {

	public static void main(String[] args) {
		SpringApplication.run(NuevoCalcuApplication.class, args);
	}
	@GetMapping("/Suma")
	public String hello(@RequestParam(value = "name", defaultValue = "Suma") String name) {
		return String.format("Funcion %s!", name);
	}
	@GetMapping("/Resta")
	public String Resta(@RequestParam (value = "name", defaultValue = "Resta") String name) {
		return String.format("Funcion %s!", name);
	}
	@GetMapping("/multiplicación")
	public String Multiplicación(@RequestParam (value = "name", defaultValue = "Multiplicación") String name) {
		return String.format("Funcion %s!", name);
	}
	@GetMapping("/Division")
	public String Division(@RequestParam(value = "name", defaultValue ="Division" ) String name){
		return String.format("Funcion %s¡", name);
	}
}


