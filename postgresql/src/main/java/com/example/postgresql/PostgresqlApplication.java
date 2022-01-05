package com.example.postgresql;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
// implements CommandLineRunner
public class PostgresqlApplication  {

	public static void main(String[] args) {
		SpringApplication.run(PostgresqlApplication.class, args);
	}

	// @Autowired
	// private TodoRepository todoRepository;
	// @Override
	// public void run(String... args) throws Exception {
	// 	// TODO Auto-generated method stub
	//TodoItem todo1 = TodoItem.builder().text("test").day("Tuesday 4 th of jan 11:30 AM").reminder(false).build();
	//todoRepository.save(todo1);
	// }

//	@Bean
//	public WebMvcConfigurer corsConfigurer() {
//		return new WebMvcConfigurer() {
//			@Override
//			public void addCorsMappings(CorsRegistry registry) {
//				registry.addMapping("/api/todoItems/{id}").allowedOrigins("http://localhost:8081");
//			}
//		};
//	}

	// Fix the CORS errors
	// @Bean
	// public FilterRegistrationBean simpleCorsFilter() {
	// 	UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	// 	CorsConfiguration config = new CorsConfiguration();
	// 	config.setAllowCredentials(true);
	// 	// *** URL below needs to match the Vue client URL and port ***
	// 	config.setAllowedOrigins(Collections.singletonList("http://localhost:8081"));
	// 	config.setAllowedMethods(Collections.singletonList("*"));
	// 	config.setAllowedHeaders(Collections.singletonList("*"));
	// 	source.registerCorsConfiguration("/**", config);
	// 	FilterRegistrationBean bean = new FilterRegistrationBean<>(new CorsFilter(source));
	// 	bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
	// 	return bean;
	// }
}
