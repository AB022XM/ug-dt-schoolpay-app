package ug.co.absa.africa.schoolpay.domain;

import org.mapstruct.*;
import ug.co.absa.africa.schoolpay.domain.dto.TransactionsDto;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface TransactionsMapper {
    Transactions toEntity(TransactionsDto transactionsDto);

    TransactionsDto toDto(Transactions transactions);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Transactions partialUpdate(TransactionsDto transactionsDto, @MappingTarget Transactions transactions);
}
