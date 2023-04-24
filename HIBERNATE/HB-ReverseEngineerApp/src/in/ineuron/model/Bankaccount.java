package in.ineuron.model;
// Generated Mar 17, 2023, 4:21:32 PM by Hibernate Tools 4.0.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Bankaccount generated by hbm2java
 */
@Entity
@Table(name = "bankaccount", catalog = "tata")
public class Bankaccount implements java.io.Serializable {

	private int accno;
	private String holderName;
	private Float balance;
	private String status;

	public Bankaccount() {
	}

	public Bankaccount(int accno) {
		this.accno = accno;
	}

	public Bankaccount(int accno, String holderName, Float balance, String status) {
		this.accno = accno;
		this.holderName = holderName;
		this.balance = balance;
		this.status = status;
	}

	@Id

	@Column(name = "accno", unique = true, nullable = false)
	public int getAccno() {
		return this.accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	@Column(name = "holderName", length = 20)
	public String getHolderName() {
		return this.holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	@Column(name = "balance", precision = 12, scale = 0)
	public Float getBalance() {
		return this.balance;
	}

	public void setBalance(Float balance) {
		this.balance = balance;
	}

	@Column(name = "status", length = 20)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Bankaccount [accno=" + accno + ", holderName=" + holderName + ", balance=" + balance + ", status="
				+ status + "]";
	}

	
	

	
}
