package ug.co.absa.africa.schoolpay.domain.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Objects;
import java.util.UUID;

/**
 * DTO for {@link ug.co.absa.africa.schoolpay.domain.Transactions}
 */
public class TransactionsDto implements Serializable {

    @NotNull(message = "Record id can not be null")
    private final UUID recordId;

    @NotNull
    private final String serviceLevel;

    @NotNull(message = "Invalid timestamp")
    private final ZonedDateTime timestamp;

    @NotNull
    @Size(message = "Invalid Partner Code", min = 5, max = 10)
    @NotEmpty(message = "Partner Code can not be empty")
    @NotBlank(message = "Partner Code can not be empty")
    private final String partnerCode;

    @NotNull
    @Size(message = "Amount must be 5000 to 5m ", min = 5000, max = 5000000)
    @NotEmpty(message = "Amount can not be empty")
    @NotBlank(message = "Amount can not be empty")
    private final String amount;

    @NotNull
    private final String currency;

    @NotNull
    private final String receiverBankCode;

    @NotNull
    private final String receiverAccountNumber;

    private final String beneficiaryName;

    @NotNull
    private final String instructionId;

    @NotNull
    private final String senderToReceiverInfo;

    public TransactionsDto(
        UUID recordId,
        String serviceLevel,
        ZonedDateTime timestamp,
        String partnerCode,
        String amount,
        String currency,
        String receiverBankCode,
        String receiverAccountNumber,
        String beneficiaryName,
        String instructionId,
        String senderToReceiverInfo
    ) {
        this.recordId = recordId;
        this.serviceLevel = serviceLevel;
        this.timestamp = timestamp;
        this.partnerCode = partnerCode;
        this.amount = amount;
        this.currency = currency;
        this.receiverBankCode = receiverBankCode;
        this.receiverAccountNumber = receiverAccountNumber;
        this.beneficiaryName = beneficiaryName;
        this.instructionId = instructionId;
        this.senderToReceiverInfo = senderToReceiverInfo;
    }

    public UUID getRecordId() {
        return recordId;
    }

    public String getServiceLevel() {
        return serviceLevel;
    }

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }

    public String getPartnerCode() {
        return partnerCode;
    }

    public String getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public String getReceiverBankCode() {
        return receiverBankCode;
    }

    public String getReceiverAccountNumber() {
        return receiverAccountNumber;
    }

    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    public String getInstructionId() {
        return instructionId;
    }

    public String getSenderToReceiverInfo() {
        return senderToReceiverInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransactionsDto entity = (TransactionsDto) o;
        return (
            Objects.equals(this.recordId, entity.recordId) &&
            Objects.equals(this.serviceLevel, entity.serviceLevel) &&
            Objects.equals(this.timestamp, entity.timestamp) &&
            Objects.equals(this.partnerCode, entity.partnerCode) &&
            Objects.equals(this.amount, entity.amount) &&
            Objects.equals(this.currency, entity.currency) &&
            Objects.equals(this.receiverBankCode, entity.receiverBankCode) &&
            Objects.equals(this.receiverAccountNumber, entity.receiverAccountNumber) &&
            Objects.equals(this.beneficiaryName, entity.beneficiaryName) &&
            Objects.equals(this.instructionId, entity.instructionId) &&
            Objects.equals(this.senderToReceiverInfo, entity.senderToReceiverInfo)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            recordId,
            serviceLevel,
            timestamp,
            partnerCode,
            amount,
            currency,
            receiverBankCode,
            receiverAccountNumber,
            beneficiaryName,
            instructionId,
            senderToReceiverInfo
        );
    }

    @Override
    public String toString() {
        return (
            getClass().getSimpleName() +
            "(" +
            "recordId = " +
            recordId +
            ", " +
            "serviceLevel = " +
            serviceLevel +
            ", " +
            "timestamp = " +
            timestamp +
            ", " +
            "partnerCode = " +
            partnerCode +
            ", " +
            "amount = " +
            amount +
            ", " +
            "currency = " +
            currency +
            ", " +
            "receiverBankCode = " +
            receiverBankCode +
            ", " +
            "receiverAccountNumber = " +
            receiverAccountNumber +
            ", " +
            "beneficiaryName = " +
            beneficiaryName +
            ", " +
            "instructionId = " +
            instructionId +
            ", " +
            "senderToReceiverInfo = " +
            senderToReceiverInfo +
            ")"
        );
    }
}
