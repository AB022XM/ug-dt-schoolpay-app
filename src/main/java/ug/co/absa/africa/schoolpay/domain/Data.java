package ug.co.absa.africa.schoolpay.domain;

public class Data {

    private String recordId;
    private String timestamp;

    private String amount;

    private String settlementReference;

    private Boolean Completed;

    /**
     * get field
     *
     * @return recordId
     */
    public String getRecordId() {
        return this.recordId;
    }

    /**
     * set field
     *
     * @param recordId
     */
    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    /**
     * get field
     *
     * @return timestamp
     */
    public String getTimestamp() {
        return this.timestamp;
    }

    /**
     * set field
     *
     * @param timestamp
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * get field
     *
     * @return amount
     */
    public String getAmount() {
        return this.amount;
    }

    /**
     * set field
     *
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * get field
     *
     * @return settlementReference
     */
    public String getSettlementReference() {
        return this.settlementReference;
    }

    /**
     * set field
     *
     * @param settlementReference
     */
    public void setSettlementReference(String settlementReference) {
        this.settlementReference = settlementReference;
    }

    /**
     * get field
     *
     * @return Completed
     */
    public Boolean getCompleted() {
        return this.Completed;
    }

    /**
     * set field
     *
     * @param Completed
     */
    public void setCompleted(Boolean Completed) {
        this.Completed = Completed;
    }
}
