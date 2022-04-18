package tests;

import io.restassured.RestAssured;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import pojos.Race;

public class Test3
{
	public static void main(String[] args) throws Exception
	{
		//Connect to the RESTful web service by giving year as path parameter
		Response res=RestAssured.given()
				.baseUri("http://ergast.com/api/f1/2020")
			.when()
				.get();
		//Deserialization of part of XML Response body into POJO class object
		XmlPath xp=res.xmlPath();
		Race[] data=xp.getObject("MRData.RaceTable.Race",Race[].class);
		System.out.println(data[3].getDate()); //4th Race
		System.out.println(data[3].getCircuit().getCircuitName());
		System.out.println(data[3].getCircuit().getLocation().getLongitude());
	}
}
