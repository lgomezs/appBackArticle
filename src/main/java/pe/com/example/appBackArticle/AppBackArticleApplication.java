package pe.com.example.appBackArticle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("pe.com.example")
@SpringBootApplication
public class AppBackArticleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppBackArticleApplication.class, args);
	}

}
