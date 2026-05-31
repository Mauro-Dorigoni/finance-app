package models;
import java.time.LocalDateTime;

public class Expense {
	private int expense_id;
	private float expense_amount;
	private String expense_description;
	private LocalDateTime expense_date;
	private LocalDateTime expense_date_uploaded;
	private String expense_file_attachment;
	private ExpenseCategory category;
	private User user;
	private Account account;
	private FixedExpense fixed_expense;
	public int getExpense_id() {
		return expense_id;
	}
	public void setExpense_id(int expense_id) {
		this.expense_id = expense_id;
	}
	public float getExpense_amount() {
		return expense_amount;
	}
	public void setExpense_amount(float expense_amount) {
		this.expense_amount = expense_amount;
	}
	public String getExpense_description() {
		return expense_description;
	}
	public void setExpense_description(String expense_description) {
		this.expense_description = expense_description;
	}
	public LocalDateTime getExpense_date() {
		return expense_date;
	}
	public void setExpense_date(LocalDateTime expense_date) {
		this.expense_date = expense_date;
	}
	public LocalDateTime getExpense_date_uploaded() {
		return expense_date_uploaded;
	}
	public void setExpense_date_uploaded(LocalDateTime expense_date_uploaded) {
		this.expense_date_uploaded = expense_date_uploaded;
	}
	public String getExpense_file_attachment() {
		return expense_file_attachment;
	}
	public void setExpense_file_attachment(String expense_file_attachment) {
		this.expense_file_attachment = expense_file_attachment;
	}
	public ExpenseCategory getCategory() {
		return category;
	}
	public void setCategory(ExpenseCategory category) {
		this.category = category;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public FixedExpense getFixed_cost() {
		return fixed_expense;
	}
	public void setFixed_cost(FixedExpense fixed_cost) {
		this.fixed_expense = fixed_cost;
	}
	
}
