package com.financemanager.personalfinancemanager.model.entities;

import java.time.LocalDate;

import com.financemanager.personalfinancemanager.model.enums.FinanceGroup;
import com.financemanager.personalfinancemanager.model.utilities.FinanceCategoryType;

public class FinanceCategory {
    
    //#region Attributes
    private Integer id;

    private Double value;

    private LocalDate dateEntry;

    private LocalDate dateExpected;

    private String description;

    private FinanceCategoryType type;

    private Account account;

    private FinanceGroup financeGroup;
    //#endregion

    //#region getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public LocalDate getDateEntry() {
        return dateEntry;
    }

    public void setDateEntry(LocalDate dateEntry) {
        this.dateEntry = dateEntry;
    }

    public LocalDate getDateExpected() {
        return dateExpected;
    }

    public void setDateExpected(LocalDate dateExpected) {
        this.dateExpected = dateExpected;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FinanceCategoryType getType() {
        return type;
    }

    public void setType(FinanceCategoryType type) {
        this.type = type;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public FinanceGroup getFinanceGroup() {
        return financeGroup;
    }

    public void setFinanceGroup(FinanceGroup financeGroup) {
        this.financeGroup = financeGroup;
    }
//#endregion
    

}
