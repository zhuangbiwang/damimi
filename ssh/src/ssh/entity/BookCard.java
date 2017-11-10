package ssh.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BookCard {
	private int cid;
	private String name;
	private String sex;
	private Date cardDate;
	private BigDecimal deposit;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getCardDate() {
		return cardDate;
	}
	public void setCardDate(Date cardDate) {
		this.cardDate = cardDate;
	}
	public BigDecimal getDeposit() {
		return deposit;
	}
	public void setDeposit(BigDecimal deposit) {
		this.deposit = deposit;
	}
}
