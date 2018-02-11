package houzm.springboot.example.chapter1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Chapter1Application {

	@RequestMapping(value="/",method = RequestMethod.GET)
	public String sayhello(){
//		System.out.println("hello world spring boot!");
		return "hello world spring boot!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Chapter1Application.class, args);
	}
}

