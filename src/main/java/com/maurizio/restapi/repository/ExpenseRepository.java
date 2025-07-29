package com.maurizio.restapi.repository;

import com.maurizio.restapi.entity.ExpenseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

/* *
 * JPA repository for Expense resource
 * @author García M.
 * */

public interface ExpenseRepository extends JpaRepository<ExpenseEntity, Long> {

    /* *
     * It will find the single expense from database
     * @param expenseId
     * @return Optional
     * */

    Optional<ExpenseEntity>findByExpenseId(String expenseId);
}
