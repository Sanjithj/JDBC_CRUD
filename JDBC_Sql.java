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
	      
	    //**************Ability to insert new contact************
	      insert into Address_Book_Table values(Sanjith","j","Arsikere","Hassan","karnatka",546463,768768667,"sanjith@gmail.com");
	      insert into Address_Book_Table values("Karan","Kanaka","Wangova","Miraz","Argentina",686333,867686864,"sanji@gmail.com");
	      insert into Address_Book_Table values("Bheema","Rana","jalawar","capa","Mexico",786768,572552211,"rana@gmail.com");

	    //*********Ability to update the contact**********
	      update Address_Book_Table SET state = "Finland" where firstName="Bheema";
	      
	    //***********Ability to delete contact***********
	      delete from Address_Book_Table where firstName = "Bheema";
	      
	    //**********Ability to retrive using city or state**********
	      select * from Address_Book_Table where city="Hassan" or state="karnatka";
	      
	    //*************Size of address book by city or state*************
	      select COUNT(firstName) from Address_Book_Table where city = "Hassan" or state = 'karnatka';
	    
	    //*******Sorted person name by city in ascending order*********
	      select city , firstName from Address_Book_Table ORDER BY city ASC;
	      
	    //*******Sorted person name by city in descending order*********
	      select city , firstName from Address_Book_Table ORDER BY city desc;

	    //********* Ability to identify each Address Book with name and type**********
	      ALTER TABLE Address_Book_Table
	      ADD type varchar(50);

	      update Address_Book_Table set type = "relative" where firstName = "Karan"";
	      select *from Address_Book_Table;

	    //**********************Ability to get number of contact persons ****************
	      select COUNT(firstName) from Address_Book_Table;

	}

}
