package projeto.p3.DevFlix;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@ServletComponentScan
@SpringBootApplication
public class DevFlix1Application {

	public static void main(String[] args) {
		SpringApplication.run(DevFlix1Application.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(List<HttpMessageConverter<?>> messageConverters) {
		return new RestTemplate(messageConverters);
	}
	@Bean
	public ByteArrayHttpMessageConverter byteArrayHttpMessageConverter() {
		return new ByteArrayHttpMessageConverter();
	}
}
