package com.expense.Expense.services.income;

import com.expense.Expense.dto.IncomeDTO;
import com.expense.Expense.entity.Income;

import java.util.List;

public interface IncomeService {

    Income postIncome (IncomeDTO incomeDTO);
    List<IncomeDTO> getAllIncomes();
    Income updateIncome(Long id, IncomeDTO incomeDTO);
    IncomeDTO getIncomeById(Long id);
    void deleteIncome(Long id);
}
