package com.financemanager.personalfinancemanager.model.entities;

import com.financemanager.personalfinancemanager.model.utilities.AccountType;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "account")
public class Account {
    
    @Id
    private Integer id;
    private Integer number;
    @ManyToOne
    private AccountType type;
    private Double balance;
    @ManyToOne
    private FinanceInstitution financeInstitution;
}
