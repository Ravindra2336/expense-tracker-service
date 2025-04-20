package com.example.expense_tracker_service.Repository;

import java.util.HashMap;

public interface ExpenseRepository {
    String addExpense(String expenseType, Integer expenseAmount);
    String deleteExpense(String expenseType);
    String getExpenseAmountByType(String expenseType);
    HashMap<String, Integer> getAllExpenses();
}
