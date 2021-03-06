package com.Daily.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;


@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable(); // csrf 비활성화
		http.authorizeRequests()// 서버에 요청이 들어오면
			.antMatchers("/") // 해당하는 요청들은
			.authenticated()  // 모두 인증을 거쳐야한다.
			.anyRequest()  // 그 외의 모든 요청은
			.permitAll()  // 권한을 허가
			.and()  // 그리고
			.formLogin()  // 로그인 화면은  
			.loginPage("/auth/signin") // 해당 get요청으로 응답해주면되고
			.loginProcessingUrl("/auth/signin") // 로그인 submit 요청시에 Post 요청으로 /auth/signin 요청을 해라
			.defaultSuccessUrl("/"); // 로그인에 성공했으면 해당 url 로 이동을 해라
	}

		
}
