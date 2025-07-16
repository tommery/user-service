package com.sita.domain;

public class User {
	private Long id;
    private String userName;

    public User() { }

	public User(String name) {
		this.id = 1L;
		this.userName = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	
    
    
}
