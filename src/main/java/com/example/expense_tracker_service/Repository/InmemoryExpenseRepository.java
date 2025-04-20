package com.example.expense_tracker_service.Repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
@Repository
public class InmemoryExpenseRepository implements ExpenseRepository{

    HashMap<String, Integer> expenses = new HashMap<>();

    public String addExpense(String expenseType, Integer expenseAmount){
        if(expenses.containsKey(expenseType)){
            expenses.put(expenseType, expenses.get(expenseType)+expenseAmount);
        } else {
        expenses.put(expenseType, expenseAmount);
        }
        return "Expense added successfully";
    }
    public String deleteExpense(String expenseType){
        if(!expenses.containsKey(expenseType)){
            return "Invalid Expense Type";
        } else {
            expenses.remove(expenseType);
            return "Expense deleted successfully";
        }
    }
    public String getExpenseAmountByType(String expenseType){
        if(!expenses.containsKey(expenseType)){
            return "Invalid Expense Type";
        }
        return "Expense type: " + expenseType + " and Expense amount: "+ expenses.get(expenseType);
    }

    public HashMap<String, Integer> getAllExpenses(){
        return expenses;
    }

}
