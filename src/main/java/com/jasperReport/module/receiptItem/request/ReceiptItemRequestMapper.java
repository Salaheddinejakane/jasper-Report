package com.jasperReport.module.receiptItem.request;

import com.jasperReport.common.Mapper.BaseMapper;
import com.jasperReport.module.receiptItem.dto.ReceiptItemRequest;
import com.jasperReport.module.receiptItem.entity.ReceiptItem;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ReceiptItemRequestMapper extends BaseMapper<ReceiptItem, ReceiptItemRequest> {
}
