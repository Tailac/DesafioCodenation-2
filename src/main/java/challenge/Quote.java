package challenge;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="SCRIPTS")
public class Quote {
	
	private Integer id;
	private String actor;
	private String detail;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getActor() {
		return this.actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getQuote() {
		return this.detail;
	}

	public void setQuote(String quote) {
		this.detail = quote;
	}

}
