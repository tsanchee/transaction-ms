package com.bank.transaction.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.transaction.document.Transaction;
import com.bank.transaction.repository.TransactionRepository;
import com.bank.transaction.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService {
	@Autowired
	private TransactionRepository transactionRepository;
	
	public List<Transaction> getTransaction() {	
		return transactionRepository.findAll();
	}

	public Transaction saveTransaction(Transaction transaction) {
		return transactionRepository.save(transaction);
	}

	public Transaction editTransaction(Transaction transaction) {
		return transactionRepository.save(transaction);
	}

	public boolean deletedTransaction(String idTransaction) {
		boolean deleted= false;
		try {
			transactionRepository.deleteById(idTransaction);
			deleted=true;
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return deleted;
	}

	public Transaction searchTransactionId(String idTransaction) {
		return transactionRepository.findByIdTransaction(idTransaction);
	}

	public List<Transaction> searchTransactionType(String transactionType) {
		return transactionRepository.findByTransactionType(transactionType);
	}

	public List<Transaction> searchByCardId(String cardId) {
		return transactionRepository.findByCardId(cardId);
	}


}
