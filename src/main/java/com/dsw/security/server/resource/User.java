//package com.dsw.security.server.resource;
//
//import java.util.Collection;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.userdetails.UserDetails;
//
//public class User implements UserDetails {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		return AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_ADMIN");
//	}
//
////	public String getPassword() {
////		// TODO Auto-generated method stub
////		return null;
////	}
////
////	public String getUsername() {
////		// TODO Auto-generated method stub
////		return null;
////	}
//
//	public boolean isAccountNonExpired() {
//		return true;
//	}
//
//	public boolean isAccountNonLocked() {
//		return true;
//	}
//
//	public boolean isCredentialsNonExpired() {
//		return true;
//	}
//
//	public boolean isEnabled() {
//		return true;
//	}
//
//
//	private Long id;
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//
//	private String username;
//	private String password;
//	
//	
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//	
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//}
