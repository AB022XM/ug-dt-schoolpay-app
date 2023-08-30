package ug.co.absa.africa.schoolpay.domain.response;

import java.io.Serializable;
import java.util.Objects;
import ug.co.absa.africa.schoolpay.domain.Data;

public class Response implements Serializable {

    private final String responseCode;
    private final String responseMessage;

    private final Data data;

    public Response(String responseCode, String responseMessage) {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        this.data = null;
    }

    public Response(String responseCode, String responseMessage, Data data) {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        this.data = data;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Response entity = (Response) o;
        return Objects.equals(this.responseCode, entity.responseCode) && Objects.equals(this.responseMessage, entity.responseMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(responseCode, responseMessage);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + "responseCode = " + responseCode + ", " + "responseMessage = " + responseMessage + ")";
    }
}
