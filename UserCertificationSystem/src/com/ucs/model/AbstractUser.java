package com.ucs.model;

import com.ucs.model.intfc.User;

/**
 * �������û���Ҫ����Ϣ������ͨ���̳и�����ٵĴ�����������û��ࡣ
 * @author 14yang enzhe
 * @see OrdinaryUser
 */

public abstract class AbstractUser implements User {
	protected int id;//�û�id(Ψһ)
	protected String username;//�û���(Ψһ)
	protected String nickname;//�ǳ�
	protected String password;//����(60λBcrypt����)
	protected String role;//�û���ɫ
	protected int state;//�û�״̬
	
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
