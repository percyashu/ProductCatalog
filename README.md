#ProductCatalog

#Description

It is a Java EE web Application used to manage products and catalog.
Where all users can view products and their category but only authorised users can add,remove and edit products and categories.

#Setup

1. Import the mysql  productdb.sql import file phpmyadmin.
2. Copy the clone project to your sts workspace
3. Run the project as maven build tomcat7:run

#Package descriptions

1. com.dbconnection :Used to establish connection to database. /*username & password can be changed here to that of your phpmyadmin username and password */
2. com.signIn :Used to authenticate users 
3. com.signUp :Used to add a new authenticated user
4. com.logout :used to invalidate session
5. com.filter :Used to ensure only authenticated users can modify products and catalogs
6. com.user :Used to manage user in connection with the usertbl in the productdb database
7. com.product :Used to edit,display and remove products in the producttbl in the database
8. com.catalog :USed to edit,display and remove categories in the categortbl 
 
