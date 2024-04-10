package org.jayakrishna.bookmyshow.showentity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movie_info")
public class ShowEntity implements Serializable{
	@Id
	@Column(name="alt_key")
	private long altkey;
	
	@Column(name="movie_name")
	private String movieName;
	
	@Column(name="actor_name")
	private String actorName;
	
	@Column(name="actress_name")
	private String actressName;
	
	@Column(name="release_date")
	private String releaseDate;
	
	@Column(name="rating")
	private String rating;
	
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
	public String getActorName() {
		return actorName;
	}
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
	public String getActressName() {
		return actressName;
	}
	public void setActressName(String actressName) {
		this.actressName = actressName;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "ApplicationEntity [altkey=" + altkey + ", movieName=" + movieName + ", actorName=" + actorName
				+ ", actressName=" + actressName + ", releaseDate=" + releaseDate + ", rating=" + rating + "]";
	}
	
	

}
