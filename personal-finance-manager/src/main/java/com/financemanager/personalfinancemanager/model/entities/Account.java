package com.financemanager.personalfinancemanager.model.entities;

import com.financemanager.personalfinancemanager.model.utilities.AccountType;

public class Account {
    
    //#region Attributes
    private Integer id;

    private Integer number;

    private AccountType type;

    private Double balance;

    private FinanceInstitution financeInstitution;
    //#endregion

    //#region getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public FinanceInstitution getFinanceInstitution() {
        return financeInstitution;
    }

    public void setFinanceInstitution(FinanceInstitution financeInstitution) {
       this.financeInstitution = financeInstitution;
    }
    //#endregion
    
}
