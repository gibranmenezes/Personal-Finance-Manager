package com.financemanager.personalfinancemanager.converters;

import com.financemanager.personalfinancemanager.model.enums.FinanceGroup;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

/**
 * FinanceGroupConverter
 */
@Converter(autoApply = true)
public class FinanceGroupConverter implements AttributeConverter<FinanceGroup, String> {

	@Override
	public String convertToDatabaseColumn(FinanceGroup attribute) {
		return attribute != null ? attribute.toString() : null;
	}

	@Override
	public FinanceGroup convertToEntityAttribute(String dbData) {
		return dbData != null ? FinanceGroup.valueOf(dbData) : null;
	}
}