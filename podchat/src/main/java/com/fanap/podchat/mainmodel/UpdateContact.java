package com.fanap.podchat.mainmodel;

import com.fanap.podchat.model.ResultContacts;

import java.util.List;

public class UpdateContact  {
    private Boolean hasError;
    private String referenceNumber;
    private String message;
    private Integer errorCode;
    private Integer count;
    private String ott;
    private List<ResultContacts> result ;

    public Boolean getHasError() {
        return hasError;
    }

    public void setHasError(Boolean hasError) {
        this.hasError = hasError;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getOtt() {
        return ott;
    }

    public void setOtt(String ott) {
        this.ott = ott;
    }

    public List<ResultContacts> getResult() {
        return result;
    }

    public void setResult(List<ResultContacts> result) {
        this.result = result;
    }
}
