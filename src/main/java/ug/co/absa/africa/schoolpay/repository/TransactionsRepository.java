package ug.co.absa.africa.schoolpay.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ug.co.absa.africa.schoolpay.domain.Transactions;

/**
 * Spring Data JPA repository for the Transactions entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TransactionsRepository extends JpaRepository<Transactions, Long> {
    boolean existsByRecordIdAllIgnoreCase(UUID recordId);
}
