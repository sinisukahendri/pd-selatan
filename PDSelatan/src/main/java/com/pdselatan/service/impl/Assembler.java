package com.pdselatan.service.impl;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pdselatan.model.UserRole;

@Service("assembler")
public class Assembler {

	@Transactional(readOnly = true)
	User buildUserFromUserEntity(com.pdselatan.model.User usr) {

		String username = usr.getUsername();

		// Password will be managed by OpenID so leave it blank
		String password = usr.getPassword();
		
		boolean enabled = usr.isEnabled();
		boolean accountNonExpired = usr.isEnabled();
		boolean credentialsNonExpired = usr.isEnabled();
		boolean accountNonLocked = usr.isEnabled();

		Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

		for (UserRole role : usr.getRoles()) {
			System.out.println("adding role = " + role.getRoleId().getRoleName()
					+ " to user = " + usr.getUsername());
			authorities.add(new SimpleGrantedAuthority(role.getRoleId().getRoleName()));
		}

		// authorities.add(new SimpleGrantedAuthority("ROLE_"+usr.getRole()));
		// authorities.add(new SimpleGrantedAuthority("ROLE_USER"));

		User user = new User(username, password, enabled, accountNonExpired,
				credentialsNonExpired, accountNonLocked, authorities);
		return user;
	}

	
}
