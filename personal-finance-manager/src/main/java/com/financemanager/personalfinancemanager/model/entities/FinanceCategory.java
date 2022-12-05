package com.financemanager.personalfinancemanager.model.entities;

import java.time.LocalDate;

import com.financemanager.personalfinancemanager.model.enums.FinanceGroup;
import com.financemanager.personalfinancemanager.model.utilities.FinanceCategoryType;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "finance_category")
public class FinanceCategory {

    @Id
    private Integer id;
    private Double value;
    private LocalDate dateEntry;
    private LocalDate dateExpected;
    private String description;
    @ManyToOne
    private FinanceCategoryType type;
    @ManyToOne
    private Account account;
    @ManyToOne
    private FinanceGroup financeGroup;
}
