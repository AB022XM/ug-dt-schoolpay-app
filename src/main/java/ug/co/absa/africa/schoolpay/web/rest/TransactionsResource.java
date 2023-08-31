package ug.co.absa.africa.schoolpay.web.rest;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import tech.jhipster.web.util.HeaderUtil;
import tech.jhipster.web.util.ResponseUtil;
import ug.co.absa.africa.schoolpay.domain.Transactions;
import ug.co.absa.africa.schoolpay.domain.TransactionsMapper;
import ug.co.absa.africa.schoolpay.domain.dto.TransactionsDto;
import ug.co.absa.africa.schoolpay.domain.response.Response;
import ug.co.absa.africa.schoolpay.repository.TransactionsRepository;
import ug.co.absa.africa.schoolpay.web.rest.errors.BadRequestAlertException;

/**
 * REST controller for managing {@link ug.co.absa.africa.schoolpay.domain.Transactions}.
 */
@RestController
@RequestMapping("/api")
@Transactional
public class TransactionsResource {

    private static final String ENTITY_NAME = "transactions";
    private final Logger log = LoggerFactory.getLogger(TransactionsResource.class);
    private final TransactionsRepository transactionsRepository;

    @Autowired
    TransactionsMapper transactionsMapper;

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    public TransactionsResource(TransactionsRepository transactionsRepository) {
        this.transactionsRepository = transactionsRepository;
    }

