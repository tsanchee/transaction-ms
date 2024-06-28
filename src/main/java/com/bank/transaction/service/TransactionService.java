package com.bank.transaction.service;


import java.util.List;

import com.bank.transaction.document.Transaction;

public interface TransactionService {
	List<Transaction> getTransaction();
	Transaction saveTransaction(Transaction transaction);
	Transaction editTransaction(Transaction transaction);
	boolean deletedTransaction(String idTransaction);
	Transaction searchTransactionId(String idTransaction);
	List<Transaction> searchTransactionType(String transactionType);
	List<Transaction> searchByCardId(String cardId);

}
