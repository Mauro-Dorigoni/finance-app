package models;
import java.time.LocalDateTime;

public class Income {
	private int income_id;
	private float income_ammount;
	private String income_description;
	private String income_file_attachment;
	private LocalDateTime income_date;
	private LocalDateTime income_date_uploaded;
	private IncomeCategory category;
	private User user;
	private Account account;
	private LocalDateTime date_deleted;
	public int getIncome_id() {
		return income_id;
	}
	public void setIncome_id(int income_id) {
		this.income_id = income_id;
	}
	public float getIncome_ammount() {
		return income_ammount;
	}
	public void setIncome_ammount(float income_ammount) {
		this.income_ammount = income_ammount;
	}
	public String getIncome_description() {
		return income_description;
	}
	public void setIncome_description(String income_description) {
		this.income_description = income_description;
	}
	public String getIncome_file_attachment() {
		return income_file_attachment;
	}
	public void setIncome_file_attachment(String income_file_attachment) {
		this.income_file_attachment = income_file_attachment;
	}
	public LocalDateTime getIncome_date() {
		return income_date;
	}
	public void setIncome_date(LocalDateTime income_date) {
		this.income_date = income_date;
	}
	public LocalDateTime getIncome_date_uploaded() {
		return income_date_uploaded;
	}
	public void setIncome_date_uploaded(LocalDateTime income_date_uploaded) {
		this.income_date_uploaded = income_date_uploaded;
	}
	public IncomeCategory getCategory() {
		return category;
	}
	public void setCategory(IncomeCategory category) {
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
	public LocalDateTime getDate_deleted() {
		return date_deleted;
	}
	public void setDate_deleted(LocalDateTime date_deleted) {
		this.date_deleted = date_deleted;
	}
	
}
