package com.bank.transaction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.transaction.document.Transaction;
import com.bank.transaction.service.TransactionService;

@RestController
public class TransactionController {
	@Autowired
	private TransactionService transactionService;
	
	@GetMapping(value = "/api/v1/transactions")
	@ResponseBody List<Transaction> getTransaction(){
		return transactionService.getTransaction();
	}
	
	@PostMapping(value = "/api/v1/transactions")
	@ResponseBody Transaction saveTransaction(@RequestBody Transaction transaction){
		return transactionService.saveTransaction(transaction);
	}
	
	@PutMapping(value = "/api/v1/transactions")
	@ResponseBody Transaction editTransaction(@RequestBody Transaction transaction){
		return transactionService.editTransaction(transaction);
	}
	
	@DeleteMapping(value = "/api/v1/transactions/{idTransaction}")
	@ResponseBody boolean deletedTransaction(@PathVariable String idTransaction){
		return transactionService.deletedTransaction(idTransaction);
	}
	
	@GetMapping(value = "/api/v1/transactions/ids/{idTransaction}")
	@ResponseBody Transaction searchTransactionId(@PathVariable String idTransaction){
		return transactionService.searchTransactionId(idTransaction);
	}
	
	@GetMapping(value = "/api/v1/transactions/types/{transactionType}")
	@ResponseBody List<Transaction> searchTransactionType(@PathVariable String transactionType){
		return transactionService.searchTransactionType(transactionType);
	}
	
	@GetMapping(value = "/api/v1/transactions/{cardId}")
	@ResponseBody List<Transaction> searchByCardId(@PathVariable String cardId){
		return transactionService.searchByCardId(cardId);
	}

}
