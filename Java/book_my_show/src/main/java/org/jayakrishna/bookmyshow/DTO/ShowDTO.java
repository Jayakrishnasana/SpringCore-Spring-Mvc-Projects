package org.jayakrishna.bookmyshow.DTO;

import java.io.Serializable;

public class ShowDTO implements Serializable {
	private long altkey;
	private String movieName;
	private String releasedate;
	public long getAltkey() {
		return altkey;
	}
	public void setAltkey(long altkey) {
		this.altkey = altkey;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getReleasedate() {
		return releasedate;
	}
	public void setReleasedate(String releasedate) {
		this.releasedate = releasedate;
	}
	
	
	
}
