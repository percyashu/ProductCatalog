package com.catalog;

public class Catalog {

	private String Cname;
	private String Cdescript;

	public Catalog(String cname, String cdescript) {
		super();
		Cname = cname;
		Cdescript = cdescript;
	}

	@Override
	public String toString() {
		return String.format("Catalog [Cname=%s, Cdescript=%s]", Cname, Cdescript);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Cdescript == null) ? 0 : Cdescript.hashCode());
		result = prime * result + ((Cname == null) ? 0 : Cname.hashCode());
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
		Catalog other = (Catalog) obj;
		if (Cdescript == null) {
			if (other.Cdescript != null)
				return false;
		} else if (!Cdescript.equals(other.Cdescript))
			return false;
		if (Cname == null) {
			if (other.Cname != null)
				return false;
		} else if (!Cname.equals(other.Cname))
			return false;
		return true;
	}

	public String getCname() {
		return Cname;
	}

	public String getCdescript() {
		return Cdescript;
	}

	public void setCname(String Cname) {
		this.Cname = Cname;
	}

	public void setCdescript(String Cdescript) {
		this.Cdescript = Cdescript;
	}

}
