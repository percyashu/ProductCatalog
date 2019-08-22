package com.catalog;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dbconnection.Dbconnection;

public class  CatalogService {

	private static List<Catalog> catalogs= new ArrayList<Catalog>();
	

public List<Catalog> retrieveCatalogs() {
	return catalogs;
}
public List<Catalog> clearCat(){
	catalogs.clear();
	return catalogs;
}
public void addCat(Catalog catalog) {
	
	catalogs.add(catalog);
}
public void deleteCatalog(Catalog catalog) {
	catalogs.clear();
	catalogs.remove(catalog);
}

}

