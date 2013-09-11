package com.pdselatan.service.impl;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pdselatan.model.Role;

@Service("assembler")
public class Assembler {

	@Transactional(readOnly = true)
	User buildUserFromUserEntity(com.pdselatan.model.User usr) {

		String username = usr.getUsername();

		// Password will be managed by OpenID so leave it blank
		String password = "";

		boolean enabled = usr.isEnabled();
		boolean accountNonExpired = usr.isEnabled();
		boolean credentialsNonExpired = usr.isEnabled();
		boolean accountNonLocked = usr.isEnabled();

		Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

		for (Role role : usr.getRoles()) {
			System.out.println("adding role = " + role.getAuthority()
					+ " to user = " + usr.getUsername());
			authorities.add(new SimpleGrantedAuthority(role.getAuthority()));
		}

		// authorities.add(new SimpleGrantedAuthority("ROLE_"+usr.getRole()));
		// authorities.add(new SimpleGrantedAuthority("ROLE_USER"));

		User user = new User(username, password, enabled, accountNonExpired,
				credentialsNonExpired, accountNonLocked, authorities);
		return user;
	}

	public String encryptPassNow(String password) {
		byte[] plainText = password.getBytes();
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (Exception e) {
			System.err.println(e.toString());
		}
		md.reset();
		md.update(plainText);
		byte[] encodedPassword = md.digest();

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < encodedPassword.length; i++) {
			if ((encodedPassword[i] & 0xff) < 0x10) {
				sb.append("0");
			}
			sb.append(Long.toString(encodedPassword[i] & 0xff, 16));
		}
		return sb.toString();
	}

}
