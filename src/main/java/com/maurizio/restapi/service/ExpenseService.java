package com.maurizio.restapi.service;

import com.maurizio.restapi.dto.ExpenseDTO;

import java.util.List;

/* *
 * Service interface for Expense module
 * @author Maurizio García
 * */

public interface ExpenseService {

    /* *
     * It will fetch the expenses from database
     * @return list
     * */

    List<ExpenseDTO> getAllExpenses();
}
