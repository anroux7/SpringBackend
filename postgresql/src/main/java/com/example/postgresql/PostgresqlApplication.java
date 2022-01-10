package com.example.postgresql;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
// implements CommandLineRunner
public class PostgresqlApplication  {

	public static void main(String[] args) {
		SpringApplication.run(PostgresqlApplication.class, args);
	}

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
