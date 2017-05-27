package com.ucs.model;

import com.ucs.model.intfc.User;

/**
 * 包含了用户必要的信息，可以通过继承该类快速的创建新种类的用户类。
 * @author 14yang enzhe
 * @see OrdinaryUser
 */

public abstract class AbstractUser implements User {
	protected int id;//用户id(唯一)
	protected String username;//用户名(唯一)
	protected String nickname;//昵称
	protected String password;//密码(60位Bcrypt加密)
	protected String role;//用户角色
	protected int state;//用户状态
	
	public AbstractUser() {
	}
	
	public AbstractUser(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
