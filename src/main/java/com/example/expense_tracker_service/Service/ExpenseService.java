package com.example.expense_tracker_service.Service;

import com.example.expense_tracker_service.Repository.ExpenseRepository;
import com.example.expense_tracker_service.Repository.InmemoryExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class ExpenseService {
    private final ExpenseRepository inmemoryExpenseRepository;

    public ExpenseService(ExpenseRepository inmemoryExpenseRepository) {
        this.inmemoryExpenseRepository = inmemoryExpenseRepository;
    }

    public String addExpense(String expenseType, Integer expenseAmount){
        return inmemoryExpenseRepository.addExpense(expenseType, expenseAmount);
    }

    public String deleteExpense(String expenseType){
        return inmemoryExpenseRepository.deleteExpense(expenseType);
    }

    public String getExpenseAmountByType(String expenseType){
        return inmemoryExpenseRepository.getExpenseAmountByType(expenseType);
    }

    public HashMap<String, Integer> getAllExpenses(){
        return inmemoryExpenseRepository.getAllExpenses();
    }
}
