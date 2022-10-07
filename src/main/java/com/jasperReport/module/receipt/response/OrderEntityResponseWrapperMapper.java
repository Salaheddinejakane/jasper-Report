package com.jasperReport.module.receipt.response;

import com.jasperReport.common.Mapper.BaseMapper;
import com.jasperReport.module.receipt.dto.ReceiptEntityResponseWrapper;
import com.jasperReport.module.receipt.entity.Receipt;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {OrderEntityResponseWrapperMapper.class})
public interface OrderEntityResponseWrapperMapper extends BaseMapper<Receipt, ReceiptEntityResponseWrapper> {
}
