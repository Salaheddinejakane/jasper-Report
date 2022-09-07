package com.jasperReport.module.orderItem.response;

import com.jasperReport.common.Mapper.BaseMapper;
import com.jasperReport.module.orderItem.dto.OrderItemResponseWrapper;
import com.jasperReport.module.orderItem.entity.OrderItem;
import com.jasperReport.module.order.response.OrderEntityResponseWrapperMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {OrderEntityResponseWrapperMapper.class})
public interface OrderItemResponseWrapperMapper extends BaseMapper<OrderItem, OrderItemResponseWrapper> {
}
