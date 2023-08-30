package ug.co.absa.africa.schoolpay.domain.AmolDomain.Requests.CASATOCASA;

import org.springframework.http.HttpEntity;
import ug.co.absa.africa.schoolpay.domain.AmolDomain.Responses.CASATOCASA.AmolResponse;

public class ResponseDetails {

    AmolResponse amolResponse;
    HttpEntity<String> request;

    public ResponseDetails(AmolResponse amolResponse, HttpEntity<String> request) {
        this.amolResponse = amolResponse;
        this.request = request;
    }

    public AmolResponse getAmolResponse() {
        return amolResponse;
    }

    public void setAmolResponse(AmolResponse amolResponse) {
        this.amolResponse = amolResponse;
    }

    public HttpEntity<String> getRequest() {
        return request;
    }

    public void setRequest(HttpEntity<String> request) {
        this.request = request;
    }
}
