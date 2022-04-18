package pojos;

import java.util.ArrayList;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class RaceTable 
{
	@JacksonXmlProperty(isAttribute=true)
	private int season;
	
	@JacksonXmlElementWrapper(useWrapping=false)
    private ArrayList<Race> Race=new ArrayList<Race>();
	
	//getters
	public int getSeason()
	{
		return(season);
	}
	public ArrayList<Race> getRace()
	{
		return(Race);
	}
}











