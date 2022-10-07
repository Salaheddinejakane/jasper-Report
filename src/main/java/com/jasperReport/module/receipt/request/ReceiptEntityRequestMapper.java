package com.jasperReport.module.receipt.request;

import com.jasperReport.common.Mapper.BaseMapper;
import com.jasperReport.module.receipt.entity.Receipt;
import com.jasperReport.module.receipt.dto.ReceiptEntityRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ReceiptEntityRequestMapper extends BaseMapper<Receipt, ReceiptEntityRequest> {
}
