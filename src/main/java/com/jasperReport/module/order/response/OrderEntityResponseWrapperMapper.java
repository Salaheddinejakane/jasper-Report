package com.jasperReport.module.order.response;

import com.jasperReport.common.Mapper.BaseMapper;
import com.jasperReport.module.order.entity.OrderEntity;
import com.jasperReport.module.order.dto.OrderEntityResponseWrapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {OrderEntityResponseWrapperMapper.class})
public interface OrderEntityResponseWrapperMapper extends BaseMapper<OrderEntity, OrderEntityResponseWrapper> {
}
