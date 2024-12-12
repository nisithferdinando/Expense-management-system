package com.expense.Expense.services.expense;

import com.expense.Expense.dto.ExpenseDTO;
import com.expense.Expense.entity.Expense;

import java.util.List;

public interface ExpenseService {
     Expense postExpense(ExpenseDTO expenseDTO);

    List<Expense> getAllExpenses();

    Expense getExpenseById(Long id);

    Expense updateExpense(Long id, ExpenseDTO expenseDTO);

    void deleteExpense(Long id);
}
