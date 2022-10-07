package com.jasperReport.module.receiptItem.response;

import com.jasperReport.common.Mapper.BaseMapper;
import com.jasperReport.module.receiptItem.dto.ReceiptItemResponse;
import com.jasperReport.module.receiptItem.entity.ReceiptItem;
import com.jasperReport.module.receipt.response.OrderEntityResponseWrapperMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {OrderEntityResponseWrapperMapper.class})
public interface ReceiptItemResponseMapper extends BaseMapper<ReceiptItem, ReceiptItemResponse> {
}
