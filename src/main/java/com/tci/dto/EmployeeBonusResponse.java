package com.tci.dto;

import java.util.List;

public class EmployeeBonusResponse {
    private String errorMessage;
    private List<CurrencyData> data;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public List<CurrencyData> getData() {
        return data;
    }

    public void setData(List<CurrencyData> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "EmployeeBonusResponse{" +
                "errorMessage='" + errorMessage + '\'' +
                ", data=" + data +
                '}';
    }
}
