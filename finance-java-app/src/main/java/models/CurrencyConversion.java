package models;
import java.time.LocalDateTime;

public class CurrencyConversion {
	private int conversion_id;
	private float conversion_rate;
	private LocalDateTime conversion_date_from;
	private LocalDateTime conversion_date_to;
	private LocalDateTime date_deleted;
	private Currency currency_from;
	private Currency currency_to;
	public int getConversion_id() {
		return conversion_id;
	}
	public void setConversion_id(int conversion_id) {
		this.conversion_id = conversion_id;
	}
	public float getConversion_rate() {
		return conversion_rate;
	}
	public void setConversion_rate(float conversion_rate) {
		this.conversion_rate = conversion_rate;
	}
	public LocalDateTime getConversion_date_from() {
		return conversion_date_from;
	}
	public void setConversion_date_from(LocalDateTime conversion_date_from) {
		this.conversion_date_from = conversion_date_from;
	}
	public LocalDateTime getConversion_date_to() {
		return conversion_date_to;
	}
	public void setConversion_date_to(LocalDateTime conversion_date_to) {
		this.conversion_date_to = conversion_date_to;
	}
	public LocalDateTime getDate_deleted() {
		return date_deleted;
	}
	public void setDate_deleted(LocalDateTime date_deleted) {
		this.date_deleted = date_deleted;
	}
	public Currency getCurrency_from() {
		return currency_from;
	}
	public void setCurrency_from(Currency currency_from) {
		this.currency_from = currency_from;
	}
	public Currency getCurrency_to() {
		return currency_to;
	}
	public void setCurrency_to(Currency currency_to) {
		this.currency_to = currency_to;
	}

}
