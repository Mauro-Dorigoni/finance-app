package models;
import java.time.LocalDateTime;

public class IncomeCategory {
	private int income_category_id;
	private String income_category_name;
	private String income_category_description;
	private LocalDateTime date_deleted;
	private User user;
	public int getIncome_category_id() {
		return income_category_id;
	}
	public void setIncome_category_id(int income_category_id) {
		this.income_category_id = income_category_id;
	}
	public String getIncome_category_name() {
		return income_category_name;
	}
	public void setIncome_category_name(String income_category_name) {
		this.income_category_name = income_category_name;
	}
	public String getIncome_category_description() {
		return income_category_description;
	}
	public void setIncome_category_description(String income_category_description) {
		this.income_category_description = income_category_description;
	}
	public LocalDateTime getDate_deleted() {
		return date_deleted;
	}
	public void setDate_deleted(LocalDateTime date_deleted) {
		this.date_deleted = date_deleted;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
