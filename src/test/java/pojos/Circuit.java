package pojos;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Circuit
{
	@JacksonXmlProperty(isAttribute=true)
	private String circuitId;
	
	@JacksonXmlProperty(isAttribute=true)
	private String url;
	
	@JacksonXmlProperty
	private String CircuitName;
	
	@JacksonXmlProperty
	private Location Location;
	
	//getters
	public String getCircuitId()
	{
		return(circuitId);
	}
	public String getUrl()
	{
		return(url);
	}
	public String getCircuitName()
	{
		return(CircuitName);
	}
	public Location getLocation()
	{
		return(Location);
	}
}









