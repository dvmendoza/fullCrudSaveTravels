package com.dvmendoza.savetravels.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.dvmendoza.savetravels.models.Expense;
import com.dvmendoza.savetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {

	private final ExpenseRepository expenseRepository;
	
	public ExpenseService(ExpenseRepository expenseRepository) {
		this.expenseRepository = expenseRepository;
	}
	
	public void createExpense(@Valid Expense expense) {
		// TODO Auto-generated method stub
		expenseRepository.save(expense);
	}

	public List<Expense> allExpenses() {
		return expenseRepository.findAll();
	}

	public Expense findExpense(Long id) {
		Optional<Expense> optionalExpense = expenseRepository.findById(id);
		if(optionalExpense.isPresent()) {
		return optionalExpense.get();
		} else {
			return null;
		}
	}

	public Expense updateExpense(@Valid Expense expense) {
		
		return expenseRepository.save(expense);
		
	}

	public void deleteExpense(Long id) {
		// TODO Auto-generated method stub
		expenseRepository.deleteById(id);
		
	}
	

}
