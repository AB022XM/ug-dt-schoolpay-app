package ug.co.absa.africa.schoolpay.domain.AmolDomain.Requests.GLTOCASA;

public class AmolPostGLTOCASA {

    public PaymentTransaction paymentTransaction;

    public AmolPostGLTOCASA() {}

    public PaymentTransaction getPaymentTransaction() {
        return paymentTransaction;
    }

    public void setPaymentTransaction(PaymentTransaction paymentTransaction) {
        this.paymentTransaction = paymentTransaction;
    }
}
