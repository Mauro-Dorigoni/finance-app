package models;
import java.time.LocalDateTime;

public class FixedExpense {
	private int fixed_expense_id;
	private String fixed_expense_name;
	private String fixed_expense_description;
	private String fixed_expense_period;
	private User user;
	private LocalDateTime date_deleted;
	public int getFixed_expense_id() {
		return fixed_expense_id;
	}
	public void setFixed_expense_id(int fixed_expense_id) {
		this.fixed_expense_id = fixed_expense_id;
	}
	public String getFixed_expense_name() {
		return fixed_expense_name;
	}
	public void setFixed_expense_name(String fixed_expense_name) {
		this.fixed_expense_name = fixed_expense_name;
	}
	public String getFixed_expense_description() {
		return fixed_expense_description;
	}
	public void setFixed_expense_description(String fixed_expense_description) {
		this.fixed_expense_description = fixed_expense_description;
	}
	public String getFixed_expense_period() {
		return fixed_expense_period;
	}
	public void setFixed_expense_period(String fixed_expense_period) {
		this.fixed_expense_period = fixed_expense_period;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public LocalDateTime getDate_deleted() {
		return date_deleted;
	}
	public void setDate_deleted(LocalDateTime date_deleted) {
		this.date_deleted = date_deleted;
	}
}
