package models;
import java.time.LocalDateTime;

public class FixedExpenseCost {
	private int fixed_expense_cost_id;
	private float fixed_amount;
	private LocalDateTime fixed_cost_date_from;
	private LocalDateTime fixed_cost_date_to;
	private FixedExpense fixed_expense;
	private LocalDateTime date_deleted;
	public int getFixed_expense_cost_id() {
		return fixed_expense_cost_id;
	}
	public void setFixed_expense_cost_id(int fixed_expense_cost_id) {
		this.fixed_expense_cost_id = fixed_expense_cost_id;
	}
	public float getFixed_amount() {
		return fixed_amount;
	}
	public void setFixed_amount(float fixed_amount) {
		this.fixed_amount = fixed_amount;
	}
	public LocalDateTime getFixed_cost_date_from() {
		return fixed_cost_date_from;
	}
	public void setFixed_cost_date_from(LocalDateTime fixed_cost_date_from) {
		this.fixed_cost_date_from = fixed_cost_date_from;
	}
	public LocalDateTime getFixed_cost_date_to() {
		return fixed_cost_date_to;
	}
	public void setFixed_cost_date_to(LocalDateTime fixed_cost_date_to) {
		this.fixed_cost_date_to = fixed_cost_date_to;
	}
	public FixedExpense getFixed_expense() {
		return fixed_expense;
	}
	public void setFixed_expense(FixedExpense fixed_expense) {
		this.fixed_expense = fixed_expense;
	}
	public LocalDateTime getDate_deleted() {
		return date_deleted;
	}
	public void setDate_deleted(LocalDateTime date_deleted) {
		this.date_deleted = date_deleted;
	}
	
}
