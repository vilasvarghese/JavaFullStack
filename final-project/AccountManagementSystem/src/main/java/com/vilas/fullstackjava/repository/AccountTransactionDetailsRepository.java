package com.vilas.fullstackjava.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vilas.fullstackjava.entity.AccountTransactionDetails;

/**
 * Account Transaction Repository to perform the database operations
 * on account_transaction_details table
 *
 * @author  vilas 
 * @version 1.0
 * @since   2018-06-26
 */
@Repository
public interface AccountTransactionDetailsRepository extends JpaRepository<AccountTransactionDetails, Integer> {

	List<AccountTransactionDetails> findByAccountNumberAndUpdatedDateTimeBetween(String accountNumber, Date fromDate,
			Date toDate);

}
