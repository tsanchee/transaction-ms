package com.bank.transaction.document;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "transaction")
public class Transaction {
	@Id
	private String idTransaction;
	private String cardId;
	private String transactionType;
	private Double amount;
	private Date transactionTime;
	private String maintenanceCommission;
	
	public String getIdTransaction() {
		return idTransaction;
	}
	public void setIdTransaction(String idTransaction) {
		this.idTransaction = idTransaction;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Date getTransactionTime() {
		return transactionTime;
	}
	public void setTransactionTime(Date transactionTime) {
		this.transactionTime = transactionTime;
	}
	public String getMaintenanceCommission() {
		return maintenanceCommission;
	}
	public void setMaintenanceCommission(String maintenanceCommission) {
		this.maintenanceCommission = maintenanceCommission;
	}
	public Transaction(String idTransaction, String cardId, String transactionType, Double amount, Date transactionTime,
			String maintenanceCommission) {
		super();
		this.idTransaction = idTransaction;
		this.cardId = cardId;
		this.transactionType = transactionType;
		this.amount = amount;
		this.transactionTime = transactionTime;
		this.maintenanceCommission = maintenanceCommission;
	}
	public Transaction() {
		super();
	}
	@Override
	public String toString() {
		return "Transaction [idTransaction=" + idTransaction + ", cardId=" + cardId + ", transactionType="
				+ transactionType + ", amount=" + amount + ", transactionTime=" + transactionTime
				+ ", maintenanceCommission=" + maintenanceCommission + "]";
	}
	
	
	
}
