package com.bank.transaction.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bank.transaction.document.Transaction;

@Repository
public interface TransactionRepository extends MongoRepository<Transaction, String> {
	Transaction findByIdTransaction(String idTransaction);
	List<Transaction> findByTransactionType(String transactionType);
	List<Transaction> findByCardId(String cardId);
}
