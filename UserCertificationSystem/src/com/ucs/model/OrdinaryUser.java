package com.ucs.model;

import java.io.Serializable;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.ucs.model.intfc.User;
import com.ucs.security.GrantedAuthorityImpl;

/**
 * 普通用户类，继承父类属性有：
 * 用户id：int id
 * 用户名：String username
 * 用户昵称：String nickname
 * 用户密码：String password
 * 用户角色：String role
 * 用户状态： int state
 * 
 * @author 14yang enzhe
 * @see AbstractUser
 */
public class OrdinaryUser extends AbstractUser implements User,UserDetails,Serializable {
	private OrdinaryUserMessage userMessage;
	private Collection<GrantedAuthorityImpl> authorities;

	public OrdinaryUser() {
	}
	
	public OrdinaryUser(String username, String password) {
		super(username, password);
	}

	public OrdinaryUserMessage getUserMessage() {
		return userMessage;
	}

	public void setUserMessage(OrdinaryUserMessage userMessage) {
		this.userMessage = userMessage;
	}
	
	public void setAuthorities(Collection<GrantedAuthorityImpl> authorities) {
		this.authorities = authorities;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String toString() {
		return "OrdinaryUser [userMessage=" + userMessage + ", authorities=" + authorities + ", id=" + id
				+ ", username=" + username + ", nickname=" + nickname + ", password=" + password + ", role=" + role + ", state=" + state + "]";
	}
	
	
}
