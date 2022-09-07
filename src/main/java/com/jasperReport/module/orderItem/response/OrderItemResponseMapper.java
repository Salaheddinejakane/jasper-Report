package com.jasperReport.module.orderItem.response;

import com.jasperReport.common.Mapper.BaseMapper;
import com.jasperReport.module.orderItem.dto.OrderItemResponse;
import com.jasperReport.module.orderItem.entity.OrderItem;
import com.jasperReport.module.order.response.OrderEntityResponseWrapperMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {OrderEntityResponseWrapperMapper.class})
public interface OrderItemResponseMapper extends BaseMapper<OrderItem, OrderItemResponse> {
}
