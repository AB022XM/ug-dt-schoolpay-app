package ug.co.absa.africa.schoolpay.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.UUID;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * A Transactions.
 */
@Entity
@Table(name = "transactions")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
@EntityListeners({ AbstractAuditingEntity.class, AuditingEntityListener.class })
public class Transactions implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "record_id", length = 36, unique = true)
    private UUID recordId;

    @NotNull
    @Column(name = "service_level", nullable = false)
    private String serviceLevel;

    @NotNull
    @Column(name = "timestamp", nullable = false)
    private ZonedDateTime timestamp;

    @NotNull
    @Column(name = "partner_code", nullable = false)
    private String partnerCode;

    @NotNull
    @Column(name = "payment_item_code", nullable = false)
    private String paymentItemCode;

    @NotNull
    @Column(name = "amount", nullable = false)
    private String amount;

    @NotNull
    @Column(name = "currency", nullable = false)
    private String currency;

    @NotNull
    @Column(name = "receiver_bank_code", nullable = false)
    private String receiverBankCode;

    @NotNull
    @Column(name = "receiver_account_number", nullable = false)
    private String receiverAccountNumber;

    @Column(name = "beneficiary_name")
    private String beneficiaryName;

    @NotNull
    @Column(name = "instruction_id", nullable = false)
    private String instructionId;

    @NotNull
    @Column(name = "sender_to_receiver_info", nullable = false)
    private String senderToReceiverInfo;

    @Column(name = "external_txn_id", unique = true)
    private String externalTxnId;

    @Column(name = "customer_reference", unique = true)
    private String customerReference;

    @NotNull
    @Column(name = "debit_account_number", nullable = false)
    private String debitAccountNumber;

    @NotNull
    @Column(name = "credit_account_number", nullable = false)
    private String creditAccountNumber;

    @NotNull
    @Column(name = "debit_amount", nullable = false)
    private Integer debitAmount;

    @Column(name = "credit_amount")
    private Integer creditAmount;

    @Column(name = "transaction_amount")
    private Integer transactionAmount;

    @Column(name = "debit_date")
    private ZonedDateTime debitDate;

    @Column(name = "credit_date")
    private ZonedDateTime creditDate;

    @Column(name = "status")
    private String status;

    @Column(name = "settlement_date")
    private ZonedDateTime settlementDate;

    @NotNull
    @Column(name = "debit_currency", nullable = false)
    private String debitCurrency;

    @NotNull
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @NotNull
    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "payer_name")
    private String payerName;

    @Column(name = "payer_address")
    private String payerAddress;

    @Column(name = "payer_email")
    private String payerEmail;

    @Column(name = "payer_phone_number")
    private String payerPhoneNumber;

    @Column(name = "payer_narration")
    private String payerNarration;

    @Column(name = "payer_branch_id")
    private String payerBranchId;

    @Column(name = "beneficiary_account")
    private String beneficiaryAccount;

    @Column(name = "beneficiary_branch_id")
    private String beneficiaryBranchId;

    @Column(name = "beneficiary_phone_number")
    private String beneficiaryPhoneNumber;

    @Column(name = "fcr_status")
    private String fcrStatus;

    @Column(name = "tran_status_final")
    private String tranStatusFinal;

    @Column(name = "narration_1")
    private String narration1;

    @Column(name = "narration_2")
    private String narration2;

    @Column(name = "narration_3")
    private String narration3;

    @Column(name = "tax_amount")
    private Integer taxAmount;

    @Column(name = "tax_gl_account")
    private String taxGLAccount;

    @Column(name = "tax_narration")
    private String taxNarration;

    @Column(name = "internal_error_code")
    private String internalErrorCode;

    @Column(name = "external_error_code")
    private String externalErrorCode;

    @Column(name = "payee_branch_id")
    private String payeeBranchId;

    @Column(name = "payee_product_instance_reference")
    private String payeeProductInstanceReference;

    @Column(name = "payee_product_code")
    private String payeeProductCode;

    @Column(name = "payee_product_name")
    private String payeeProductName;

    @Column(name = "payee_product_description")
    private String payeeProductDescription;

    @Column(name = "payee_product_unit_of_measure")
    private String payeeProductUnitOfMeasure;

    @Column(name = "payee_product_quantity")
    private String payeeProductQuantity;

    @Column(name = "sub_category_code")
    private String subCategoryCode;

    @Column(name = "payer_bank_code")
    private String payerBankCode;

    @Column(name = "payer_bank_name")
    private String payerBankName;

    @Column(name = "payer_bank_address")
    private String payerBankAddress;

    @Column(name = "payer_bank_city")
    private String payerBankCity;

    @Column(name = "payer_bank_state")
    private String payerBankState;

    @Column(name = "payer_bank_country")
    private String payerBankCountry;

    @Column(name = "payer_bank_postal_code")
    private String payerBankPostalCode;

    @Column(name = "checker_id")
    private String checkerId;

    @Column(name = "remittance_information")
    private String remittanceInformation;

    @Column(name = "payment_channel_code")
    private String paymentChannelCode;

    @Column(name = "fee_amount")
    private Integer feeAmount;

    @Column(name = "fee_gl_account")
    private String feeGLAccount;

    @Column(name = "fee_narration")
    private String feeNarration;

    @Column(name = "tran_free_field_1")
    private String tranFreeField1;

    @Column(name = "tran_free_field_2")
    private String tranFreeField2;

    @Column(name = "tran_free_field_3")
    private String tranFreeField3;

    @Column(name = "tran_free_field_4")
    private String tranFreeField4;

    @Column(name = "tran_free_field_5")
    private String tranFreeField5;

    @Column(name = "tran_free_field_6")
    private String tranFreeField6;

    @Column(name = "tran_free_field_7")
    private String tranFreeField7;

    @Column(name = "response_code")
    private String responseCode;

    @Column(name = "response_message")
    private String responseMessage;

    @Lob
    @Column(name = "response_details_1")
    private String responseDetails1;

    @Lob
    @Column(name = "response_details_2")
    private String responseDetails2;

    @Lob
    @Column(name = "response_details_3")
    private String responseDetails3;

    @Lob
    @Column(name = "response_details_4")
    private String responseDetails4;

    @Column(name = "request_message")
    private String requestMessage;

    @Lob
    @Column(name = "request_details_1")
    private String requestDetails1;

    @Lob
    @Column(name = "request_details_2")
    private String requestDetails2;

    @Lob
    @Column(name = "request_details_3")
    private String requestDetails3;

    @Lob
    @Column(name = "request_details_4")
    private String requestDetails4;

    @Column(name = "transfer_id")
    private String transferId;

    @Column(name = "transfer_reference_id")
    private String transferReferenceId;

    @Column(name = "transfer_status")
    private String transferStatus;

    @Column(name = "response_date_time")
    private ZonedDateTime responseDateTime;

    @CreatedBy
    @Column(name = "created_by")
    private String createdBy;

    @CreatedDate
    @Column(name = "created_date")
    private Instant createdDate;

    @LastModifiedBy
    @Column(name = "last_modified_by")
    private String lastModifiedBy;

    @LastModifiedDate
    @Column(name = "last_modified_date")
    private Instant lastModifiedDate;

    public Instant getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Instant lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Transactions id(Long id) {
        this.setId(id);
        return this;
    }

    public UUID getRecordId() {
        return this.recordId;
    }

    public void setRecordId(UUID recordId) {
        this.recordId = recordId;
    }

    public Transactions recordId(UUID recordId) {
        this.setRecordId(recordId);
        return this;
    }

    public String getServiceLevel() {
        return this.serviceLevel;
    }

    public void setServiceLevel(String serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    public Transactions serviceLevel(String serviceLevel) {
        this.setServiceLevel(serviceLevel);
        return this;
    }

    public ZonedDateTime getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(ZonedDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Transactions timestamp(ZonedDateTime timestamp) {
        this.setTimestamp(timestamp);
        return this;
    }

    public String getPartnerCode() {
        return this.partnerCode;
    }

    public void setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
    }

    public Transactions partnerCode(String partnerCode) {
        this.setPartnerCode(partnerCode);
        return this;
    }

    public String getPaymentItemCode() {
        return this.paymentItemCode;
    }

    public void setPaymentItemCode(String paymentItemCode) {
        this.paymentItemCode = paymentItemCode;
    }

    public Transactions paymentItemCode(String paymentItemCode) {
        this.setPaymentItemCode(paymentItemCode);
        return this;
    }

    public String getAmount() {
        return this.amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Transactions amount(String amount) {
        this.setAmount(amount);
        return this;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Transactions currency(String currency) {
        this.setCurrency(currency);
        return this;
    }

    public String getReceiverBankCode() {
        return this.receiverBankCode;
    }

    public void setReceiverBankCode(String receiverBankCode) {
        this.receiverBankCode = receiverBankCode;
    }

    public Transactions receiverBankCode(String receiverBankCode) {
        this.setReceiverBankCode(receiverBankCode);
        return this;
    }

    public String getReceiverAccountNumber() {
        return this.receiverAccountNumber;
    }

    public void setReceiverAccountNumber(String receiverAccountNumber) {
        this.receiverAccountNumber = receiverAccountNumber;
    }

    public Transactions receiverAccountNumber(String receiverAccountNumber) {
        this.setReceiverAccountNumber(receiverAccountNumber);
        return this;
    }

    public String getBeneficiaryName() {
        return this.beneficiaryName;
    }

    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
    }

    public Transactions beneficiaryName(String beneficiaryName) {
        this.setBeneficiaryName(beneficiaryName);
        return this;
    }

    public String getInstructionId() {
        return this.instructionId;
    }

    public void setInstructionId(String instructionId) {
        this.instructionId = instructionId;
    }

    public Transactions instructionId(String instructionId) {
        this.setInstructionId(instructionId);
        return this;
    }

    public String getSenderToReceiverInfo() {
        return this.senderToReceiverInfo;
    }

    public void setSenderToReceiverInfo(String senderToReceiverInfo) {
        this.senderToReceiverInfo = senderToReceiverInfo;
    }

    public Transactions senderToReceiverInfo(String senderToReceiverInfo) {
        this.setSenderToReceiverInfo(senderToReceiverInfo);
        return this;
    }

    public String getExternalTxnId() {
        return this.externalTxnId;
    }

    public void setExternalTxnId(String externalTxnId) {
        this.externalTxnId = externalTxnId;
    }

    public Transactions externalTxnId(String externalTxnId) {
        this.setExternalTxnId(externalTxnId);
        return this;
    }

    public String getCustomerReference() {
        return this.customerReference;
    }

    public void setCustomerReference(String customerReference) {
        this.customerReference = customerReference;
    }

    public Transactions customerReference(String customerReference) {
        this.setCustomerReference(customerReference);
        return this;
    }

    public String getDebitAccountNumber() {
        return this.debitAccountNumber;
    }

    public void setDebitAccountNumber(String debitAccountNumber) {
        this.debitAccountNumber = debitAccountNumber;
    }

    public Transactions debitAccountNumber(String debitAccountNumber) {
        this.setDebitAccountNumber(debitAccountNumber);
        return this;
    }

    public String getCreditAccountNumber() {
        return this.creditAccountNumber;
    }

    public void setCreditAccountNumber(String creditAccountNumber) {
        this.creditAccountNumber = creditAccountNumber;
    }

    public Transactions creditAccountNumber(String creditAccountNumber) {
        this.setCreditAccountNumber(creditAccountNumber);
        return this;
    }

    public Integer getDebitAmount() {
        return this.debitAmount;
    }

    public void setDebitAmount(Integer debitAmount) {
        this.debitAmount = debitAmount;
    }

    public Transactions debitAmount(Integer debitAmount) {
        this.setDebitAmount(debitAmount);
        return this;
    }

    public Integer getCreditAmount() {
        return this.creditAmount;
    }

    public void setCreditAmount(Integer creditAmount) {
        this.creditAmount = creditAmount;
    }

    public Transactions creditAmount(Integer creditAmount) {
        this.setCreditAmount(creditAmount);
        return this;
    }

    public Integer getTransactionAmount() {
        return this.transactionAmount;
    }

    public void setTransactionAmount(Integer transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public Transactions transactionAmount(Integer transactionAmount) {
        this.setTransactionAmount(transactionAmount);
        return this;
    }

    public ZonedDateTime getDebitDate() {
        return this.debitDate;
    }

    public void setDebitDate(ZonedDateTime debitDate) {
        this.debitDate = debitDate;
    }

    public Transactions debitDate(ZonedDateTime debitDate) {
        this.setDebitDate(debitDate);
        return this;
    }

    public ZonedDateTime getCreditDate() {
        return this.creditDate;
    }

    public void setCreditDate(ZonedDateTime creditDate) {
        this.creditDate = creditDate;
    }

    public Transactions creditDate(ZonedDateTime creditDate) {
        this.setCreditDate(creditDate);
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Transactions status(String status) {
        this.setStatus(status);
        return this;
    }

    public ZonedDateTime getSettlementDate() {
        return this.settlementDate;
    }

    public void setSettlementDate(ZonedDateTime settlementDate) {
        this.settlementDate = settlementDate;
    }

    public Transactions settlementDate(ZonedDateTime settlementDate) {
        this.setSettlementDate(settlementDate);
        return this;
    }

    public String getDebitCurrency() {
        return this.debitCurrency;
    }

    public void setDebitCurrency(String debitCurrency) {
        this.debitCurrency = debitCurrency;
    }

    public Transactions debitCurrency(String debitCurrency) {
        this.setDebitCurrency(debitCurrency);
        return this;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Transactions phoneNumber(String phoneNumber) {
        this.setPhoneNumber(phoneNumber);
        return this;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Transactions email(String email) {
        this.setEmail(email);
        return this;
    }

    public String getPayerName() {
        return this.payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    public Transactions payerName(String payerName) {
        this.setPayerName(payerName);
        return this;
    }

    public String getPayerAddress() {
        return this.payerAddress;
    }

    public void setPayerAddress(String payerAddress) {
        this.payerAddress = payerAddress;
    }

    public Transactions payerAddress(String payerAddress) {
        this.setPayerAddress(payerAddress);
        return this;
    }

    public String getPayerEmail() {
        return this.payerEmail;
    }

    public void setPayerEmail(String payerEmail) {
        this.payerEmail = payerEmail;
    }

    public Transactions payerEmail(String payerEmail) {
        this.setPayerEmail(payerEmail);
        return this;
    }

    public String getPayerPhoneNumber() {
        return this.payerPhoneNumber;
    }

    public void setPayerPhoneNumber(String payerPhoneNumber) {
        this.payerPhoneNumber = payerPhoneNumber;
    }

    public Transactions payerPhoneNumber(String payerPhoneNumber) {
        this.setPayerPhoneNumber(payerPhoneNumber);
        return this;
    }

    public String getPayerNarration() {
        return this.payerNarration;
    }

    public void setPayerNarration(String payerNarration) {
        this.payerNarration = payerNarration;
    }

    public Transactions payerNarration(String payerNarration) {
        this.setPayerNarration(payerNarration);
        return this;
    }

    public String getPayerBranchId() {
        return this.payerBranchId;
    }

    public void setPayerBranchId(String payerBranchId) {
        this.payerBranchId = payerBranchId;
    }

    public Transactions payerBranchId(String payerBranchId) {
        this.setPayerBranchId(payerBranchId);
        return this;
    }

    public String getBeneficiaryAccount() {
        return this.beneficiaryAccount;
    }

    public void setBeneficiaryAccount(String beneficiaryAccount) {
        this.beneficiaryAccount = beneficiaryAccount;
    }

    public Transactions beneficiaryAccount(String beneficiaryAccount) {
        this.setBeneficiaryAccount(beneficiaryAccount);
        return this;
    }

    public String getBeneficiaryBranchId() {
        return this.beneficiaryBranchId;
    }

    public void setBeneficiaryBranchId(String beneficiaryBranchId) {
        this.beneficiaryBranchId = beneficiaryBranchId;
    }

    public Transactions beneficiaryBranchId(String beneficiaryBranchId) {
        this.setBeneficiaryBranchId(beneficiaryBranchId);
        return this;
    }

    public String getBeneficiaryPhoneNumber() {
        return this.beneficiaryPhoneNumber;
    }

    public void setBeneficiaryPhoneNumber(String beneficiaryPhoneNumber) {
        this.beneficiaryPhoneNumber = beneficiaryPhoneNumber;
    }

    public Transactions beneficiaryPhoneNumber(String beneficiaryPhoneNumber) {
        this.setBeneficiaryPhoneNumber(beneficiaryPhoneNumber);
        return this;
    }

    public String getFcrStatus() {
        return this.fcrStatus;
    }

    public void setFcrStatus(String fcrStatus) {
        this.fcrStatus = fcrStatus;
    }

    public Transactions fcrStatus(String fcrStatus) {
        this.setFcrStatus(fcrStatus);
        return this;
    }

    public String getTranStatusFinal() {
        return this.tranStatusFinal;
    }

    public void setTranStatusFinal(String tranStatusFinal) {
        this.tranStatusFinal = tranStatusFinal;
    }

    public Transactions tranStatusFinal(String tranStatusFinal) {
        this.setTranStatusFinal(tranStatusFinal);
        return this;
    }

    public String getNarration1() {
        return this.narration1;
    }

    public void setNarration1(String narration1) {
        this.narration1 = narration1;
    }

    public Transactions narration1(String narration1) {
        this.setNarration1(narration1);
        return this;
    }

    public String getNarration2() {
        return this.narration2;
    }

    public void setNarration2(String narration2) {
        this.narration2 = narration2;
    }

    public Transactions narration2(String narration2) {
        this.setNarration2(narration2);
        return this;
    }

    public String getNarration3() {
        return this.narration3;
    }

    public void setNarration3(String narration3) {
        this.narration3 = narration3;
    }

    public Transactions narration3(String narration3) {
        this.setNarration3(narration3);
        return this;
    }

    public Integer getTaxAmount() {
        return this.taxAmount;
    }

    public void setTaxAmount(Integer taxAmount) {
        this.taxAmount = taxAmount;
    }

    public Transactions taxAmount(Integer taxAmount) {
        this.setTaxAmount(taxAmount);
        return this;
    }

    public String getTaxGLAccount() {
        return this.taxGLAccount;
    }

    public void setTaxGLAccount(String taxGLAccount) {
        this.taxGLAccount = taxGLAccount;
    }

    public Transactions taxGLAccount(String taxGLAccount) {
        this.setTaxGLAccount(taxGLAccount);
        return this;
    }

    public String getTaxNarration() {
        return this.taxNarration;
    }

    public void setTaxNarration(String taxNarration) {
        this.taxNarration = taxNarration;
    }

    public Transactions taxNarration(String taxNarration) {
        this.setTaxNarration(taxNarration);
        return this;
    }

    public String getInternalErrorCode() {
        return this.internalErrorCode;
    }

    public void setInternalErrorCode(String internalErrorCode) {
        this.internalErrorCode = internalErrorCode;
    }

    public Transactions internalErrorCode(String internalErrorCode) {
        this.setInternalErrorCode(internalErrorCode);
        return this;
    }

    public String getExternalErrorCode() {
        return this.externalErrorCode;
    }

    public void setExternalErrorCode(String externalErrorCode) {
        this.externalErrorCode = externalErrorCode;
    }

    public Transactions externalErrorCode(String externalErrorCode) {
        this.setExternalErrorCode(externalErrorCode);
        return this;
    }

    public String getPayeeBranchId() {
        return this.payeeBranchId;
    }

    public void setPayeeBranchId(String payeeBranchId) {
        this.payeeBranchId = payeeBranchId;
    }

    public Transactions payeeBranchId(String payeeBranchId) {
        this.setPayeeBranchId(payeeBranchId);
        return this;
    }

    public String getPayeeProductInstanceReference() {
        return this.payeeProductInstanceReference;
    }

    public void setPayeeProductInstanceReference(String payeeProductInstanceReference) {
        this.payeeProductInstanceReference = payeeProductInstanceReference;
    }

    public Transactions payeeProductInstanceReference(String payeeProductInstanceReference) {
        this.setPayeeProductInstanceReference(payeeProductInstanceReference);
        return this;
    }

    public String getPayeeProductCode() {
        return this.payeeProductCode;
    }

    public void setPayeeProductCode(String payeeProductCode) {
        this.payeeProductCode = payeeProductCode;
    }

    public Transactions payeeProductCode(String payeeProductCode) {
        this.setPayeeProductCode(payeeProductCode);
        return this;
    }

    public String getPayeeProductName() {
        return this.payeeProductName;
    }

    public void setPayeeProductName(String payeeProductName) {
        this.payeeProductName = payeeProductName;
    }

    public Transactions payeeProductName(String payeeProductName) {
        this.setPayeeProductName(payeeProductName);
        return this;
    }

    public String getPayeeProductDescription() {
        return this.payeeProductDescription;
    }

    public void setPayeeProductDescription(String payeeProductDescription) {
        this.payeeProductDescription = payeeProductDescription;
    }

    public Transactions payeeProductDescription(String payeeProductDescription) {
        this.setPayeeProductDescription(payeeProductDescription);
        return this;
    }

    public String getPayeeProductUnitOfMeasure() {
        return this.payeeProductUnitOfMeasure;
    }

    public void setPayeeProductUnitOfMeasure(String payeeProductUnitOfMeasure) {
        this.payeeProductUnitOfMeasure = payeeProductUnitOfMeasure;
    }

    public Transactions payeeProductUnitOfMeasure(String payeeProductUnitOfMeasure) {
        this.setPayeeProductUnitOfMeasure(payeeProductUnitOfMeasure);
        return this;
    }

    public String getPayeeProductQuantity() {
        return this.payeeProductQuantity;
    }

    public void setPayeeProductQuantity(String payeeProductQuantity) {
        this.payeeProductQuantity = payeeProductQuantity;
    }

    public Transactions payeeProductQuantity(String payeeProductQuantity) {
        this.setPayeeProductQuantity(payeeProductQuantity);
        return this;
    }

    public String getSubCategoryCode() {
        return this.subCategoryCode;
    }

    public void setSubCategoryCode(String subCategoryCode) {
        this.subCategoryCode = subCategoryCode;
    }

    public Transactions subCategoryCode(String subCategoryCode) {
        this.setSubCategoryCode(subCategoryCode);
        return this;
    }

    public String getPayerBankCode() {
        return this.payerBankCode;
    }

    public void setPayerBankCode(String payerBankCode) {
        this.payerBankCode = payerBankCode;
    }

    public Transactions payerBankCode(String payerBankCode) {
        this.setPayerBankCode(payerBankCode);
        return this;
    }

    public String getPayerBankName() {
        return this.payerBankName;
    }

    public void setPayerBankName(String payerBankName) {
        this.payerBankName = payerBankName;
    }

    public Transactions payerBankName(String payerBankName) {
        this.setPayerBankName(payerBankName);
        return this;
    }

    public String getPayerBankAddress() {
        return this.payerBankAddress;
    }

    public void setPayerBankAddress(String payerBankAddress) {
        this.payerBankAddress = payerBankAddress;
    }

    public Transactions payerBankAddress(String payerBankAddress) {
        this.setPayerBankAddress(payerBankAddress);
        return this;
    }

    public String getPayerBankCity() {
        return this.payerBankCity;
    }

    public void setPayerBankCity(String payerBankCity) {
        this.payerBankCity = payerBankCity;
    }

    public Transactions payerBankCity(String payerBankCity) {
        this.setPayerBankCity(payerBankCity);
        return this;
    }

    public String getPayerBankState() {
        return this.payerBankState;
    }

    public void setPayerBankState(String payerBankState) {
        this.payerBankState = payerBankState;
    }

    public Transactions payerBankState(String payerBankState) {
        this.setPayerBankState(payerBankState);
        return this;
    }

    public String getPayerBankCountry() {
        return this.payerBankCountry;
    }

    public void setPayerBankCountry(String payerBankCountry) {
        this.payerBankCountry = payerBankCountry;
    }

    public Transactions payerBankCountry(String payerBankCountry) {
        this.setPayerBankCountry(payerBankCountry);
        return this;
    }

    public String getPayerBankPostalCode() {
        return this.payerBankPostalCode;
    }

    public void setPayerBankPostalCode(String payerBankPostalCode) {
        this.payerBankPostalCode = payerBankPostalCode;
    }

    public Transactions payerBankPostalCode(String payerBankPostalCode) {
        this.setPayerBankPostalCode(payerBankPostalCode);
        return this;
    }

    public String getCheckerId() {
        return this.checkerId;
    }

    public void setCheckerId(String checkerId) {
        this.checkerId = checkerId;
    }

    public Transactions checkerId(String checkerId) {
        this.setCheckerId(checkerId);
        return this;
    }

    public String getRemittanceInformation() {
        return this.remittanceInformation;
    }

    public void setRemittanceInformation(String remittanceInformation) {
        this.remittanceInformation = remittanceInformation;
    }

    public Transactions remittanceInformation(String remittanceInformation) {
        this.setRemittanceInformation(remittanceInformation);
        return this;
    }

    public String getPaymentChannelCode() {
        return this.paymentChannelCode;
    }

    public void setPaymentChannelCode(String paymentChannelCode) {
        this.paymentChannelCode = paymentChannelCode;
    }

    public Transactions paymentChannelCode(String paymentChannelCode) {
        this.setPaymentChannelCode(paymentChannelCode);
        return this;
    }

    public Integer getFeeAmount() {
        return this.feeAmount;
    }

    public void setFeeAmount(Integer feeAmount) {
        this.feeAmount = feeAmount;
    }

    public Transactions feeAmount(Integer feeAmount) {
        this.setFeeAmount(feeAmount);
        return this;
    }

    public String getFeeGLAccount() {
        return this.feeGLAccount;
    }

    public void setFeeGLAccount(String feeGLAccount) {
        this.feeGLAccount = feeGLAccount;
    }

    public Transactions feeGLAccount(String feeGLAccount) {
        this.setFeeGLAccount(feeGLAccount);
        return this;
    }

    public String getFeeNarration() {
        return this.feeNarration;
    }

    public void setFeeNarration(String feeNarration) {
        this.feeNarration = feeNarration;
    }

    public Transactions feeNarration(String feeNarration) {
        this.setFeeNarration(feeNarration);
        return this;
    }

    public String getTranFreeField1() {
        return this.tranFreeField1;
    }

    public void setTranFreeField1(String tranFreeField1) {
        this.tranFreeField1 = tranFreeField1;
    }

    public Transactions tranFreeField1(String tranFreeField1) {
        this.setTranFreeField1(tranFreeField1);
        return this;
    }

    public String getTranFreeField2() {
        return this.tranFreeField2;
    }

    public void setTranFreeField2(String tranFreeField2) {
        this.tranFreeField2 = tranFreeField2;
    }

    public Transactions tranFreeField2(String tranFreeField2) {
        this.setTranFreeField2(tranFreeField2);
        return this;
    }

    public String getTranFreeField3() {
        return this.tranFreeField3;
    }

    public void setTranFreeField3(String tranFreeField3) {
        this.tranFreeField3 = tranFreeField3;
    }

    public Transactions tranFreeField3(String tranFreeField3) {
        this.setTranFreeField3(tranFreeField3);
        return this;
    }

    public String getTranFreeField4() {
        return this.tranFreeField4;
    }

    public void setTranFreeField4(String tranFreeField4) {
        this.tranFreeField4 = tranFreeField4;
    }

    public Transactions tranFreeField4(String tranFreeField4) {
        this.setTranFreeField4(tranFreeField4);
        return this;
    }

    public String getTranFreeField5() {
        return this.tranFreeField5;
    }

    public void setTranFreeField5(String tranFreeField5) {
        this.tranFreeField5 = tranFreeField5;
    }

    public Transactions tranFreeField5(String tranFreeField5) {
        this.setTranFreeField5(tranFreeField5);
        return this;
    }

    public String getTranFreeField6() {
        return this.tranFreeField6;
    }

    public void setTranFreeField6(String tranFreeField6) {
        this.tranFreeField6 = tranFreeField6;
    }

    public Transactions tranFreeField6(String tranFreeField6) {
        this.setTranFreeField6(tranFreeField6);
        return this;
    }

    public String getTranFreeField7() {
        return this.tranFreeField7;
    }

    public void setTranFreeField7(String tranFreeField7) {
        this.tranFreeField7 = tranFreeField7;
    }

    public Transactions tranFreeField7(String tranFreeField7) {
        this.setTranFreeField7(tranFreeField7);
        return this;
    }

    public String getResponseCode() {
        return this.responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public Transactions responseCode(String responseCode) {
        this.setResponseCode(responseCode);
        return this;
    }

    public String getResponseMessage() {
        return this.responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public Transactions responseMessage(String responseMessage) {
        this.setResponseMessage(responseMessage);
        return this;
    }

    public String getResponseDetails1() {
        return this.responseDetails1;
    }

    public void setResponseDetails1(String responseDetails1) {
        this.responseDetails1 = responseDetails1;
    }

    public Transactions responseDetails1(String responseDetails1) {
        this.setResponseDetails1(responseDetails1);
        return this;
    }

    public String getResponseDetails2() {
        return this.responseDetails2;
    }

    public void setResponseDetails2(String responseDetails2) {
        this.responseDetails2 = responseDetails2;
    }

    public Transactions responseDetails2(String responseDetails2) {
        this.setResponseDetails2(responseDetails2);
        return this;
    }

    public String getResponseDetails3() {
        return this.responseDetails3;
    }

    public void setResponseDetails3(String responseDetails3) {
        this.responseDetails3 = responseDetails3;
    }

    public Transactions responseDetails3(String responseDetails3) {
        this.setResponseDetails3(responseDetails3);
        return this;
    }

    public String getResponseDetails4() {
        return this.responseDetails4;
    }

    public void setResponseDetails4(String responseDetails4) {
        this.responseDetails4 = responseDetails4;
    }

    public Transactions responseDetails4(String responseDetails4) {
        this.setResponseDetails4(responseDetails4);
        return this;
    }

    public String getRequestMessage() {
        return this.requestMessage;
    }

    public void setRequestMessage(String requestMessage) {
        this.requestMessage = requestMessage;
    }

    public Transactions requestMessage(String requestMessage) {
        this.setRequestMessage(requestMessage);
        return this;
    }

    public String getRequestDetails1() {
        return this.requestDetails1;
    }

    public void setRequestDetails1(String requestDetails1) {
        this.requestDetails1 = requestDetails1;
    }

    public Transactions requestDetails1(String requestDetails1) {
        this.setRequestDetails1(requestDetails1);
        return this;
    }

    public String getRequestDetails2() {
        return this.requestDetails2;
    }

    public void setRequestDetails2(String requestDetails2) {
        this.requestDetails2 = requestDetails2;
    }

    public Transactions requestDetails2(String requestDetails2) {
        this.setRequestDetails2(requestDetails2);
        return this;
    }

    public String getRequestDetails3() {
        return this.requestDetails3;
    }

    public void setRequestDetails3(String requestDetails3) {
        this.requestDetails3 = requestDetails3;
    }

    public Transactions requestDetails3(String requestDetails3) {
        this.setRequestDetails3(requestDetails3);
        return this;
    }

    public String getRequestDetails4() {
        return this.requestDetails4;
    }

    public void setRequestDetails4(String requestDetails4) {
        this.requestDetails4 = requestDetails4;
    }

    public Transactions requestDetails4(String requestDetails4) {
        this.setRequestDetails4(requestDetails4);
        return this;
    }

    public String getTransferId() {
        return this.transferId;
    }

    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }

    public Transactions transferId(String transferId) {
        this.setTransferId(transferId);
        return this;
    }

    public String getTransferReferenceId() {
        return this.transferReferenceId;
    }

    public void setTransferReferenceId(String transferReferenceId) {
        this.transferReferenceId = transferReferenceId;
    }

    public Transactions transferReferenceId(String transferReferenceId) {
        this.setTransferReferenceId(transferReferenceId);
        return this;
    }

    public String getTransferStatus() {
        return this.transferStatus;
    }

    public void setTransferStatus(String transferStatus) {
        this.transferStatus = transferStatus;
    }

    public Transactions transferStatus(String transferStatus) {
        this.setTransferStatus(transferStatus);
        return this;
    }

    public ZonedDateTime getResponseDateTime() {
        return this.responseDateTime;
    }

    public void setResponseDateTime(ZonedDateTime responseDateTime) {
        this.responseDateTime = responseDateTime;
    }

    public Transactions responseDateTime(ZonedDateTime responseDateTime) {
        this.setResponseDateTime(responseDateTime);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Transactions)) {
            return false;
        }
        return id != null && id.equals(((Transactions) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Transactions{" +
            "id=" + getId() +
            ", recordId='" + getRecordId() + "'" +
            ", serviceLevel='" + getServiceLevel() + "'" +
            ", timestamp='" + getTimestamp() + "'" +
            ", partnerCode='" + getPartnerCode() + "'" +
            ", paymentItemCode='" + getPaymentItemCode() + "'" +
            ", amount='" + getAmount() + "'" +
            ", currency='" + getCurrency() + "'" +
            ", receiverBankCode='" + getReceiverBankCode() + "'" +
            ", receiverAccountNumber='" + getReceiverAccountNumber() + "'" +
            ", beneficiaryName='" + getBeneficiaryName() + "'" +
            ", instructionId='" + getInstructionId() + "'" +
            ", senderToReceiverInfo='" + getSenderToReceiverInfo() + "'" +
            ", externalTxnId='" + getExternalTxnId() + "'" +
            ", customerReference='" + getCustomerReference() + "'" +
            ", debitAccountNumber='" + getDebitAccountNumber() + "'" +
            ", creditAccountNumber='" + getCreditAccountNumber() + "'" +
            ", debitAmount=" + getDebitAmount() +
            ", creditAmount=" + getCreditAmount() +
            ", transactionAmount=" + getTransactionAmount() +
            ", debitDate='" + getDebitDate() + "'" +
            ", creditDate='" + getCreditDate() + "'" +
            ", status='" + getStatus() + "'" +
            ", settlementDate='" + getSettlementDate() + "'" +
            ", debitCurrency='" + getDebitCurrency() + "'" +
            ", phoneNumber='" + getPhoneNumber() + "'" +
            ", email='" + getEmail() + "'" +
            ", payerName='" + getPayerName() + "'" +
            ", payerAddress='" + getPayerAddress() + "'" +
            ", payerEmail='" + getPayerEmail() + "'" +
            ", payerPhoneNumber='" + getPayerPhoneNumber() + "'" +
            ", payerNarration='" + getPayerNarration() + "'" +
            ", payerBranchId='" + getPayerBranchId() + "'" +
            ", beneficiaryAccount='" + getBeneficiaryAccount() + "'" +
            ", beneficiaryBranchId='" + getBeneficiaryBranchId() + "'" +
            ", beneficiaryPhoneNumber='" + getBeneficiaryPhoneNumber() + "'" +
            ", fcrStatus='" + getFcrStatus() + "'" +
            ", tranStatusFinal='" + getTranStatusFinal() + "'" +
            ", narration1='" + getNarration1() + "'" +
            ", narration2='" + getNarration2() + "'" +
            ", narration3='" + getNarration3() + "'" +
            ", taxAmount=" + getTaxAmount() +
            ", taxGLAccount='" + getTaxGLAccount() + "'" +
            ", taxNarration='" + getTaxNarration() + "'" +
            ", internalErrorCode='" + getInternalErrorCode() + "'" +
            ", externalErrorCode='" + getExternalErrorCode() + "'" +
            ", payeeBranchId='" + getPayeeBranchId() + "'" +
            ", payeeProductInstanceReference='" + getPayeeProductInstanceReference() + "'" +
            ", payeeProductCode='" + getPayeeProductCode() + "'" +
            ", payeeProductName='" + getPayeeProductName() + "'" +
            ", payeeProductDescription='" + getPayeeProductDescription() + "'" +
            ", payeeProductUnitOfMeasure='" + getPayeeProductUnitOfMeasure() + "'" +
            ", payeeProductQuantity='" + getPayeeProductQuantity() + "'" +
            ", subCategoryCode='" + getSubCategoryCode() + "'" +
            ", payerBankCode='" + getPayerBankCode() + "'" +
            ", payerBankName='" + getPayerBankName() + "'" +
            ", payerBankAddress='" + getPayerBankAddress() + "'" +
            ", payerBankCity='" + getPayerBankCity() + "'" +
            ", payerBankState='" + getPayerBankState() + "'" +
            ", payerBankCountry='" + getPayerBankCountry() + "'" +
            ", payerBankPostalCode='" + getPayerBankPostalCode() + "'" +
            ", checkerId='" + getCheckerId() + "'" +
            ", remittanceInformation='" + getRemittanceInformation() + "'" +
            ", paymentChannelCode='" + getPaymentChannelCode() + "'" +
            ", feeAmount=" + getFeeAmount() +
            ", feeGLAccount='" + getFeeGLAccount() + "'" +
            ", feeNarration='" + getFeeNarration() + "'" +
            ", tranFreeField1='" + getTranFreeField1() + "'" +
            ", tranFreeField2='" + getTranFreeField2() + "'" +
            ", tranFreeField3='" + getTranFreeField3() + "'" +
            ", tranFreeField4='" + getTranFreeField4() + "'" +
            ", tranFreeField5='" + getTranFreeField5() + "'" +
            ", tranFreeField6='" + getTranFreeField6() + "'" +
            ", tranFreeField7='" + getTranFreeField7() + "'" +
            ", responseCode='" + getResponseCode() + "'" +
            ", responseMessage='" + getResponseMessage() + "'" +
            ", responseDetails1='" + getResponseDetails1() + "'" +
            ", responseDetails2='" + getResponseDetails2() + "'" +
            ", responseDetails3='" + getResponseDetails3() + "'" +
            ", responseDetails4='" + getResponseDetails4() + "'" +
            ", requestMessage='" + getRequestMessage() + "'" +
            ", requestDetails1='" + getRequestDetails1() + "'" +
            ", requestDetails2='" + getRequestDetails2() + "'" +
            ", requestDetails3='" + getRequestDetails3() + "'" +
            ", requestDetails4='" + getRequestDetails4() + "'" +
            ", transferId='" + getTransferId() + "'" +
            ", transferReferenceId='" + getTransferReferenceId() + "'" +
            ", transferStatus='" + getTransferStatus() + "'" +
            ", responseDateTime='" + getResponseDateTime() + "'" +
            "}";
    }
}
