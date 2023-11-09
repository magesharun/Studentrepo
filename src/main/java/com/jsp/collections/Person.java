package com.jsp.collections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Person 
{
	@Value("101")
	private int personid;
	@Value("magesh")
	private String personname;
	public int getPersonid() {
		return personid;
	}
	public void setPersonid(int personid) {
		this.personid = personid;
	}
	public String getPersonname() {
		return personname;
	}
	public void setPersonname(String personname) {
		this.personname = personname;
	}
	@Override
	public String toString() {
		return "Person [personid=" + personid + ", personname=" + personname + "]";
	}

}
