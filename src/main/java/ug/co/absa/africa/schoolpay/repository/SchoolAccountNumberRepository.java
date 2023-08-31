package ug.co.absa.africa.schoolpay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ug.co.absa.africa.schoolpay.domain.SchoolAccountNumber;

/**
 * Spring Data JPA repository for the SchoolAccountNumber entity.
 */
@SuppressWarnings("unused")
@Repository
public interface SchoolAccountNumberRepository extends JpaRepository<SchoolAccountNumber, Long> {}
