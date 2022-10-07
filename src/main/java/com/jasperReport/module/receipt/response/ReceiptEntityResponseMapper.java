package com.jasperReport.module.receipt.response;

import com.jasperReport.common.Mapper.BaseMapper;
import com.jasperReport.module.receipt.dto.ReceiptEntityResponse;
import com.jasperReport.module.receipt.entity.Receipt;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ReceiptEntityResponseMapper extends BaseMapper<Receipt, ReceiptEntityResponse> {
}
