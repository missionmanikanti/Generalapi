package pojos;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Race 
{
	@JacksonXmlProperty(isAttribute=true)
	private int season;
	
	@JacksonXmlProperty(isAttribute=true)
	private int round;
	
	@JacksonXmlProperty(isAttribute=true)
	private String url;
	
	@JacksonXmlProperty
	private String RaceName;
	
	@JacksonXmlProperty
	private Circuit Circuit;
	
	@JacksonXmlProperty
	private String Date;
	
	@JacksonXmlProperty
	private String Time;
	
	//getters
	public int getSeason()
	{
		return(season);
	}
	public int getRound()
	{
		return(round);
	}
	public String getUrl()
	{
		return(url);
	}
	public String getRaceName()
	{
		return(RaceName);
	}
	public Circuit getCircuit()
	{
		return(Circuit);
	}
	public String getDate()
	{
		return(Date);
	}
	public String getTime()
	{
		return(Time);
	}
}






