package rd.webapp1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class Webapp1Application {

	public static void main(String[] args) {
		SpringApplication.run(Webapp1Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
			return args -> {
					System.out.println("--- Beans: ---");
					String[] beanNames = ctx.getBeanDefinitionNames();
					Arrays.sort(beanNames);
					System.out.println(String.join("\n", beanNames));
			};
	}

}
