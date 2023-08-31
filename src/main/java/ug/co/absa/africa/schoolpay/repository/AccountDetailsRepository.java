package ug.co.absa.africa.schoolpay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ug.co.absa.africa.schoolpay.domain.AccountDetails;

/**
 * Spring Data JPA repository for the AccountDetails entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AccountDetailsRepository extends JpaRepository<AccountDetails, Long> {}
