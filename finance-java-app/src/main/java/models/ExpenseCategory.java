package models;
import java.time.LocalDateTime;

public class ExpenseCategory {
	private int expense_category_id;
	private String expense_category_name;
	private String expense_category_description;
	private LocalDateTime date_deleted;
	private User user;
	public int getexpense_category_id() {
		return expense_category_id;
	}
	public void setexpense_category_id(int expense_category_id) {
		this.expense_category_id = expense_category_id;
	}
	public String getexpense_category_name() {
		return expense_category_name;
	}
	public void setexpense_category_name(String expense_category_name) {
		this.expense_category_name = expense_category_name;
	}
	public String getexpense_category_description() {
		return expense_category_description;
	}
	public void setexpense_category_description(String expense_category_description) {
		this.expense_category_description = expense_category_description;
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
