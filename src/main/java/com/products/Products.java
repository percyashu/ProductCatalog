package com.products;

import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Products {
	private int Pid;
	private String Pname;
	private String Cname;
	private byte[] Pimage;
   private String Simage;
	

	public Products(int pid, String pname, String cname, byte[] pimage, String simage) {
	super();
	Pid = pid;
	Pname = pname;
	Cname = cname;
	Pimage = pimage;
	Simage = simage;
}

	public int getPid() {
		return Pid;
	}

	public void setPid(int pid) {
		Pid = pid;
	}

	public String getPname() {
		return Pname;
	}

	public void setPname(String pname) {
		Pname = pname;
	}

	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}

	public byte[] getPimage() {
		return Pimage;
	}

	public void setPimage(byte[] pimage) {
		Pimage = pimage;
	}

	

	public String getSimage() {
		return Simage;
	}

	public void setSimage(String simage) {
		Simage = simage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Pid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Products other = (Products) obj;
		if (Pid != other.Pid)
			return false;
		return true;
	}
	
	

}
