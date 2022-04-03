package br.com.safra.entities;

public class Investment {
    String type;
    Long custumerId;
    Integer minInvestMonths;
    Double totalAmount;
    Double actualInterestRate;
    Double safraInterestRate;

    
    public Investment() {
    }
    
    public Investment(String type, Long custumerId, Integer minInvestMonths, Double totalAmount, Double actualInterestRate,
    Double safraInterestRate) {
        this.type = type;
        this.minInvestMonths = minInvestMonths;
        this.totalAmount = totalAmount;
        this.actualInterestRate = actualInterestRate;
        this.safraInterestRate = safraInterestRate;
    }
    
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Long getCustumerId() {
        return custumerId;
    }
    public void setCustumerId(Long custumerId) {
        this.custumerId = custumerId;
    }
    public Integer getMinInvestMonths() {
        return minInvestMonths;
    }
    public void setMinInvestMonths(Integer minInvestMonths) {
        this.minInvestMonths = minInvestMonths;
    }
    public Double getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }
    public Double getActualInterestRate() {
        return actualInterestRate;
    }
    public void setActualInterestRate(Double actualInterestRate) {
        this.actualInterestRate = actualInterestRate;
    }
    public Double getSafraInterestRate() {
        return safraInterestRate;
    }
    public void setSafraInterestRate(Double safraInterestRate) {
        this.safraInterestRate = safraInterestRate;
    }
}
