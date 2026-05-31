package models;
import java.time.LocalDateTime;

public class Account {
	private int account_id;
	private String account_name;
	private String account_location;
	private float ammount_in_account;
	private String account_type;
	private User user;
	private Currency currency;
	private LocalDateTime date_deleted;
	public int getAccount_id() {
		return account_id;
	}
	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}
	public String getAccount_name() {
		return account_name;
	}
	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}
	public String getAccount_location() {
		return account_location;
	}
	public void setAccount_location(String account_location) {
		this.account_location = account_location;
	}
	public float getAmmount_in_account() {
		return ammount_in_account;
	}
	public void setAmmount_in_account(float ammount_in_account) {
		this.ammount_in_account = ammount_in_account;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	public LocalDateTime getDate_deleted() {
		return date_deleted;
	}
	public void setDate_deleted(LocalDateTime date_deleted) {
		this.date_deleted = date_deleted;
	}
	
}