    /**
     * {@code POST  /transactions} : Create a new transactions.
     *
     * @param tranDto the transactions to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new transactions, or with status {@code 400 (Bad Request)} if the transactions has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/notify")
    public ResponseEntity<Response> createTransactions(@Valid @RequestBody TransactionsDto tranDto) throws URISyntaxException {
        log.debug("REST request to save Transactions : {}", tranDto.toString());
        if (transactionsRepository.existsByRecordIdAllIgnoreCase(tranDto.getRecordId())) {
            throw new BadRequestAlertException("Duplicate Transaction, record id must be unique", ENTITY_NAME, "idexists");
        }

        Transactions transactions = transactionsRepository.save(transactionsMapper.toEntity(tranDto));

        return ResponseEntity
            .created(new URI("/api/transactions/" + transactions.getRecordId()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, true, ENTITY_NAME, transactions.getRecordId().toString()))
            .body(new Response("200", "Transaction received"));
    }

    /**
     * {@code PUT  /transactions/:id} : Updates an existing transactions.
     *
     * @param id           the id of the transactions to save.
     * @param transactions the transactions to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated transactions,
     * or with status {@code 400 (Bad Request)} if the transactions is not valid,
     * or with status {@code 500 (Internal Server Error)} if the transactions couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/transactions/{id}")
    public ResponseEntity<Transactions> updateTransactions(
        @PathVariable(value = "id", required = false) final Long id,
        @Valid @RequestBody Transactions transactions
    ) throws URISyntaxException {
        log.debug("REST request to update Transactions : {}, {}", id, transactions);
        if (transactions.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, transactions.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!transactionsRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        Transactions result = transactionsRepository.save(transactions);
        return ResponseEntity
            .ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, transactions.getId().toString()))
            .body(result);
    }

    /**
     * {@code PATCH  /transactions/:id} : Partial updates given fields of an existing transactions, field will ignore if it is null
     *
     * @param id           the id of the transactions to save.
     * @param transactions the transactions to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated transactions,
     * or with status {@code 400 (Bad Request)} if the transactions is not valid,
     * or with status {@code 404 (Not Found)} if the transactions is not found,
     * or with status {@code 500 (Internal Server Error)} if the transactions couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PatchMapping(value = "/transactions/{id}", consumes = { "application/json", "application/merge-patch+json" })
    public ResponseEntity<Transactions> partialUpdateTransactions(
        @PathVariable(value = "id", required = false) final Long id,
        @NotNull @RequestBody Transactions transactions
    ) throws URISyntaxException {
        log.debug("REST request to partial update Transactions partially : {}, {}", id, transactions);
        if (transactions.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, transactions.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!transactionsRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        Optional<Transactions> result = transactionsRepository
            .findById(transactions.getId())
            .map(existingTransactions -> {
                if (transactions.getRecordId() != null) {
                    existingTransactions.setRecordId(transactions.getRecordId());
                }
                if (transactions.getServiceLevel() != null) {
                    existingTransactions.setServiceLevel(transactions.getServiceLevel());
                }
                if (transactions.getTimestamp() != null) {
                    existingTransactions.setTimestamp(transactions.getTimestamp());
                }
                if (transactions.getPartnerCode() != null) {
                    existingTransactions.setPartnerCode(transactions.getPartnerCode());
                }
                if (transactions.getPaymentItemCode() != null) {
                    existingTransactions.setPaymentItemCode(transactions.getPaymentItemCode());
                }
                if (transactions.getAmount() != null) {
                    existingTransactions.setAmount(transactions.getAmount());
                }
                if (transactions.getCurrency() != null) {
                    existingTransactions.setCurrency(transactions.getCurrency());
                }
                if (transactions.getReceiverBankCode() != null) {
                    existingTransactions.setReceiverBankCode(transactions.getReceiverBankCode());
                }
                if (transactions.getReceiverAccountNumber() != null) {
                    existingTransactions.setReceiverAccountNumber(transactions.getReceiverAccountNumber());
                }
                if (transactions.getBeneficiaryName() != null) {
                    existingTransactions.setBeneficiaryName(transactions.getBeneficiaryName());
                }
                if (transactions.getInstructionId() != null) {
                    existingTransactions.setInstructionId(transactions.getInstructionId());
                }
                if (transactions.getSenderToReceiverInfo() != null) {
                    existingTransactions.setSenderToReceiverInfo(transactions.getSenderToReceiverInfo());
                }
                if (transactions.getExternalTxnId() != null) {
                    existingTransactions.setExternalTxnId(transactions.getExternalTxnId());
                }
                if (transactions.getCustomerReference() != null) {
                    existingTransactions.setCustomerReference(transactions.getCustomerReference());
                }
                if (transactions.getDebitAccountNumber() != null) {
                    existingTransactions.setDebitAccountNumber(transactions.getDebitAccountNumber());
                }
                if (transactions.getCreditAccountNumber() != null) {
                    existingTransactions.setCreditAccountNumber(transactions.getCreditAccountNumber());
                }
                if (transactions.getDebitAmount() != null) {
                    existingTransactions.setDebitAmount(transactions.getDebitAmount());
                }
                if (transactions.getCreditAmount() != null) {
                    existingTransactions.setCreditAmount(transactions.getCreditAmount());
                }
                if (transactions.getTransactionAmount() != null) {
                    existingTransactions.setTransactionAmount(transactions.getTransactionAmount());
                }
                if (transactions.getDebitDate() != null) {
                    existingTransactions.setDebitDate(transactions.getDebitDate());
                }
                if (transactions.getCreditDate() != null) {
                    existingTransactions.setCreditDate(transactions.getCreditDate());
                }
                if (transactions.getStatus() != null) {
                    existingTransactions.setStatus(transactions.getStatus());
                }
                if (transactions.getSettlementDate() != null) {
                    existingTransactions.setSettlementDate(transactions.getSettlementDate());
                }
                if (transactions.getDebitCurrency() != null) {
                    existingTransactions.setDebitCurrency(transactions.getDebitCurrency());
                }
                if (transactions.getPhoneNumber() != null) {
                    existingTransactions.setPhoneNumber(transactions.getPhoneNumber());
                }
                if (transactions.getEmail() != null) {
                    existingTransactions.setEmail(transactions.getEmail());
                }
                if (transactions.getPayerName() != null) {
                    existingTransactions.setPayerName(transactions.getPayerName());
                }
                if (transactions.getPayerAddress() != null) {
                    existingTransactions.setPayerAddress(transactions.getPayerAddress());
                }
                if (transactions.getPayerEmail() != null) {
                    existingTransactions.setPayerEmail(transactions.getPayerEmail());
                }
                if (transactions.getPayerPhoneNumber() != null) {
                    existingTransactions.setPayerPhoneNumber(transactions.getPayerPhoneNumber());
                }
                if (transactions.getPayerNarration() != null) {
                    existingTransactions.setPayerNarration(transactions.getPayerNarration());
                }
                if (transactions.getPayerBranchId() != null) {
                    existingTransactions.setPayerBranchId(transactions.getPayerBranchId());
                }
                if (transactions.getBeneficiaryAccount() != null) {
                    existingTransactions.setBeneficiaryAccount(transactions.getBeneficiaryAccount());
                }
                if (transactions.getBeneficiaryBranchId() != null) {
                    existingTransactions.setBeneficiaryBranchId(transactions.getBeneficiaryBranchId());
                }
                if (transactions.getBeneficiaryPhoneNumber() != null) {
                    existingTransactions.setBeneficiaryPhoneNumber(transactions.getBeneficiaryPhoneNumber());
                }
                if (transactions.getFcrStatus() != null) {
                    existingTransactions.setFcrStatus(transactions.getFcrStatus());
                }
                if (transactions.getTranStatusFinal() != null) {
                    existingTransactions.setTranStatusFinal(transactions.getTranStatusFinal());
                }
                if (transactions.getNarration1() != null) {
                    existingTransactions.setNarration1(transactions.getNarration1());
                }
                if (transactions.getNarration2() != null) {
                    existingTransactions.setNarration2(transactions.getNarration2());
                }
                if (transactions.getNarration3() != null) {
                    existingTransactions.setNarration3(transactions.getNarration3());
                }
                if (transactions.getTaxAmount() != null) {
                    existingTransactions.setTaxAmount(transactions.getTaxAmount());
                }
                if (transactions.getTaxGLAccount() != null) {
                    existingTransactions.setTaxGLAccount(transactions.getTaxGLAccount());
                }
                if (transactions.getTaxNarration() != null) {
                    existingTransactions.setTaxNarration(transactions.getTaxNarration());
                }
                if (transactions.getInternalErrorCode() != null) {
                    existingTransactions.setInternalErrorCode(transactions.getInternalErrorCode());
                }
                if (transactions.getExternalErrorCode() != null) {
                    existingTransactions.setExternalErrorCode(transactions.getExternalErrorCode());
                }
                if (transactions.getPayeeBranchId() != null) {
                    existingTransactions.setPayeeBranchId(transactions.getPayeeBranchId());
                }
                if (transactions.getPayeeProductInstanceReference() != null) {
                    existingTransactions.setPayeeProductInstanceReference(transactions.getPayeeProductInstanceReference());
                }
                if (transactions.getPayeeProductCode() != null) {
                    existingTransactions.setPayeeProductCode(transactions.getPayeeProductCode());
                }
                if (transactions.getPayeeProductName() != null) {
                    existingTransactions.setPayeeProductName(transactions.getPayeeProductName());
                }
                if (transactions.getPayeeProductDescription() != null) {
                    existingTransactions.setPayeeProductDescription(transactions.getPayeeProductDescription());
                }
                if (transactions.getPayeeProductUnitOfMeasure() != null) {
                    existingTransactions.setPayeeProductUnitOfMeasure(transactions.getPayeeProductUnitOfMeasure());
                }
                if (transactions.getPayeeProductQuantity() != null) {
                    existingTransactions.setPayeeProductQuantity(transactions.getPayeeProductQuantity());
                }
                if (transactions.getSubCategoryCode() != null) {
                    existingTransactions.setSubCategoryCode(transactions.getSubCategoryCode());
                }
                if (transactions.getPayerBankCode() != null) {
                    existingTransactions.setPayerBankCode(transactions.getPayerBankCode());
                }
                if (transactions.getPayerBankName() != null) {
                    existingTransactions.setPayerBankName(transactions.getPayerBankName());
                }
                if (transactions.getPayerBankAddress() != null) {
                    existingTransactions.setPayerBankAddress(transactions.getPayerBankAddress());
                }
                if (transactions.getPayerBankCity() != null) {
                    existingTransactions.setPayerBankCity(transactions.getPayerBankCity());
                }
                if (transactions.getPayerBankState() != null) {
                    existingTransactions.setPayerBankState(transactions.getPayerBankState());
                }
                if (transactions.getPayerBankCountry() != null) {
                    existingTransactions.setPayerBankCountry(transactions.getPayerBankCountry());
                }
                if (transactions.getPayerBankPostalCode() != null) {
                    existingTransactions.setPayerBankPostalCode(transactions.getPayerBankPostalCode());
                }
                if (transactions.getCheckerId() != null) {
                    existingTransactions.setCheckerId(transactions.getCheckerId());
                }
                if (transactions.getRemittanceInformation() != null) {
                    existingTransactions.setRemittanceInformation(transactions.getRemittanceInformation());
                }
                if (transactions.getPaymentChannelCode() != null) {
                    existingTransactions.setPaymentChannelCode(transactions.getPaymentChannelCode());
                }
                if (transactions.getFeeAmount() != null) {
                    existingTransactions.setFeeAmount(transactions.getFeeAmount());
                }
                if (transactions.getFeeGLAccount() != null) {
                    existingTransactions.setFeeGLAccount(transactions.getFeeGLAccount());
                }
                if (transactions.getFeeNarration() != null) {
                    existingTransactions.setFeeNarration(transactions.getFeeNarration());
                }
                if (transactions.getTranFreeField1() != null) {
                    existingTransactions.setTranFreeField1(transactions.getTranFreeField1());
                }
                if (transactions.getTranFreeField2() != null) {
                    existingTransactions.setTranFreeField2(transactions.getTranFreeField2());
                }
                if (transactions.getTranFreeField3() != null) {
                    existingTransactions.setTranFreeField3(transactions.getTranFreeField3());
                }
                if (transactions.getTranFreeField4() != null) {
                    existingTransactions.setTranFreeField4(transactions.getTranFreeField4());
                }
                if (transactions.getTranFreeField5() != null) {
                    existingTransactions.setTranFreeField5(transactions.getTranFreeField5());
                }
                if (transactions.getTranFreeField6() != null) {
                    existingTransactions.setTranFreeField6(transactions.getTranFreeField6());
                }
                if (transactions.getTranFreeField7() != null) {
                    existingTransactions.setTranFreeField7(transactions.getTranFreeField7());
                }
                if (transactions.getResponseCode() != null) {
                    existingTransactions.setResponseCode(transactions.getResponseCode());
                }
                if (transactions.getResponseMessage() != null) {
                    existingTransactions.setResponseMessage(transactions.getResponseMessage());
                }
                if (transactions.getResponseDetails1() != null) {
                    existingTransactions.setResponseDetails1(transactions.getResponseDetails1());
                }
                if (transactions.getResponseDetails2() != null) {
                    existingTransactions.setResponseDetails2(transactions.getResponseDetails2());
                }
                if (transactions.getResponseDetails3() != null) {
                    existingTransactions.setResponseDetails3(transactions.getResponseDetails3());
                }
                if (transactions.getResponseDetails4() != null) {
                    existingTransactions.setResponseDetails4(transactions.getResponseDetails4());
                }
                if (transactions.getRequestMessage() != null) {
                    existingTransactions.setRequestMessage(transactions.getRequestMessage());
                }
                if (transactions.getRequestDetails1() != null) {
                    existingTransactions.setRequestDetails1(transactions.getRequestDetails1());
                }
                if (transactions.getRequestDetails2() != null) {
                    existingTransactions.setRequestDetails2(transactions.getRequestDetails2());
                }
                if (transactions.getRequestDetails3() != null) {
                    existingTransactions.setRequestDetails3(transactions.getRequestDetails3());
                }
                if (transactions.getRequestDetails4() != null) {
                    existingTransactions.setRequestDetails4(transactions.getRequestDetails4());
                }
                if (transactions.getTransferId() != null) {
                    existingTransactions.setTransferId(transactions.getTransferId());
                }
                if (transactions.getTransferReferenceId() != null) {
                    existingTransactions.setTransferReferenceId(transactions.getTransferReferenceId());
                }
                if (transactions.getTransferStatus() != null) {
                    existingTransactions.setTransferStatus(transactions.getTransferStatus());
                }
                if (transactions.getResponseDateTime() != null) {
                    existingTransactions.setResponseDateTime(transactions.getResponseDateTime());
                }

                return existingTransactions;
            })
            .map(transactionsRepository::save);

        return ResponseUtil.wrapOrNotFound(
            result,
            HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, transactions.getId().toString())
        );
    }

    /**
     * {@code GET  /transactions} : get all the transactions.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of transactions in body.
     */
    @GetMapping("/transactions")
    public List<Transactions> getAllTransactions() {
        log.debug("REST request to get all Transactions");
        return transactionsRepository.findAll();
    }

    /**
     * {@code GET  /transactions/:id} : get the "id" transactions.
     *
     * @param id the id of the transactions to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the transactions, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/transactions/{id}")
    public ResponseEntity<Transactions> getTransactions(@PathVariable Long id) {
        log.debug("REST request to get Transactions : {}", id);
        Optional<Transactions> transactions = transactionsRepository.findById(id);
        return ResponseUtil.wrapOrNotFound(transactions);
    }

    /**
     * {@code DELETE  /transactions/:id} : delete the "id" transactions.
     *
     * @param id the id of the transactions to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/transactions/{id}")
    public ResponseEntity<Void> deleteTransactions(@PathVariable Long id) {
        log.debug("REST request to delete Transactions : {}", id);
        transactionsRepository.deleteById(id);
        return ResponseEntity
            .noContent()
            .headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id.toString()))
            .build();
    }
}
