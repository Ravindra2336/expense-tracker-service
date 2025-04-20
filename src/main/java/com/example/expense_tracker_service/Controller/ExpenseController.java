package com.example.expense_tracker_service.Controller;

import com.example.expense_tracker_service.Service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/api/")
public class ExpenseController {
    private final ExpenseService expenseService;

    @Autowired
    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @PostMapping("expense/add")
    public String addExpense(@RequestParam("expenseType") String expenseType,@RequestParam("expenseAmount") Integer expenseAmount){
        return expenseService.addExpense(expenseType, expenseAmount);
    }

    @DeleteMapping("expense/{expenseType}")
    public String deleteExpenseByType(@PathVariable("expenseType") String expenseType){
        return expenseService.deleteExpense(expenseType);
    }

    @GetMapping("expense/{expenseType}")
    public String getExpenseAmountByType(@PathVariable("expenseType") String expenseType){
        return expenseService.getExpenseAmountByType(expenseType);
    }

    @GetMapping("expense")
    public HashMap<String, Integer> getAllExpenses(){
        return expenseService.getAllExpenses();
    }
}
