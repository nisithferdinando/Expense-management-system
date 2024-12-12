package com.expense.Expense.dto;


import com.expense.Expense.entity.Expense;
import com.expense.Expense.entity.Income;
import lombok.Data;

import java.util.List;

@Data
public class GraphDTO {
    private List<Expense> expenseList;

    private List<Income> incomeList;
}
