package sat.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SatTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SatTestApplication.class, args);
	}
	
	@GetMapping("/firstapp")
	public String firstapp(@RequestParam(value = "name", defaultValue = "SatVarre") String name) {
	return String.format("2nd SpringBoot Application -  %s!", name);
	}

}
