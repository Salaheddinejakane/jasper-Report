package com.jasperReport.module.orderItem.request;

import com.jasperReport.common.Mapper.BaseMapper;
import com.jasperReport.module.orderItem.dto.OrderItemRequest;
import com.jasperReport.module.orderItem.entity.OrderItem;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderItemRequestMapper extends BaseMapper<OrderItem, OrderItemRequest> {
}
