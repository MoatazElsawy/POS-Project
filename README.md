# POS-Project
Desktop APP that Involves all of Module, View and Controller(MVC Design Pattern).

This project is fully object oriented programming(OOP) ,that represent a small point of sale project. 
where I'm created (Item, Category, WareHouse, Client , Order, User, Invoice) for data transfer object to create, retraive, update and delete(CRUD) from and to database by UI interface.

I'm used MVC desin pattern to build my project ,In fact I didn't complete the view (UI) perfectly because I'm satisfied with the main idea and understanding how it works.
And used DAO, BAO desin patterns and Factory DP between them, Generic Interfaces  to generalize and save in code
Then, I used JDBC to connect to database by MySql JDBC Driver.

I'm used MySql DBMS to creat my schema of database for Project.
and create (categort, warehouse, item, client, odrer, user and invoice) tables and relationship, constraint betwen them.

I'm used Swing GUI widget toolkit to represent my view of project.

tip, the user and password are ("moataz" , "ahmed") for logIn to POS project 
Then,,  url, username and password for connection to database are locally, if you want t run this project you must chnage this(url, username and password) in jdbc.properties file 
from this path "JSE_POS\src\com\pos\dao\util\jdbc.properties".
