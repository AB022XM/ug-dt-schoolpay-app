package ug.co.absa.africa.schoolpay.domain;

import jakarta.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.ZonedDateTime;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A AccountDetails.
 */
@Entity
@Table(name = "account_details")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class AccountDetails implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "account_currency")
    private String accountCurrency;

    @Column(name = "account_number")
    private String accountNumber;

    @Column(name = "account_status")
    private String accountStatus;

    @Column(name = "account_lifecycle_status_code")
    private String accountLifecycleStatusCode;

    @Column(name = "accrual_status_code")
    private String accrualStatusCode;

    @Column(name = "casa_account_status")
    private String casaAccountStatus;

    @Column(name = "minor_account_status_code")
    private String minorAccountStatusCode;

    @Column(name = "account_title")
    private String accountTitle;

    @Column(name = "advance_against_uncleared_funds", precision = 21, scale = 2)
    private BigDecimal advanceAgainstUnclearedFunds;

    @Column(name = "ad_hoc_statement_flag")
    private Boolean adHocStatementFlag;

    @Column(name = "additional_address_flag")
    private Boolean additionalAddressFlag;

    @Column(name = "atm_facility_flag")
    private Boolean atmFacilityFlag;

    @Column(name = "check_reorder_threshold_number", precision = 21, scale = 2)
    private BigDecimal checkReorderThresholdNumber;

    @Column(name = "deferred_stmt_generation_day_of_month", precision = 21, scale = 2)
    private BigDecimal deferredStmtGenerationDayOfMonth;

    @Column(name = "generate_rate_change_intimation_flag")
    private Boolean generateRateChangeIntimationFlag;

    @Column(name = "group_bonus_interes_flag")
    private String groupBonusInteresFlag;

    @Column(name = "hold_mail_flag")
    private String holdMailFlag;

    @Column(name = "interest_waiver_flag")
    private String interestWaiverFlag;

    @Column(name = "internet_banking_access_flag")
    private Boolean internetBankingAccessFlag;

    @Column(name = "inward_direct_debit_authorization_flag")
    private Boolean inwardDirectDebitAuthorizationFlag;

    @Column(name = "joint_account_flag")
    private Boolean jointAccountFlag;

    @Column(name = "lead_days_intimation")
    private Boolean leadDaysIntimation;

    @Column(name = "mail_address_control_flag")
    private Boolean mailAddressControlFlag;

    @Column(name = "mobile_facility_flag")
    private Boolean mobileFacilityFlag;

    @Column(name = "number_of_check_withdrawals")
    private Integer numberOfCheckWithdrawals;

    @Column(name = "number_of_past_due_checks")
    private Integer numberOfPastDueChecks;

    @Column(name = "number_of_statement_copies")
    private Integer numberOfStatementCopies;

    @Column(name = "overdraft_limit_amount")
    private Integer overdraftLimitAmount;

    @Column(name = "point_of_sale_facility_flag")
    private Boolean pointOfSaleFacilityFlag;

    @Column(name = "standing_instruction_flag")
    private Boolean standingInstructionFlag;

    @Column(name = "sweepout_instruction_flag")
    private Boolean sweepoutInstructionFlag;

    @Column(name = "available_balance", precision = 21, scale = 2)
    private BigDecimal availableBalance;

    @Column(name = "branch_code")
    private Integer branchCode;

    @Column(name = "branch_name")
    private String branchName;

    @Column(name = "branch_short_name")
    private String branchShortName;

    @Column(name = "credits_month_till_date_amount")
    private Integer creditsMonthTillDateAmount;

    @Column(name = "current_balance")
    private Integer currentBalance;

    @Column(name = "customer_number")
    private String customerNumber;

    @Column(name = "is_absa_customer")
    private Boolean isAbsaCustomer;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "account_opening_date")
    private ZonedDateTime accountOpeningDate;

    @Column(name = "statement_period_start_date")
    private ZonedDateTime statementPeriodStartDate;

    @Column(name = "statement_period_end_date")
    private ZonedDateTime statementPeriodEndDate;

    @Column(name = "debits_last_date")
    private ZonedDateTime debitsLastDate;

    @Column(name = "credit_last_date")
    private ZonedDateTime creditLastDate;

    @Column(name = "debits_month_till_date_amount")
    private ZonedDateTime debitsMonthTillDateAmount;

    @Column(name = "debits_year_till_date_amount", precision = 21, scale = 2)
    private BigDecimal debitsYearTillDateAmount;

    @Column(name = "credit_interest_accrued_amount", precision = 21, scale = 2)
    private BigDecimal creditInterestAccruedAmount;

    @Column(name = "debit_interest_accrued_amount", precision = 21, scale = 2)
    private BigDecimal debitInterestAccruedAmount;

    @Column(name = "adjusted_credit_interest_accrued", precision = 21, scale = 2)
    private BigDecimal adjustedCreditInterestAccrued;

    @Column(name = "adjusted_debit_interest_accrued", precision = 21, scale = 2)
    private BigDecimal adjustedDebitInterestAccrued;

    @Column(name = "projected_tax_on_accrued_interest_amount", precision = 21, scale = 2)
    private BigDecimal projectedTaxOnAccruedInterestAmount;

    @Column(name = "interest_accrued_in_current_financial_year")
    private Integer interestAccruedInCurrentFinancialYear;

    @Column(name = "issued_inventory_property_type")
    private String issuedInventoryPropertyType;

    @Column(name = "last_issued_check_number")
    private Integer lastIssuedCheckNumber;

    @Column(name = "language_code")
    private String languageCode;

    @Column(name = "line_number")
    private Integer lineNumber;

    @Column(name = "minimum_required_balance_amount", precision = 21, scale = 2)
    private BigDecimal minimumRequiredBalanceAmount;

    @Column(name = "minimum_required_trading_balance_amount", precision = 21, scale = 2)
    private BigDecimal minimumRequiredTradingBalanceAmount;

    @Column(name = "mtd_credits_count")
    private Integer mtdCreditsCount;

    @Column(name = "mtd_debits_count")
    private Integer mtdDebitsCount;

    @Column(name = "net_available_balance_for_withdrawal")
    private Integer netAvailableBalanceForWithdrawal;

    @Column(name = "net_balance_amount")
    private Integer netBalanceAmount;

    @Column(name = "passbook_lifecycle_status_code")
    private Integer passbookLifecycleStatusCode;

    @Column(name = "periodic_average_balance_amount", precision = 21, scale = 2)
    private BigDecimal periodicAverageBalanceAmount;

    @Column(name = "previous_day_closing_book_balance", precision = 21, scale = 2)
    private BigDecimal previousDayClosingBookBalance;

    @Column(name = "product_code")
    private Integer productCode;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "restricted_account_flag")
    private Boolean restrictedAccountFlag;

    @Column(name = "staff_flag")
    private Boolean staffFlag;

    @Column(name = "sweepin_amount_on_lien")
    private Integer sweepinAmountOnLien;

    @Column(name = "tax_code_1")
    private Integer taxCode1;

    @Column(name = "tax_code_2")
    private Integer taxCode2;

    @Column(name = "tds_exemption_limit_amount_1")
    private Integer tdsExemptionLimitAmount1;

    @Column(name = "tds_exemption_limit_amount_2")
    private Integer tdsExemptionLimitAmount2;

    @Column(name = "total_casa_hold_amount", precision = 21, scale = 2)
    private BigDecimal totalCASAHoldAmount;

    @Column(name = "total_unclear_fund_amount", precision = 21, scale = 2)
    private BigDecimal totalUnclearFundAmount;

    @Column(name = "ytd_credit_last_amount")
    private Integer ytdCreditLastAmount;

    @Column(name = "ytd_credits_count")
    private Integer ytdCreditsCount;

    @Column(name = "ytd_debits_count")
    private Integer ytdDebitsCount;

    @Column(name = "ytd_debits_last_amount")
    private Integer ytdDebitsLastAmount;

    @Column(name = "message")
    private String message;

    @Column(name = "source_info")
    private String sourceInfo;

    @Column(name = "status")
    private String status;

    @Column(name = "cust_free_text_field_1")
    private String custFreeTextField1;

    @Column(name = "cust_free_text_field_2")
    private String custFreeTextField2;

    @Column(name = "cust_free_text_field_3")
    private String custFreeTextField3;

    @Column(name = "cust_free_text_field_4")
    private String custFreeTextField4;

    @Column(name = "cust_free_text_field_5")
    private String custFreeTextField5;

    @Column(name = "cust_free_text_field_6")
    private String custFreeTextField6;

    @Column(name = "cust_free_text_field_7")
    private String custFreeTextField7;

    @Column(name = "cust_free_text_field_8")
    private String custFreeTextField8;

    @Column(name = "cust_free_text_field_9")
    private String custFreeTextField9;

    @Column(name = "cust_free_text_field_10")
    private String custFreeTextField10;

    @Column(name = "cust_free_text_field_11")
    private String custFreeTextField11;

    @Column(name = "cust_free_text_field_12")
    private String custFreeTextField12;

    @Column(name = "cust_free_text_field_13")
    private String custFreeTextField13;

    @Column(name = "cust_free_text_field_14")
    private String custFreeTextField14;

    @Column(name = "cust_free_text_field_15")
    private String custFreeTextField15;

    @Column(name = "cust_free_text_field_16")
    private String custFreeTextField16;

    @Column(name = "cust_free_text_field_17")
    private String custFreeTextField17;

    @Column(name = "cust_free_text_field_18")
    private String custFreeTextField18;

    @Column(name = "cust_free_text_field_19")
    private String custFreeTextField19;

    @Column(name = "cust_free_text_field_20")
    private String custFreeTextField20;

    @Column(name = "cust_free_text_field_21")
    private String custFreeTextField21;

    @Column(name = "cust_free_text_field_22")
    private String custFreeTextField22;

    @Column(name = "cust_free_text_field_23")
    private String custFreeTextField23;

    @Column(name = "cust_free_text_field_24")
    private String custFreeTextField24;

    @Column(name = "cust_free_text_field_25")
    private String custFreeTextField25;

    @Column(name = "cust_free_text_field_26")
    private String custFreeTextField26;

    @Column(name = "cust_free_text_field_27")
    private String custFreeTextField27;

    @Column(name = "cust_free_text_field_28")
    private String custFreeTextField28;

    @Column(name = "cust_free_text_field_29")
    private String custFreeTextField29;

    @Column(name = "cust_free_text_field_30")
    private String custFreeTextField30;

    @Column(name = "cust_free_text_field_31")
    private String custFreeTextField31;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AccountDetails id(Long id) {
        this.setId(id);
        return this;
    }

    public String getAccountCurrency() {
        return this.accountCurrency;
    }

    public void setAccountCurrency(String accountCurrency) {
        this.accountCurrency = accountCurrency;
    }

    public AccountDetails accountCurrency(String accountCurrency) {
        this.setAccountCurrency(accountCurrency);
        return this;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public AccountDetails accountNumber(String accountNumber) {
        this.setAccountNumber(accountNumber);
        return this;
    }

    public String getAccountStatus() {
        return this.accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public AccountDetails accountStatus(String accountStatus) {
        this.setAccountStatus(accountStatus);
        return this;
    }

    public String getAccountLifecycleStatusCode() {
        return this.accountLifecycleStatusCode;
    }

    public void setAccountLifecycleStatusCode(String accountLifecycleStatusCode) {
        this.accountLifecycleStatusCode = accountLifecycleStatusCode;
    }

    public AccountDetails accountLifecycleStatusCode(String accountLifecycleStatusCode) {
        this.setAccountLifecycleStatusCode(accountLifecycleStatusCode);
        return this;
    }

    public String getAccrualStatusCode() {
        return this.accrualStatusCode;
    }

    public void setAccrualStatusCode(String accrualStatusCode) {
        this.accrualStatusCode = accrualStatusCode;
    }

    public AccountDetails accrualStatusCode(String accrualStatusCode) {
        this.setAccrualStatusCode(accrualStatusCode);
        return this;
    }

    public String getCasaAccountStatus() {
        return this.casaAccountStatus;
    }

    public void setCasaAccountStatus(String casaAccountStatus) {
        this.casaAccountStatus = casaAccountStatus;
    }

    public AccountDetails casaAccountStatus(String casaAccountStatus) {
        this.setCasaAccountStatus(casaAccountStatus);
        return this;
    }

    public String getMinorAccountStatusCode() {
        return this.minorAccountStatusCode;
    }

    public void setMinorAccountStatusCode(String minorAccountStatusCode) {
        this.minorAccountStatusCode = minorAccountStatusCode;
    }

    public AccountDetails minorAccountStatusCode(String minorAccountStatusCode) {
        this.setMinorAccountStatusCode(minorAccountStatusCode);
        return this;
    }

    public String getAccountTitle() {
        return this.accountTitle;
    }

    public void setAccountTitle(String accountTitle) {
        this.accountTitle = accountTitle;
    }

    public AccountDetails accountTitle(String accountTitle) {
        this.setAccountTitle(accountTitle);
        return this;
    }

    public BigDecimal getAdvanceAgainstUnclearedFunds() {
        return this.advanceAgainstUnclearedFunds;
    }

    public void setAdvanceAgainstUnclearedFunds(BigDecimal advanceAgainstUnclearedFunds) {
        this.advanceAgainstUnclearedFunds = advanceAgainstUnclearedFunds;
    }

    public AccountDetails advanceAgainstUnclearedFunds(BigDecimal advanceAgainstUnclearedFunds) {
        this.setAdvanceAgainstUnclearedFunds(advanceAgainstUnclearedFunds);
        return this;
    }

    public Boolean getAdHocStatementFlag() {
        return this.adHocStatementFlag;
    }

    public void setAdHocStatementFlag(Boolean adHocStatementFlag) {
        this.adHocStatementFlag = adHocStatementFlag;
    }

    public AccountDetails adHocStatementFlag(Boolean adHocStatementFlag) {
        this.setAdHocStatementFlag(adHocStatementFlag);
        return this;
    }

    public Boolean getAdditionalAddressFlag() {
        return this.additionalAddressFlag;
    }

    public void setAdditionalAddressFlag(Boolean additionalAddressFlag) {
        this.additionalAddressFlag = additionalAddressFlag;
    }

    public AccountDetails additionalAddressFlag(Boolean additionalAddressFlag) {
        this.setAdditionalAddressFlag(additionalAddressFlag);
        return this;
    }

    public Boolean getAtmFacilityFlag() {
        return this.atmFacilityFlag;
    }

    public void setAtmFacilityFlag(Boolean atmFacilityFlag) {
        this.atmFacilityFlag = atmFacilityFlag;
    }

    public AccountDetails atmFacilityFlag(Boolean atmFacilityFlag) {
        this.setAtmFacilityFlag(atmFacilityFlag);
        return this;
    }

    public BigDecimal getCheckReorderThresholdNumber() {
        return this.checkReorderThresholdNumber;
    }

    public void setCheckReorderThresholdNumber(BigDecimal checkReorderThresholdNumber) {
        this.checkReorderThresholdNumber = checkReorderThresholdNumber;
    }

    public AccountDetails checkReorderThresholdNumber(BigDecimal checkReorderThresholdNumber) {
        this.setCheckReorderThresholdNumber(checkReorderThresholdNumber);
        return this;
    }

    public BigDecimal getDeferredStmtGenerationDayOfMonth() {
        return this.deferredStmtGenerationDayOfMonth;
    }

    public void setDeferredStmtGenerationDayOfMonth(BigDecimal deferredStmtGenerationDayOfMonth) {
        this.deferredStmtGenerationDayOfMonth = deferredStmtGenerationDayOfMonth;
    }

    public AccountDetails deferredStmtGenerationDayOfMonth(BigDecimal deferredStmtGenerationDayOfMonth) {
        this.setDeferredStmtGenerationDayOfMonth(deferredStmtGenerationDayOfMonth);
        return this;
    }

    public Boolean getGenerateRateChangeIntimationFlag() {
        return this.generateRateChangeIntimationFlag;
    }

    public void setGenerateRateChangeIntimationFlag(Boolean generateRateChangeIntimationFlag) {
        this.generateRateChangeIntimationFlag = generateRateChangeIntimationFlag;
    }

    public AccountDetails generateRateChangeIntimationFlag(Boolean generateRateChangeIntimationFlag) {
        this.setGenerateRateChangeIntimationFlag(generateRateChangeIntimationFlag);
        return this;
    }

    public String getGroupBonusInteresFlag() {
        return this.groupBonusInteresFlag;
    }

    public void setGroupBonusInteresFlag(String groupBonusInteresFlag) {
        this.groupBonusInteresFlag = groupBonusInteresFlag;
    }

    public AccountDetails groupBonusInteresFlag(String groupBonusInteresFlag) {
        this.setGroupBonusInteresFlag(groupBonusInteresFlag);
        return this;
    }

    public String getHoldMailFlag() {
        return this.holdMailFlag;
    }

    public void setHoldMailFlag(String holdMailFlag) {
        this.holdMailFlag = holdMailFlag;
    }

    public AccountDetails holdMailFlag(String holdMailFlag) {
        this.setHoldMailFlag(holdMailFlag);
        return this;
    }

    public String getInterestWaiverFlag() {
        return this.interestWaiverFlag;
    }

    public void setInterestWaiverFlag(String interestWaiverFlag) {
        this.interestWaiverFlag = interestWaiverFlag;
    }

    public AccountDetails interestWaiverFlag(String interestWaiverFlag) {
        this.setInterestWaiverFlag(interestWaiverFlag);
        return this;
    }

    public Boolean getInternetBankingAccessFlag() {
        return this.internetBankingAccessFlag;
    }

    public void setInternetBankingAccessFlag(Boolean internetBankingAccessFlag) {
        this.internetBankingAccessFlag = internetBankingAccessFlag;
    }

    public AccountDetails internetBankingAccessFlag(Boolean internetBankingAccessFlag) {
        this.setInternetBankingAccessFlag(internetBankingAccessFlag);
        return this;
    }

    public Boolean getInwardDirectDebitAuthorizationFlag() {
        return this.inwardDirectDebitAuthorizationFlag;
    }

    public void setInwardDirectDebitAuthorizationFlag(Boolean inwardDirectDebitAuthorizationFlag) {
        this.inwardDirectDebitAuthorizationFlag = inwardDirectDebitAuthorizationFlag;
    }

    public AccountDetails inwardDirectDebitAuthorizationFlag(Boolean inwardDirectDebitAuthorizationFlag) {
        this.setInwardDirectDebitAuthorizationFlag(inwardDirectDebitAuthorizationFlag);
        return this;
    }

    public Boolean getJointAccountFlag() {
        return this.jointAccountFlag;
    }

    public void setJointAccountFlag(Boolean jointAccountFlag) {
        this.jointAccountFlag = jointAccountFlag;
    }

    public AccountDetails jointAccountFlag(Boolean jointAccountFlag) {
        this.setJointAccountFlag(jointAccountFlag);
        return this;
    }

    public Boolean getLeadDaysIntimation() {
        return this.leadDaysIntimation;
    }

    public void setLeadDaysIntimation(Boolean leadDaysIntimation) {
        this.leadDaysIntimation = leadDaysIntimation;
    }

    public AccountDetails leadDaysIntimation(Boolean leadDaysIntimation) {
        this.setLeadDaysIntimation(leadDaysIntimation);
        return this;
    }

    public Boolean getMailAddressControlFlag() {
        return this.mailAddressControlFlag;
    }

    public void setMailAddressControlFlag(Boolean mailAddressControlFlag) {
        this.mailAddressControlFlag = mailAddressControlFlag;
    }

    public AccountDetails mailAddressControlFlag(Boolean mailAddressControlFlag) {
        this.setMailAddressControlFlag(mailAddressControlFlag);
        return this;
    }

    public Boolean getMobileFacilityFlag() {
        return this.mobileFacilityFlag;
    }

    public void setMobileFacilityFlag(Boolean mobileFacilityFlag) {
        this.mobileFacilityFlag = mobileFacilityFlag;
    }

    public AccountDetails mobileFacilityFlag(Boolean mobileFacilityFlag) {
        this.setMobileFacilityFlag(mobileFacilityFlag);
        return this;
    }

    public Integer getNumberOfCheckWithdrawals() {
        return this.numberOfCheckWithdrawals;
    }

    public void setNumberOfCheckWithdrawals(Integer numberOfCheckWithdrawals) {
        this.numberOfCheckWithdrawals = numberOfCheckWithdrawals;
    }

    public AccountDetails numberOfCheckWithdrawals(Integer numberOfCheckWithdrawals) {
        this.setNumberOfCheckWithdrawals(numberOfCheckWithdrawals);
        return this;
    }

    public Integer getNumberOfPastDueChecks() {
        return this.numberOfPastDueChecks;
    }

    public void setNumberOfPastDueChecks(Integer numberOfPastDueChecks) {
        this.numberOfPastDueChecks = numberOfPastDueChecks;
    }

    public AccountDetails numberOfPastDueChecks(Integer numberOfPastDueChecks) {
        this.setNumberOfPastDueChecks(numberOfPastDueChecks);
        return this;
    }

    public Integer getNumberOfStatementCopies() {
        return this.numberOfStatementCopies;
    }

    public void setNumberOfStatementCopies(Integer numberOfStatementCopies) {
        this.numberOfStatementCopies = numberOfStatementCopies;
    }

    public AccountDetails numberOfStatementCopies(Integer numberOfStatementCopies) {
        this.setNumberOfStatementCopies(numberOfStatementCopies);
        return this;
    }

    public Integer getOverdraftLimitAmount() {
        return this.overdraftLimitAmount;
    }

    public void setOverdraftLimitAmount(Integer overdraftLimitAmount) {
        this.overdraftLimitAmount = overdraftLimitAmount;
    }

    public AccountDetails overdraftLimitAmount(Integer overdraftLimitAmount) {
        this.setOverdraftLimitAmount(overdraftLimitAmount);
        return this;
    }

    public Boolean getPointOfSaleFacilityFlag() {
        return this.pointOfSaleFacilityFlag;
    }

    public void setPointOfSaleFacilityFlag(Boolean pointOfSaleFacilityFlag) {
        this.pointOfSaleFacilityFlag = pointOfSaleFacilityFlag;
    }

    public AccountDetails pointOfSaleFacilityFlag(Boolean pointOfSaleFacilityFlag) {
        this.setPointOfSaleFacilityFlag(pointOfSaleFacilityFlag);
        return this;
    }

    public Boolean getStandingInstructionFlag() {
        return this.standingInstructionFlag;
    }

    public void setStandingInstructionFlag(Boolean standingInstructionFlag) {
        this.standingInstructionFlag = standingInstructionFlag;
    }

    public AccountDetails standingInstructionFlag(Boolean standingInstructionFlag) {
        this.setStandingInstructionFlag(standingInstructionFlag);
        return this;
    }

    public Boolean getSweepoutInstructionFlag() {
        return this.sweepoutInstructionFlag;
    }

    public void setSweepoutInstructionFlag(Boolean sweepoutInstructionFlag) {
        this.sweepoutInstructionFlag = sweepoutInstructionFlag;
    }

    public AccountDetails sweepoutInstructionFlag(Boolean sweepoutInstructionFlag) {
        this.setSweepoutInstructionFlag(sweepoutInstructionFlag);
        return this;
    }

    public BigDecimal getAvailableBalance() {
        return this.availableBalance;
    }

    public void setAvailableBalance(BigDecimal availableBalance) {
        this.availableBalance = availableBalance;
    }

    public AccountDetails availableBalance(BigDecimal availableBalance) {
        this.setAvailableBalance(availableBalance);
        return this;
    }

    public Integer getBranchCode() {
        return this.branchCode;
    }

    public void setBranchCode(Integer branchCode) {
        this.branchCode = branchCode;
    }

    public AccountDetails branchCode(Integer branchCode) {
        this.setBranchCode(branchCode);
        return this;
    }

    public String getBranchName() {
        return this.branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public AccountDetails branchName(String branchName) {
        this.setBranchName(branchName);
        return this;
    }

    public String getBranchShortName() {
        return this.branchShortName;
    }

    public void setBranchShortName(String branchShortName) {
        this.branchShortName = branchShortName;
    }

    public AccountDetails branchShortName(String branchShortName) {
        this.setBranchShortName(branchShortName);
        return this;
    }

    public Integer getCreditsMonthTillDateAmount() {
        return this.creditsMonthTillDateAmount;
    }

    public void setCreditsMonthTillDateAmount(Integer creditsMonthTillDateAmount) {
        this.creditsMonthTillDateAmount = creditsMonthTillDateAmount;
    }

    public AccountDetails creditsMonthTillDateAmount(Integer creditsMonthTillDateAmount) {
        this.setCreditsMonthTillDateAmount(creditsMonthTillDateAmount);
        return this;
    }

    public Integer getCurrentBalance() {
        return this.currentBalance;
    }

    public void setCurrentBalance(Integer currentBalance) {
        this.currentBalance = currentBalance;
    }

    public AccountDetails currentBalance(Integer currentBalance) {
        this.setCurrentBalance(currentBalance);
        return this;
    }

    public String getCustomerNumber() {
        return this.customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public AccountDetails customerNumber(String customerNumber) {
        this.setCustomerNumber(customerNumber);
        return this;
    }

    public Boolean getIsAbsaCustomer() {
        return this.isAbsaCustomer;
    }

    public void setIsAbsaCustomer(Boolean isAbsaCustomer) {
        this.isAbsaCustomer = isAbsaCustomer;
    }

    public AccountDetails isAbsaCustomer(Boolean isAbsaCustomer) {
        this.setIsAbsaCustomer(isAbsaCustomer);
        return this;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public AccountDetails fullName(String fullName) {
        this.setFullName(fullName);
        return this;
    }

    public ZonedDateTime getAccountOpeningDate() {
        return this.accountOpeningDate;
    }

    public void setAccountOpeningDate(ZonedDateTime accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
    }

    public AccountDetails accountOpeningDate(ZonedDateTime accountOpeningDate) {
        this.setAccountOpeningDate(accountOpeningDate);
        return this;
    }

    public ZonedDateTime getStatementPeriodStartDate() {
        return this.statementPeriodStartDate;
    }

    public void setStatementPeriodStartDate(ZonedDateTime statementPeriodStartDate) {
        this.statementPeriodStartDate = statementPeriodStartDate;
    }

    public AccountDetails statementPeriodStartDate(ZonedDateTime statementPeriodStartDate) {
        this.setStatementPeriodStartDate(statementPeriodStartDate);
        return this;
    }

    public ZonedDateTime getStatementPeriodEndDate() {
        return this.statementPeriodEndDate;
    }

    public void setStatementPeriodEndDate(ZonedDateTime statementPeriodEndDate) {
        this.statementPeriodEndDate = statementPeriodEndDate;
    }

    public AccountDetails statementPeriodEndDate(ZonedDateTime statementPeriodEndDate) {
        this.setStatementPeriodEndDate(statementPeriodEndDate);
        return this;
    }

    public ZonedDateTime getDebitsLastDate() {
        return this.debitsLastDate;
    }

    public void setDebitsLastDate(ZonedDateTime debitsLastDate) {
        this.debitsLastDate = debitsLastDate;
    }

    public AccountDetails debitsLastDate(ZonedDateTime debitsLastDate) {
        this.setDebitsLastDate(debitsLastDate);
        return this;
    }

    public ZonedDateTime getCreditLastDate() {
        return this.creditLastDate;
    }

    public void setCreditLastDate(ZonedDateTime creditLastDate) {
        this.creditLastDate = creditLastDate;
    }

    public AccountDetails creditLastDate(ZonedDateTime creditLastDate) {
        this.setCreditLastDate(creditLastDate);
        return this;
    }

    public ZonedDateTime getDebitsMonthTillDateAmount() {
        return this.debitsMonthTillDateAmount;
    }

    public void setDebitsMonthTillDateAmount(ZonedDateTime debitsMonthTillDateAmount) {
        this.debitsMonthTillDateAmount = debitsMonthTillDateAmount;
    }

    public AccountDetails debitsMonthTillDateAmount(ZonedDateTime debitsMonthTillDateAmount) {
        this.setDebitsMonthTillDateAmount(debitsMonthTillDateAmount);
        return this;
    }

    public BigDecimal getDebitsYearTillDateAmount() {
        return this.debitsYearTillDateAmount;
    }

    public void setDebitsYearTillDateAmount(BigDecimal debitsYearTillDateAmount) {
        this.debitsYearTillDateAmount = debitsYearTillDateAmount;
    }

    public AccountDetails debitsYearTillDateAmount(BigDecimal debitsYearTillDateAmount) {
        this.setDebitsYearTillDateAmount(debitsYearTillDateAmount);
        return this;
    }

    public BigDecimal getCreditInterestAccruedAmount() {
        return this.creditInterestAccruedAmount;
    }

    public void setCreditInterestAccruedAmount(BigDecimal creditInterestAccruedAmount) {
        this.creditInterestAccruedAmount = creditInterestAccruedAmount;
    }

    public AccountDetails creditInterestAccruedAmount(BigDecimal creditInterestAccruedAmount) {
        this.setCreditInterestAccruedAmount(creditInterestAccruedAmount);
        return this;
    }

    public BigDecimal getDebitInterestAccruedAmount() {
        return this.debitInterestAccruedAmount;
    }

    public void setDebitInterestAccruedAmount(BigDecimal debitInterestAccruedAmount) {
        this.debitInterestAccruedAmount = debitInterestAccruedAmount;
    }

    public AccountDetails debitInterestAccruedAmount(BigDecimal debitInterestAccruedAmount) {
        this.setDebitInterestAccruedAmount(debitInterestAccruedAmount);
        return this;
    }

    public BigDecimal getAdjustedCreditInterestAccrued() {
        return this.adjustedCreditInterestAccrued;
    }

    public void setAdjustedCreditInterestAccrued(BigDecimal adjustedCreditInterestAccrued) {
        this.adjustedCreditInterestAccrued = adjustedCreditInterestAccrued;
    }

    public AccountDetails adjustedCreditInterestAccrued(BigDecimal adjustedCreditInterestAccrued) {
        this.setAdjustedCreditInterestAccrued(adjustedCreditInterestAccrued);
        return this;
    }

    public BigDecimal getAdjustedDebitInterestAccrued() {
        return this.adjustedDebitInterestAccrued;
    }

    public void setAdjustedDebitInterestAccrued(BigDecimal adjustedDebitInterestAccrued) {
        this.adjustedDebitInterestAccrued = adjustedDebitInterestAccrued;
    }

    public AccountDetails adjustedDebitInterestAccrued(BigDecimal adjustedDebitInterestAccrued) {
        this.setAdjustedDebitInterestAccrued(adjustedDebitInterestAccrued);
        return this;
    }

    public BigDecimal getProjectedTaxOnAccruedInterestAmount() {
        return this.projectedTaxOnAccruedInterestAmount;
    }

    public void setProjectedTaxOnAccruedInterestAmount(BigDecimal projectedTaxOnAccruedInterestAmount) {
        this.projectedTaxOnAccruedInterestAmount = projectedTaxOnAccruedInterestAmount;
    }

    public AccountDetails projectedTaxOnAccruedInterestAmount(BigDecimal projectedTaxOnAccruedInterestAmount) {
        this.setProjectedTaxOnAccruedInterestAmount(projectedTaxOnAccruedInterestAmount);
        return this;
    }

    public Integer getInterestAccruedInCurrentFinancialYear() {
        return this.interestAccruedInCurrentFinancialYear;
    }

    public void setInterestAccruedInCurrentFinancialYear(Integer interestAccruedInCurrentFinancialYear) {
        this.interestAccruedInCurrentFinancialYear = interestAccruedInCurrentFinancialYear;
    }

    public AccountDetails interestAccruedInCurrentFinancialYear(Integer interestAccruedInCurrentFinancialYear) {
        this.setInterestAccruedInCurrentFinancialYear(interestAccruedInCurrentFinancialYear);
        return this;
    }

    public String getIssuedInventoryPropertyType() {
        return this.issuedInventoryPropertyType;
    }

    public void setIssuedInventoryPropertyType(String issuedInventoryPropertyType) {
        this.issuedInventoryPropertyType = issuedInventoryPropertyType;
    }

    public AccountDetails issuedInventoryPropertyType(String issuedInventoryPropertyType) {
        this.setIssuedInventoryPropertyType(issuedInventoryPropertyType);
        return this;
    }

    public Integer getLastIssuedCheckNumber() {
        return this.lastIssuedCheckNumber;
    }

    public void setLastIssuedCheckNumber(Integer lastIssuedCheckNumber) {
        this.lastIssuedCheckNumber = lastIssuedCheckNumber;
    }

    public AccountDetails lastIssuedCheckNumber(Integer lastIssuedCheckNumber) {
        this.setLastIssuedCheckNumber(lastIssuedCheckNumber);
        return this;
    }

    public String getLanguageCode() {
        return this.languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public AccountDetails languageCode(String languageCode) {
        this.setLanguageCode(languageCode);
        return this;
    }

    public Integer getLineNumber() {
        return this.lineNumber;
    }

    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    public AccountDetails lineNumber(Integer lineNumber) {
        this.setLineNumber(lineNumber);
        return this;
    }

    public BigDecimal getMinimumRequiredBalanceAmount() {
        return this.minimumRequiredBalanceAmount;
    }

    public void setMinimumRequiredBalanceAmount(BigDecimal minimumRequiredBalanceAmount) {
        this.minimumRequiredBalanceAmount = minimumRequiredBalanceAmount;
    }

    public AccountDetails minimumRequiredBalanceAmount(BigDecimal minimumRequiredBalanceAmount) {
        this.setMinimumRequiredBalanceAmount(minimumRequiredBalanceAmount);
        return this;
    }

    public BigDecimal getMinimumRequiredTradingBalanceAmount() {
        return this.minimumRequiredTradingBalanceAmount;
    }

    public void setMinimumRequiredTradingBalanceAmount(BigDecimal minimumRequiredTradingBalanceAmount) {
        this.minimumRequiredTradingBalanceAmount = minimumRequiredTradingBalanceAmount;
    }

    public AccountDetails minimumRequiredTradingBalanceAmount(BigDecimal minimumRequiredTradingBalanceAmount) {
        this.setMinimumRequiredTradingBalanceAmount(minimumRequiredTradingBalanceAmount);
        return this;
    }

    public Integer getMtdCreditsCount() {
        return this.mtdCreditsCount;
    }

    public void setMtdCreditsCount(Integer mtdCreditsCount) {
        this.mtdCreditsCount = mtdCreditsCount;
    }

    public AccountDetails mtdCreditsCount(Integer mtdCreditsCount) {
        this.setMtdCreditsCount(mtdCreditsCount);
        return this;
    }

    public Integer getMtdDebitsCount() {
        return this.mtdDebitsCount;
    }

    public void setMtdDebitsCount(Integer mtdDebitsCount) {
        this.mtdDebitsCount = mtdDebitsCount;
    }

    public AccountDetails mtdDebitsCount(Integer mtdDebitsCount) {
        this.setMtdDebitsCount(mtdDebitsCount);
        return this;
    }

    public Integer getNetAvailableBalanceForWithdrawal() {
        return this.netAvailableBalanceForWithdrawal;
    }

    public void setNetAvailableBalanceForWithdrawal(Integer netAvailableBalanceForWithdrawal) {
        this.netAvailableBalanceForWithdrawal = netAvailableBalanceForWithdrawal;
    }

    public AccountDetails netAvailableBalanceForWithdrawal(Integer netAvailableBalanceForWithdrawal) {
        this.setNetAvailableBalanceForWithdrawal(netAvailableBalanceForWithdrawal);
        return this;
    }

    public Integer getNetBalanceAmount() {
        return this.netBalanceAmount;
    }

    public void setNetBalanceAmount(Integer netBalanceAmount) {
        this.netBalanceAmount = netBalanceAmount;
    }

    public AccountDetails netBalanceAmount(Integer netBalanceAmount) {
        this.setNetBalanceAmount(netBalanceAmount);
        return this;
    }

    public Integer getPassbookLifecycleStatusCode() {
        return this.passbookLifecycleStatusCode;
    }

    public void setPassbookLifecycleStatusCode(Integer passbookLifecycleStatusCode) {
        this.passbookLifecycleStatusCode = passbookLifecycleStatusCode;
    }

    public AccountDetails passbookLifecycleStatusCode(Integer passbookLifecycleStatusCode) {
        this.setPassbookLifecycleStatusCode(passbookLifecycleStatusCode);
        return this;
    }

    public BigDecimal getPeriodicAverageBalanceAmount() {
        return this.periodicAverageBalanceAmount;
    }

    public void setPeriodicAverageBalanceAmount(BigDecimal periodicAverageBalanceAmount) {
        this.periodicAverageBalanceAmount = periodicAverageBalanceAmount;
    }

    public AccountDetails periodicAverageBalanceAmount(BigDecimal periodicAverageBalanceAmount) {
        this.setPeriodicAverageBalanceAmount(periodicAverageBalanceAmount);
        return this;
    }

    public BigDecimal getPreviousDayClosingBookBalance() {
        return this.previousDayClosingBookBalance;
    }

    public void setPreviousDayClosingBookBalance(BigDecimal previousDayClosingBookBalance) {
        this.previousDayClosingBookBalance = previousDayClosingBookBalance;
    }

    public AccountDetails previousDayClosingBookBalance(BigDecimal previousDayClosingBookBalance) {
        this.setPreviousDayClosingBookBalance(previousDayClosingBookBalance);
        return this;
    }

    public Integer getProductCode() {
        return this.productCode;
    }

    public void setProductCode(Integer productCode) {
        this.productCode = productCode;
    }

    public AccountDetails productCode(Integer productCode) {
        this.setProductCode(productCode);
        return this;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public AccountDetails productName(String productName) {
        this.setProductName(productName);
        return this;
    }

    public Boolean getRestrictedAccountFlag() {
        return this.restrictedAccountFlag;
    }

    public void setRestrictedAccountFlag(Boolean restrictedAccountFlag) {
        this.restrictedAccountFlag = restrictedAccountFlag;
    }

    public AccountDetails restrictedAccountFlag(Boolean restrictedAccountFlag) {
        this.setRestrictedAccountFlag(restrictedAccountFlag);
        return this;
    }

    public Boolean getStaffFlag() {
        return this.staffFlag;
    }

    public void setStaffFlag(Boolean staffFlag) {
        this.staffFlag = staffFlag;
    }

    public AccountDetails staffFlag(Boolean staffFlag) {
        this.setStaffFlag(staffFlag);
        return this;
    }

    public Integer getSweepinAmountOnLien() {
        return this.sweepinAmountOnLien;
    }

    public void setSweepinAmountOnLien(Integer sweepinAmountOnLien) {
        this.sweepinAmountOnLien = sweepinAmountOnLien;
    }

    public AccountDetails sweepinAmountOnLien(Integer sweepinAmountOnLien) {
        this.setSweepinAmountOnLien(sweepinAmountOnLien);
        return this;
    }

    public Integer getTaxCode1() {
        return this.taxCode1;
    }

    public void setTaxCode1(Integer taxCode1) {
        this.taxCode1 = taxCode1;
    }

    public AccountDetails taxCode1(Integer taxCode1) {
        this.setTaxCode1(taxCode1);
        return this;
    }

    public Integer getTaxCode2() {
        return this.taxCode2;
    }

    public void setTaxCode2(Integer taxCode2) {
        this.taxCode2 = taxCode2;
    }

    public AccountDetails taxCode2(Integer taxCode2) {
        this.setTaxCode2(taxCode2);
        return this;
    }

    public Integer getTdsExemptionLimitAmount1() {
        return this.tdsExemptionLimitAmount1;
    }

    public void setTdsExemptionLimitAmount1(Integer tdsExemptionLimitAmount1) {
        this.tdsExemptionLimitAmount1 = tdsExemptionLimitAmount1;
    }

    public AccountDetails tdsExemptionLimitAmount1(Integer tdsExemptionLimitAmount1) {
        this.setTdsExemptionLimitAmount1(tdsExemptionLimitAmount1);
        return this;
    }

    public Integer getTdsExemptionLimitAmount2() {
        return this.tdsExemptionLimitAmount2;
    }

    public void setTdsExemptionLimitAmount2(Integer tdsExemptionLimitAmount2) {
        this.tdsExemptionLimitAmount2 = tdsExemptionLimitAmount2;
    }

    public AccountDetails tdsExemptionLimitAmount2(Integer tdsExemptionLimitAmount2) {
        this.setTdsExemptionLimitAmount2(tdsExemptionLimitAmount2);
        return this;
    }

    public BigDecimal getTotalCASAHoldAmount() {
        return this.totalCASAHoldAmount;
    }

    public void setTotalCASAHoldAmount(BigDecimal totalCASAHoldAmount) {
        this.totalCASAHoldAmount = totalCASAHoldAmount;
    }

    public AccountDetails totalCASAHoldAmount(BigDecimal totalCASAHoldAmount) {
        this.setTotalCASAHoldAmount(totalCASAHoldAmount);
        return this;
    }

    public BigDecimal getTotalUnclearFundAmount() {
        return this.totalUnclearFundAmount;
    }

    public void setTotalUnclearFundAmount(BigDecimal totalUnclearFundAmount) {
        this.totalUnclearFundAmount = totalUnclearFundAmount;
    }

    public AccountDetails totalUnclearFundAmount(BigDecimal totalUnclearFundAmount) {
        this.setTotalUnclearFundAmount(totalUnclearFundAmount);
        return this;
    }

    public Integer getYtdCreditLastAmount() {
        return this.ytdCreditLastAmount;
    }

    public void setYtdCreditLastAmount(Integer ytdCreditLastAmount) {
        this.ytdCreditLastAmount = ytdCreditLastAmount;
    }

    public AccountDetails ytdCreditLastAmount(Integer ytdCreditLastAmount) {
        this.setYtdCreditLastAmount(ytdCreditLastAmount);
        return this;
    }

    public Integer getYtdCreditsCount() {
        return this.ytdCreditsCount;
    }

    public void setYtdCreditsCount(Integer ytdCreditsCount) {
        this.ytdCreditsCount = ytdCreditsCount;
    }

    public AccountDetails ytdCreditsCount(Integer ytdCreditsCount) {
        this.setYtdCreditsCount(ytdCreditsCount);
        return this;
    }

    public Integer getYtdDebitsCount() {
        return this.ytdDebitsCount;
    }

    public void setYtdDebitsCount(Integer ytdDebitsCount) {
        this.ytdDebitsCount = ytdDebitsCount;
    }

    public AccountDetails ytdDebitsCount(Integer ytdDebitsCount) {
        this.setYtdDebitsCount(ytdDebitsCount);
        return this;
    }

    public Integer getYtdDebitsLastAmount() {
        return this.ytdDebitsLastAmount;
    }

    public void setYtdDebitsLastAmount(Integer ytdDebitsLastAmount) {
        this.ytdDebitsLastAmount = ytdDebitsLastAmount;
    }

    public AccountDetails ytdDebitsLastAmount(Integer ytdDebitsLastAmount) {
        this.setYtdDebitsLastAmount(ytdDebitsLastAmount);
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public AccountDetails message(String message) {
        this.setMessage(message);
        return this;
    }

    public String getSourceInfo() {
        return this.sourceInfo;
    }

    public void setSourceInfo(String sourceInfo) {
        this.sourceInfo = sourceInfo;
    }

    public AccountDetails sourceInfo(String sourceInfo) {
        this.setSourceInfo(sourceInfo);
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AccountDetails status(String status) {
        this.setStatus(status);
        return this;
    }

    public String getCustFreeTextField1() {
        return this.custFreeTextField1;
    }

    public void setCustFreeTextField1(String custFreeTextField1) {
        this.custFreeTextField1 = custFreeTextField1;
    }

    public AccountDetails custFreeTextField1(String custFreeTextField1) {
        this.setCustFreeTextField1(custFreeTextField1);
        return this;
    }

    public String getCustFreeTextField2() {
        return this.custFreeTextField2;
    }

    public void setCustFreeTextField2(String custFreeTextField2) {
        this.custFreeTextField2 = custFreeTextField2;
    }

    public AccountDetails custFreeTextField2(String custFreeTextField2) {
        this.setCustFreeTextField2(custFreeTextField2);
        return this;
    }

    public String getCustFreeTextField3() {
        return this.custFreeTextField3;
    }

    public void setCustFreeTextField3(String custFreeTextField3) {
        this.custFreeTextField3 = custFreeTextField3;
    }

    public AccountDetails custFreeTextField3(String custFreeTextField3) {
        this.setCustFreeTextField3(custFreeTextField3);
        return this;
    }

    public String getCustFreeTextField4() {
        return this.custFreeTextField4;
    }

    public void setCustFreeTextField4(String custFreeTextField4) {
        this.custFreeTextField4 = custFreeTextField4;
    }

    public AccountDetails custFreeTextField4(String custFreeTextField4) {
        this.setCustFreeTextField4(custFreeTextField4);
        return this;
    }

    public String getCustFreeTextField5() {
        return this.custFreeTextField5;
    }

    public void setCustFreeTextField5(String custFreeTextField5) {
        this.custFreeTextField5 = custFreeTextField5;
    }

    public AccountDetails custFreeTextField5(String custFreeTextField5) {
        this.setCustFreeTextField5(custFreeTextField5);
        return this;
    }

    public String getCustFreeTextField6() {
        return this.custFreeTextField6;
    }

    public void setCustFreeTextField6(String custFreeTextField6) {
        this.custFreeTextField6 = custFreeTextField6;
    }

    public AccountDetails custFreeTextField6(String custFreeTextField6) {
        this.setCustFreeTextField6(custFreeTextField6);
        return this;
    }

    public String getCustFreeTextField7() {
        return this.custFreeTextField7;
    }

    public void setCustFreeTextField7(String custFreeTextField7) {
        this.custFreeTextField7 = custFreeTextField7;
    }

    public AccountDetails custFreeTextField7(String custFreeTextField7) {
        this.setCustFreeTextField7(custFreeTextField7);
        return this;
    }

    public String getCustFreeTextField8() {
        return this.custFreeTextField8;
    }

    public void setCustFreeTextField8(String custFreeTextField8) {
        this.custFreeTextField8 = custFreeTextField8;
    }

    public AccountDetails custFreeTextField8(String custFreeTextField8) {
        this.setCustFreeTextField8(custFreeTextField8);
        return this;
    }

    public String getCustFreeTextField9() {
        return this.custFreeTextField9;
    }

    public void setCustFreeTextField9(String custFreeTextField9) {
        this.custFreeTextField9 = custFreeTextField9;
    }

    public AccountDetails custFreeTextField9(String custFreeTextField9) {
        this.setCustFreeTextField9(custFreeTextField9);
        return this;
    }

    public String getCustFreeTextField10() {
        return this.custFreeTextField10;
    }

    public void setCustFreeTextField10(String custFreeTextField10) {
        this.custFreeTextField10 = custFreeTextField10;
    }

    public AccountDetails custFreeTextField10(String custFreeTextField10) {
        this.setCustFreeTextField10(custFreeTextField10);
        return this;
    }

    public String getCustFreeTextField11() {
        return this.custFreeTextField11;
    }

    public void setCustFreeTextField11(String custFreeTextField11) {
        this.custFreeTextField11 = custFreeTextField11;
    }

    public AccountDetails custFreeTextField11(String custFreeTextField11) {
        this.setCustFreeTextField11(custFreeTextField11);
        return this;
    }

    public String getCustFreeTextField12() {
        return this.custFreeTextField12;
    }

    public void setCustFreeTextField12(String custFreeTextField12) {
        this.custFreeTextField12 = custFreeTextField12;
    }

    public AccountDetails custFreeTextField12(String custFreeTextField12) {
        this.setCustFreeTextField12(custFreeTextField12);
        return this;
    }

    public String getCustFreeTextField13() {
        return this.custFreeTextField13;
    }

    public void setCustFreeTextField13(String custFreeTextField13) {
        this.custFreeTextField13 = custFreeTextField13;
    }

    public AccountDetails custFreeTextField13(String custFreeTextField13) {
        this.setCustFreeTextField13(custFreeTextField13);
        return this;
    }

    public String getCustFreeTextField14() {
        return this.custFreeTextField14;
    }

    public void setCustFreeTextField14(String custFreeTextField14) {
        this.custFreeTextField14 = custFreeTextField14;
    }

    public AccountDetails custFreeTextField14(String custFreeTextField14) {
        this.setCustFreeTextField14(custFreeTextField14);
        return this;
    }

    public String getCustFreeTextField15() {
        return this.custFreeTextField15;
    }

    public void setCustFreeTextField15(String custFreeTextField15) {
        this.custFreeTextField15 = custFreeTextField15;
    }

    public AccountDetails custFreeTextField15(String custFreeTextField15) {
        this.setCustFreeTextField15(custFreeTextField15);
        return this;
    }

    public String getCustFreeTextField16() {
        return this.custFreeTextField16;
    }

    public void setCustFreeTextField16(String custFreeTextField16) {
        this.custFreeTextField16 = custFreeTextField16;
    }

    public AccountDetails custFreeTextField16(String custFreeTextField16) {
        this.setCustFreeTextField16(custFreeTextField16);
        return this;
    }

    public String getCustFreeTextField17() {
        return this.custFreeTextField17;
    }

    public void setCustFreeTextField17(String custFreeTextField17) {
        this.custFreeTextField17 = custFreeTextField17;
    }

    public AccountDetails custFreeTextField17(String custFreeTextField17) {
        this.setCustFreeTextField17(custFreeTextField17);
        return this;
    }

    public String getCustFreeTextField18() {
        return this.custFreeTextField18;
    }

    public void setCustFreeTextField18(String custFreeTextField18) {
        this.custFreeTextField18 = custFreeTextField18;
    }

    public AccountDetails custFreeTextField18(String custFreeTextField18) {
        this.setCustFreeTextField18(custFreeTextField18);
        return this;
    }

    public String getCustFreeTextField19() {
        return this.custFreeTextField19;
    }

    public void setCustFreeTextField19(String custFreeTextField19) {
        this.custFreeTextField19 = custFreeTextField19;
    }

    public AccountDetails custFreeTextField19(String custFreeTextField19) {
        this.setCustFreeTextField19(custFreeTextField19);
        return this;
    }

    public String getCustFreeTextField20() {
        return this.custFreeTextField20;
    }

    public void setCustFreeTextField20(String custFreeTextField20) {
        this.custFreeTextField20 = custFreeTextField20;
    }

    public AccountDetails custFreeTextField20(String custFreeTextField20) {
        this.setCustFreeTextField20(custFreeTextField20);
        return this;
    }

    public String getCustFreeTextField21() {
        return this.custFreeTextField21;
    }

    public void setCustFreeTextField21(String custFreeTextField21) {
        this.custFreeTextField21 = custFreeTextField21;
    }

    public AccountDetails custFreeTextField21(String custFreeTextField21) {
        this.setCustFreeTextField21(custFreeTextField21);
        return this;
    }

    public String getCustFreeTextField22() {
        return this.custFreeTextField22;
    }

    public void setCustFreeTextField22(String custFreeTextField22) {
        this.custFreeTextField22 = custFreeTextField22;
    }

    public AccountDetails custFreeTextField22(String custFreeTextField22) {
        this.setCustFreeTextField22(custFreeTextField22);
        return this;
    }

    public String getCustFreeTextField23() {
        return this.custFreeTextField23;
    }

    public void setCustFreeTextField23(String custFreeTextField23) {
        this.custFreeTextField23 = custFreeTextField23;
    }

    public AccountDetails custFreeTextField23(String custFreeTextField23) {
        this.setCustFreeTextField23(custFreeTextField23);
        return this;
    }

    public String getCustFreeTextField24() {
        return this.custFreeTextField24;
    }

    public void setCustFreeTextField24(String custFreeTextField24) {
        this.custFreeTextField24 = custFreeTextField24;
    }

    public AccountDetails custFreeTextField24(String custFreeTextField24) {
        this.setCustFreeTextField24(custFreeTextField24);
        return this;
    }

    public String getCustFreeTextField25() {
        return this.custFreeTextField25;
    }

    public void setCustFreeTextField25(String custFreeTextField25) {
        this.custFreeTextField25 = custFreeTextField25;
    }

    public AccountDetails custFreeTextField25(String custFreeTextField25) {
        this.setCustFreeTextField25(custFreeTextField25);
        return this;
    }

    public String getCustFreeTextField26() {
        return this.custFreeTextField26;
    }

    public void setCustFreeTextField26(String custFreeTextField26) {
        this.custFreeTextField26 = custFreeTextField26;
    }

    public AccountDetails custFreeTextField26(String custFreeTextField26) {
        this.setCustFreeTextField26(custFreeTextField26);
        return this;
    }

    public String getCustFreeTextField27() {
        return this.custFreeTextField27;
    }

    public void setCustFreeTextField27(String custFreeTextField27) {
        this.custFreeTextField27 = custFreeTextField27;
    }

    public AccountDetails custFreeTextField27(String custFreeTextField27) {
        this.setCustFreeTextField27(custFreeTextField27);
        return this;
    }

    public String getCustFreeTextField28() {
        return this.custFreeTextField28;
    }

    public void setCustFreeTextField28(String custFreeTextField28) {
        this.custFreeTextField28 = custFreeTextField28;
    }

    public AccountDetails custFreeTextField28(String custFreeTextField28) {
        this.setCustFreeTextField28(custFreeTextField28);
        return this;
    }

    public String getCustFreeTextField29() {
        return this.custFreeTextField29;
    }

    public void setCustFreeTextField29(String custFreeTextField29) {
        this.custFreeTextField29 = custFreeTextField29;
    }

    public AccountDetails custFreeTextField29(String custFreeTextField29) {
        this.setCustFreeTextField29(custFreeTextField29);
        return this;
    }

    public String getCustFreeTextField30() {
        return this.custFreeTextField30;
    }

    public void setCustFreeTextField30(String custFreeTextField30) {
        this.custFreeTextField30 = custFreeTextField30;
    }

    public AccountDetails custFreeTextField30(String custFreeTextField30) {
        this.setCustFreeTextField30(custFreeTextField30);
        return this;
    }

    public String getCustFreeTextField31() {
        return this.custFreeTextField31;
    }

    public void setCustFreeTextField31(String custFreeTextField31) {
        this.custFreeTextField31 = custFreeTextField31;
    }

    public AccountDetails custFreeTextField31(String custFreeTextField31) {
        this.setCustFreeTextField31(custFreeTextField31);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccountDetails)) {
            return false;
        }
        return id != null && id.equals(((AccountDetails) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "AccountDetails{" +
            "id=" + getId() +
            ", accountCurrency='" + getAccountCurrency() + "'" +
            ", accountNumber='" + getAccountNumber() + "'" +
            ", accountStatus='" + getAccountStatus() + "'" +
            ", accountLifecycleStatusCode='" + getAccountLifecycleStatusCode() + "'" +
            ", accrualStatusCode='" + getAccrualStatusCode() + "'" +
            ", casaAccountStatus='" + getCasaAccountStatus() + "'" +
            ", minorAccountStatusCode='" + getMinorAccountStatusCode() + "'" +
            ", accountTitle='" + getAccountTitle() + "'" +
            ", advanceAgainstUnclearedFunds=" + getAdvanceAgainstUnclearedFunds() +
            ", adHocStatementFlag='" + getAdHocStatementFlag() + "'" +
            ", additionalAddressFlag='" + getAdditionalAddressFlag() + "'" +
            ", atmFacilityFlag='" + getAtmFacilityFlag() + "'" +
            ", checkReorderThresholdNumber=" + getCheckReorderThresholdNumber() +
            ", deferredStmtGenerationDayOfMonth=" + getDeferredStmtGenerationDayOfMonth() +
            ", generateRateChangeIntimationFlag='" + getGenerateRateChangeIntimationFlag() + "'" +
            ", groupBonusInteresFlag='" + getGroupBonusInteresFlag() + "'" +
            ", holdMailFlag='" + getHoldMailFlag() + "'" +
            ", interestWaiverFlag='" + getInterestWaiverFlag() + "'" +
            ", internetBankingAccessFlag='" + getInternetBankingAccessFlag() + "'" +
            ", inwardDirectDebitAuthorizationFlag='" + getInwardDirectDebitAuthorizationFlag() + "'" +
            ", jointAccountFlag='" + getJointAccountFlag() + "'" +
            ", leadDaysIntimation='" + getLeadDaysIntimation() + "'" +
            ", mailAddressControlFlag='" + getMailAddressControlFlag() + "'" +
            ", mobileFacilityFlag='" + getMobileFacilityFlag() + "'" +
            ", numberOfCheckWithdrawals=" + getNumberOfCheckWithdrawals() +
            ", numberOfPastDueChecks=" + getNumberOfPastDueChecks() +
            ", numberOfStatementCopies=" + getNumberOfStatementCopies() +
            ", overdraftLimitAmount=" + getOverdraftLimitAmount() +
            ", pointOfSaleFacilityFlag='" + getPointOfSaleFacilityFlag() + "'" +
            ", standingInstructionFlag='" + getStandingInstructionFlag() + "'" +
            ", sweepoutInstructionFlag='" + getSweepoutInstructionFlag() + "'" +
            ", availableBalance=" + getAvailableBalance() +
            ", branchCode=" + getBranchCode() +
            ", branchName='" + getBranchName() + "'" +
            ", branchShortName='" + getBranchShortName() + "'" +
            ", creditsMonthTillDateAmount=" + getCreditsMonthTillDateAmount() +
            ", currentBalance=" + getCurrentBalance() +
            ", customerNumber='" + getCustomerNumber() + "'" +
            ", isAbsaCustomer='" + getIsAbsaCustomer() + "'" +
            ", fullName='" + getFullName() + "'" +
            ", accountOpeningDate='" + getAccountOpeningDate() + "'" +
            ", statementPeriodStartDate='" + getStatementPeriodStartDate() + "'" +
            ", statementPeriodEndDate='" + getStatementPeriodEndDate() + "'" +
            ", debitsLastDate='" + getDebitsLastDate() + "'" +
            ", creditLastDate='" + getCreditLastDate() + "'" +
            ", debitsMonthTillDateAmount='" + getDebitsMonthTillDateAmount() + "'" +
            ", debitsYearTillDateAmount=" + getDebitsYearTillDateAmount() +
            ", creditInterestAccruedAmount=" + getCreditInterestAccruedAmount() +
            ", debitInterestAccruedAmount=" + getDebitInterestAccruedAmount() +
            ", adjustedCreditInterestAccrued=" + getAdjustedCreditInterestAccrued() +
            ", adjustedDebitInterestAccrued=" + getAdjustedDebitInterestAccrued() +
            ", projectedTaxOnAccruedInterestAmount=" + getProjectedTaxOnAccruedInterestAmount() +
            ", interestAccruedInCurrentFinancialYear=" + getInterestAccruedInCurrentFinancialYear() +
            ", issuedInventoryPropertyType='" + getIssuedInventoryPropertyType() + "'" +
            ", lastIssuedCheckNumber=" + getLastIssuedCheckNumber() +
            ", languageCode='" + getLanguageCode() + "'" +
            ", lineNumber=" + getLineNumber() +
            ", minimumRequiredBalanceAmount=" + getMinimumRequiredBalanceAmount() +
            ", minimumRequiredTradingBalanceAmount=" + getMinimumRequiredTradingBalanceAmount() +
            ", mtdCreditsCount=" + getMtdCreditsCount() +
            ", mtdDebitsCount=" + getMtdDebitsCount() +
            ", netAvailableBalanceForWithdrawal=" + getNetAvailableBalanceForWithdrawal() +
            ", netBalanceAmount=" + getNetBalanceAmount() +
            ", passbookLifecycleStatusCode=" + getPassbookLifecycleStatusCode() +
            ", periodicAverageBalanceAmount=" + getPeriodicAverageBalanceAmount() +
            ", previousDayClosingBookBalance=" + getPreviousDayClosingBookBalance() +
            ", productCode=" + getProductCode() +
            ", productName='" + getProductName() + "'" +
            ", restrictedAccountFlag='" + getRestrictedAccountFlag() + "'" +
            ", staffFlag='" + getStaffFlag() + "'" +
            ", sweepinAmountOnLien=" + getSweepinAmountOnLien() +
            ", taxCode1=" + getTaxCode1() +
            ", taxCode2=" + getTaxCode2() +
            ", tdsExemptionLimitAmount1=" + getTdsExemptionLimitAmount1() +
            ", tdsExemptionLimitAmount2=" + getTdsExemptionLimitAmount2() +
            ", totalCASAHoldAmount=" + getTotalCASAHoldAmount() +
            ", totalUnclearFundAmount=" + getTotalUnclearFundAmount() +
            ", ytdCreditLastAmount=" + getYtdCreditLastAmount() +
            ", ytdCreditsCount=" + getYtdCreditsCount() +
            ", ytdDebitsCount=" + getYtdDebitsCount() +
            ", ytdDebitsLastAmount=" + getYtdDebitsLastAmount() +
            ", message='" + getMessage() + "'" +
            ", sourceInfo='" + getSourceInfo() + "'" +
            ", status='" + getStatus() + "'" +
            ", custFreeTextField1='" + getCustFreeTextField1() + "'" +
            ", custFreeTextField2='" + getCustFreeTextField2() + "'" +
            ", custFreeTextField3='" + getCustFreeTextField3() + "'" +
            ", custFreeTextField4='" + getCustFreeTextField4() + "'" +
            ", custFreeTextField5='" + getCustFreeTextField5() + "'" +
            ", custFreeTextField6='" + getCustFreeTextField6() + "'" +
            ", custFreeTextField7='" + getCustFreeTextField7() + "'" +
            ", custFreeTextField8='" + getCustFreeTextField8() + "'" +
            ", custFreeTextField9='" + getCustFreeTextField9() + "'" +
            ", custFreeTextField10='" + getCustFreeTextField10() + "'" +
            ", custFreeTextField11='" + getCustFreeTextField11() + "'" +
            ", custFreeTextField12='" + getCustFreeTextField12() + "'" +
            ", custFreeTextField13='" + getCustFreeTextField13() + "'" +
            ", custFreeTextField14='" + getCustFreeTextField14() + "'" +
            ", custFreeTextField15='" + getCustFreeTextField15() + "'" +
            ", custFreeTextField16='" + getCustFreeTextField16() + "'" +
            ", custFreeTextField17='" + getCustFreeTextField17() + "'" +
            ", custFreeTextField18='" + getCustFreeTextField18() + "'" +
            ", custFreeTextField19='" + getCustFreeTextField19() + "'" +
            ", custFreeTextField20='" + getCustFreeTextField20() + "'" +
            ", custFreeTextField21='" + getCustFreeTextField21() + "'" +
            ", custFreeTextField22='" + getCustFreeTextField22() + "'" +
            ", custFreeTextField23='" + getCustFreeTextField23() + "'" +
            ", custFreeTextField24='" + getCustFreeTextField24() + "'" +
            ", custFreeTextField25='" + getCustFreeTextField25() + "'" +
            ", custFreeTextField26='" + getCustFreeTextField26() + "'" +
            ", custFreeTextField27='" + getCustFreeTextField27() + "'" +
            ", custFreeTextField28='" + getCustFreeTextField28() + "'" +
            ", custFreeTextField29='" + getCustFreeTextField29() + "'" +
            ", custFreeTextField30='" + getCustFreeTextField30() + "'" +
            ", custFreeTextField31='" + getCustFreeTextField31() + "'" +
            "}";
    }
}
