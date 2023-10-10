package com.jyoti;

import io.restassured.RestAssured;

public class AppTest {

	private static String uri = "http://localhost:8878";
	private static String basePath = "softech";

	public static void main(String[] args) {
		
	/*RestAssured.given()// GET Request
					.baseUri(uri)
					.basePath(basePath)
					.when()
					.get()
					.then()
					.log()
					.all();
	*/
		
	/*	
		Student st = new Student("Jyoti","Gajare","Pune","987654213");
		
		RestAssured.given() //POST Request
		.baseUri(uri)
		.basePath(basePath)
		.contentType(ContentType.JSON)
		.body(st, ObjectMapperType.JACKSON_2)
		.when()
		.post()
		.then()
		.log()
		.all();
		*/
	
		/*	Student st = new Student(); // PUT Request
		st.setId(2);
		st.setFname("Jyoti");
		st.setAddress("Nanded");
		st.setLname("Pawar");
		st.setMobile("98745456321");
		
		//String data= "{\"fname\":\"Maroti\",\"lname\":\"Pawar\",\"address\":\"Nanded\",\"mobile\":\"987654321\"}";
		
				RestAssured.given()
					.baseUri(uri)
					.basePath(basePath)
					.contentType(ContentType.JSON)
					.body(st,ObjectMapperType.JACKSON_2)
					.when()
					.put("/2")
					.then()
					.log()
					.all();
					*/
		/*
		Student st = new Student(); //PATCH Request
		st.setFname("Prachi");
		RestAssured.given()
					.baseUri(uri)
					.basePath(basePath)
					.contentType(ContentType.JSON)
					.body(st, ObjectMapperType.JACKSON_2)
					.when()
					.patch("/2")
					.then()
					.log()
					.all();
		*/
		RestAssured.given() // DELETE Request
		.basePath(basePath)
		.baseUri(uri)
		.when()
		.delete("/2")
		.then()
		.log()
		.all();
					
	}
	

	
	
	
}
