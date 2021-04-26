package br.upe.devflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class DevFlixNApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevFlixNApplication.class, args);
	}

}
