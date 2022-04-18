package tests;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import pojos.MRData;

public class Test1
{
	public static void main(String[] args) throws Exception
	{
		//Connect to the RESTful web service by giving year as path parameter
		Response res=RestAssured.given()
						.baseUri("http://ergast.com/api/f1/2020")
					.when()
						.get();
		String body=res.getBody().asString();
		//Deserialization of full XML Response body into POJO class object
	    XmlMapper xm=new XmlMapper();
		MRData data=xm.readValue(body,MRData.class);
		System.out.println(data.getTotal());
		System.out.println(data.getRacetable().getSeason());
		System.out.println(data.getRacetable().getRace().get(3).getDate()); //4th Race
		System.out.println(data.getRacetable().getRace().get(3).getCircuit().getCircuitName());
		System.out.println(data.getRacetable().getRace().get(3).getCircuit().getLocation()
																			.getLongitude());
	}
}
