package com.bezkoder.spring.login.payload.response;

import java.util.List;

public class UserInfoResponse2 {
	private Long id;
	private String username;
	private String email;
	private String accessToken;
	private List<String> roles;

	public UserInfoResponse2(Long id, String username, String email, String access_token, List<String> roles) {
		this.id = id;
		this.username = username;
		this.email = email;
		this.accessToken = access_token;
		this.roles = roles;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<String> getRoles() {
		return roles;
	}

	public String getAccess_token() {
		return accessToken;
	}

	public UserInfoResponse2 setAccess_token(String access_token) {
		this.accessToken = access_token;
		return this;
	}

	public UserInfoResponse2 setRoles(List<String> roles) {
		this.roles = roles;
		return this;
	}
}
