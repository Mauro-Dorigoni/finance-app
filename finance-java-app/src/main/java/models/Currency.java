package models;
import java.time.LocalDateTime;

public class Currency {
	private int currency_id;
	private String currency_abbv;
	private String currency_description;
	private LocalDateTime date_deleted;
	public int getCurrency_id() {
		return currency_id;
	}
	public void setCurrency_id(int currency_id) {
		this.currency_id = currency_id;
	}
	public String getCurrency_abbv() {
		return currency_abbv;
	}
	public void setCurrency_abbv(String currency_abbv) {
		this.currency_abbv = currency_abbv;
	}
	public String getCurrency_description() {
		return currency_description;
	}
	public void setCurrency_description(String currency_description) {
		this.currency_description = currency_description;
	}
	public LocalDateTime getDate_deleted() {
		return date_deleted;
	}
	public void setDate_deleted(LocalDateTime date_deleted) {
		this.date_deleted = date_deleted;
	}
}
