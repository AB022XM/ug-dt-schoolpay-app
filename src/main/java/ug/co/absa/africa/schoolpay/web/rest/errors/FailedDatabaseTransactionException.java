package ug.co.absa.africa.schoolpay.web.rest.errors;

import org.springframework.http.HttpStatusCode;
import org.springframework.web.ErrorResponseException;

public class FailedDatabaseTransactionException extends ErrorResponseException {

    private String message;

    public FailedDatabaseTransactionException(HttpStatusCode status, Throwable cause) {
        super(status, cause);
    }

    public FailedDatabaseTransactionException(HttpStatusCode status, String message) {
        super(status);
        this.message = message;
    }
}
