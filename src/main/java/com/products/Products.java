package com.products;

import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Products {
	private String PiD;
	private String Pname;
	private String Cname;
	private Blob Pimage;
	public  Products(ResultSet resultSet)  throws SQLException{
		
		this.PiD=resultSet.getString("PiD");
		this.Pname=resultSet.getString("Pname");;
		this.Cname=resultSet.getString("Cname");;
		this.Pimage =resultSet.getBlob("Pimage");;
	}
	
	
	public String getPiD() {
		return PiD;
	}


	public void setPiD(String piD) {
		this.PiD = piD;
	}


	public String getPname() {
		return Pname;
	}


	public void setPname(String pname) {
		this.Pname = pname;
	}


	public String getCname() {
		return Cname;
	}


	public void setCname(String cname) {
		this.Cname = cname;
	}


	public Blob getPimage() {
		return Pimage;
	}


	public void setPimage(Blob image) {
		this.Pimage = image;
	}


	
	

}
