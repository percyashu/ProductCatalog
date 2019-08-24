package com.products;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.event.ListSelectionEvent;

import com.dbconnection.Dbconnection;
import com.mysql.jdbc.Statement;

public class ProductsService {

		private static List<Products> products = new ArrayList<Products>();
		
		public List<Products> retrieveProducts(){
			return products;
		}
		public List<Products> clearProds(){
			products.clear();
			return products;
			
		}
		public void addProducts(Products product) {
			products.add(product);
		}
		public void delProds() {
			products.clear();
			
		}
		public int sizeProds() {
			int i=products.size();
			return i;
		}
		}
