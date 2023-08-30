package ug.co.absa.africa.schoolpay.domain.AmolDomain.Responses.CASATOCASA;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {

    String transferId;
    String transferReferenceId;
    String transferStatus;

    @JsonProperty("transferId")
    public String getTransferId() {
        return this.transferId;
    }

    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }

    @JsonProperty("transferReferenceId")
    public String getTransferReferenceId() {
        return this.transferReferenceId;
    }

    public void setTransferReferenceId(String transferReferenceId) {
        this.transferReferenceId = transferReferenceId;
    }

    @JsonProperty("transferStatus")
    public String getTransferStatus() {
        return this.transferStatus;
    }

    public void setTransferStatus(String transferStatus) {
        this.transferStatus = transferStatus;
    }
}
