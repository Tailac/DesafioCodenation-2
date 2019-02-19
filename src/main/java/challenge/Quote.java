package challenge;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "SCRIPTS")
public class Quote {

	@Id
	@JsonIgnore
	private Integer id;

	private String actor;
	private String detail;

	public Quote(Integer id, String actor, String detail) {
		this.id = id;
		this.actor = actor;
		this.detail = detail;
	}

	public Quote() {
		super();
	}

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

	@Override
	public String toString() {
		return "Quote [id=" + id + ", actor=" + actor + ", detail=" + detail + "]";
	}

}
