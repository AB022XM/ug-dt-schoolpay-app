package ug.co.absa.africa.schoolpay.domain.AmolDomain.Requests.GLTOCASA;

public class PayeeDetails {

    public String payeeProductInstanceReference;

    public PayeeDetails() {}

    public PayeeDetails(String creditAccount) {}

    public String getPayeeProductInstanceReference() {
        return payeeProductInstanceReference;
    }

    public void setPayeeProductInstanceReference(String payeeProductInstanceReference) {
        this.payeeProductInstanceReference = payeeProductInstanceReference;
    }
}
