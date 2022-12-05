package com.financemanager.personalfinancemanager.model.entities;

import java.time.LocalDate;

import com.financemanager.personalfinancemanager.model.enums.FinanceGroup;
import com.financemanager.personalfinancemanager.model.utilities.FinanceCategoryType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "finance_category")
public class FinanceCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Double value;
    private LocalDate dateEntry;
    private LocalDate dateExpected;
    private String description;
    @ManyToOne
    private FinanceCategoryType type;
    @ManyToOne
    private Account account;
    @Enumerated(EnumType.STRING)
    private FinanceGroup financeGroup;
}
