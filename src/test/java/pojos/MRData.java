package pojos;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class MRData 
{
	@JacksonXmlProperty(isAttribute=true)
	private String xmlns;
	
	@JacksonXmlProperty(isAttribute=true)
	private String series;
	
	@JacksonXmlProperty(isAttribute=true)
	private String url;
	
	@JacksonXmlProperty(isAttribute=true)
	private int limit;
	
	@JacksonXmlProperty(isAttribute=true)
	private int offset;
	
	@JacksonXmlProperty(isAttribute=true)
	private int total;
	
	@JacksonXmlProperty
	private RaceTable RaceTable; 
	
	//getters
	public String getxmlns()
	{
		return(xmlns);
	}
	public String getSeries()
	{
		return(series);
	}
	public String getUrl()
	{
		return(url);
	}
	public int getLimit()
	{
		return(limit);
	}
	public int getOffset()
	{
		return(offset);
	}
	public int getTotal()
	{
		return(total);
	}
	public RaceTable getRacetable()
	{
		return(RaceTable);
	}
}
