package com.bridgelabz;

public class JDBC_Sql {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Jdbc crud operation in Sql");
		
		//**********Ability to create database***********
		  create database Address_Book;
	      use Address_Book;
	    
	    // *********ability to create table************
	      
	      create table Address_Book_Table(firstName varchar(12) ,
	      lastName varchar(15) , address varchar(50),city varchar(10),
	      state varchar(15), zip int(15) , phoneNumber int(15) , email varchar(50));


	}

}
