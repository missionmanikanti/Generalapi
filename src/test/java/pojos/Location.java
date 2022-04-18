package pojos;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Location
{
	@JacksonXmlProperty(isAttribute=true)
	private double lat;
	
	@JacksonXmlProperty(isAttribute=true,localName="long")
	private double longitude; 
	
	@JacksonXmlProperty
	private String Locality;
	
	@JacksonXmlProperty
	private String Country;
	
	//getters
	public double getLat()
	{
		return(lat);
	}
	public double getLongitude()
	{
		return(longitude);
	}
	public String getLocality()
	{
		return(Locality);
	}
	public String getCountry()
	{
		return(Country);
	}
}







