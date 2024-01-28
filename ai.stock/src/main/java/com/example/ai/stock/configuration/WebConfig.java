package com.example.ai.stock.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

@Configuration
@EnableWebSecurity
public class WebConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf(e->e.disable()).cors(e->corsConfigurationSource())
                .authorizeRequests()
                .anyRequest().permitAll();
        http.headers().frameOptions().sameOrigin();
        return http.build();
    }

    CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
        configuration.setAllowedMethods(Arrays.asList("GET", "PUT", "POST", "PATCH", "DELETE", "OPTIONS"));
        configuration.setAllowCredentials(true);
        configuration.setAllowedHeaders(Arrays.asList("Authorization", "Requestor-Type"));
//        configuration.setExposedHeaders(Arrays.asList("X-Get-Header"));
        configuration.setMaxAge(3600L);
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }

  //  @Override
  //  protected void doFilterInternal(
  //      final HttpServletRequest request,
  //      final HttpServletResponse response,
  //      final FilterChain filterChain)
  //      throws ServletException, IOException {
  //    response.addHeader("Access-Control-Allow-Origin", "*");
  //    response.addHeader("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT, PATCH, HEAD");
  //    response.addHeader(
  //        "Access-Control-Allow-Headers",
  //        "Origin, Accept, X-Requested-With, Content-Type, Access-Control-Request-Method,
  // Access-Control-Request-Headers");
  //    response.addHeader(
  //        "Access-Control-Expose-Headers",
  //        "Access-Control-Allow-Origin, Access-Control-Allow-Credentials");
  //    response.addHeader("Access-Control-Allow-Credentials", "true");
  //    response.addIntHeader("Access-Control-Max-Age", 10);
  //    filterChain.doFilter(request, response);
  //  }
  //
  //    @Bean
  //    public WebMvcConfigurer corsConfigurer() {
  //        return new WebMvcConfigurer() {
  //            @Override
  //            public void addCorsMappings(CorsRegistry registry) {
  //                registry.addMapping("/**")
  //                        .allowedOrigins("*") // Replace with your Angular app URL
  //                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Allowed
  // HTTP methods
  //                        .allowedHeaders("*") // Allowed request headers (you can customize this
  // based on your requirements)
  //                        .allowCredentials(true)
  //                ;
  //            }
  //        };
  //    }


}
