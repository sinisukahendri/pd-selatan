package com.pdselatan.common;

import java.security.MessageDigest;

import com.pdselatan.service.impl.Assembler;

public class Tools {

	public static String encryptPassNow(String password) {
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
	
	public static void main(String args[]){
		System.out.println(encryptPassNow("arga"));
	}
	
}
