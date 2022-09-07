package com.jasperReport.module.order.request;

import com.jasperReport.common.Mapper.BaseMapper;
import com.jasperReport.module.order.entity.OrderEntity;
import com.jasperReport.module.order.dto.OrderEntityRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderEntityRequestMapper extends BaseMapper<OrderEntity, OrderEntityRequest> {
}
