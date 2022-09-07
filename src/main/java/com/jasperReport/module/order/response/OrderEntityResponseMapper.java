package com.jasperReport.module.order.response;

import com.jasperReport.common.Mapper.BaseMapper;
import com.jasperReport.module.order.dto.OrderEntityResponse;
import com.jasperReport.module.order.entity.OrderEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderEntityResponseMapper extends BaseMapper<OrderEntity, OrderEntityResponse> {
}
