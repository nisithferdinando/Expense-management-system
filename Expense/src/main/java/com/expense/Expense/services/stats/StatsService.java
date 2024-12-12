package com.expense.Expense.services.stats;

import com.expense.Expense.dto.GraphDTO;
import com.expense.Expense.dto.StatsDTO;

public interface StatsService {

    GraphDTO getChartData();
    StatsDTO getStats();
}
