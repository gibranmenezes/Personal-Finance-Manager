package com.financemanager.personalfinancemanager.model.utilities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "account_type")
public class AccountType {

    @Id
    private Integer id;
    private String type;
}
