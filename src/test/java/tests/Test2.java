package tests;

import java.io.File;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import pojos.MRData;

public class Test2
{
	public static void main(String[] args) throws Exception
	{
		//Specify the file which consists of XML response
		File f=new File("src\\test\\resources\\racedata.xml");
		//Deserialization
		XmlMapper xm=new XmlMapper();
		MRData data=xm.readValue(f,MRData.class);
		System.out.println(data.getTotal());
		System.out.println(data.getRacetable().getSeason());
		System.out.println(data.getRacetable().getRace().get(3).getDate()); //4th Race
		System.out.println(data.getRacetable().getRace().get(3).getCircuit().getCircuitName());
		System.out.println(data.getRacetable().getRace().get(3).getCircuit().getLocation()
																			.getLongitude());
	}
}
