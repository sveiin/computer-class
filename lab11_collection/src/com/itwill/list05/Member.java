package com.itwill.list05;

import java.util.Objects;

public class Member {
	private String id;
	private String password;
	
	public Member(String id, String password) {
		this.id = id;
		this.password = password;
	}

	public String getId() {
		return id;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Member(id = " + id + ", pw = " + password + ")";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				result = true;
			}
		}
		
		return result;
	}
	
	
}
