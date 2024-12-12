package com.expense.Expense.dto;


import com.expense.Expense.entity.Expense;
import com.expense.Expense.entity.Income;
import lombok.Data;

@Data
public class StatsDTO {

    private Double income;
    private Double expense;

    private Income latestIncome;
    private Expense latestExpense;

    private Double balance;

    private double minIncome;
    private double maxIncome;
    private double minExpense;
    private double maxExpense;


}
