//package com.dsw.security.server.resource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationManager;
//import org.springframework.security.oauth2.provider.token.AccessTokenConverter;
//import org.springframework.security.oauth2.provider.token.DefaultAccessTokenConverter;
//import org.springframework.security.oauth2.provider.token.DefaultUserAuthenticationConverter;
//import org.springframework.security.oauth2.provider.token.RemoteTokenServices;
//import org.springframework.security.oauth2.provider.token.ResourceServerTokenServices;
////a怎么来验证这个令牌，service 发请求到认证服务器上去验证
//@Configuration
//@EnableWebSecurity
//public class OAuth2WebSecurityConfig extends WebSecurityConfigurerAdapter {
//	
//	@Autowired
//	private UserDetailsService userDetailsService;
//	
//	
//    @Bean
//    public ResourceServerTokenServices tokenServices() {
//        RemoteTokenServices tokenServices = new RemoteTokenServices();
//        tokenServices.setClientId("orderService");
//        tokenServices.setClientSecret("123456");
//        tokenServices.setCheckTokenEndpointUrl("http://localhost:9090/oauth/check_token");
//        tokenServices.setAccessTokenConverter(getAccessTokenConverter());//a把令牌转换成用户信息
//        return tokenServices;
//    }
//
//    private AccessTokenConverter getAccessTokenConverter() {
//		DefaultAccessTokenConverter accessTokenConverter = new DefaultAccessTokenConverter();
//		DefaultUserAuthenticationConverter userTokenConverter = new DefaultUserAuthenticationConverter();
//		userTokenConverter.setUserDetailsService(userDetailsService);
//		accessTokenConverter.setUserTokenConverter(userTokenConverter);
//		return accessTokenConverter;
//	}
//
//	@Bean
//    @Override
//    public AuthenticationManager authenticationManagerBean() throws Exception {
//        OAuth2AuthenticationManager auth2AuthenticationManager = new OAuth2AuthenticationManager();
//        auth2AuthenticationManager.setTokenServices(tokenServices());
//        return auth2AuthenticationManager;
//    }
//}
