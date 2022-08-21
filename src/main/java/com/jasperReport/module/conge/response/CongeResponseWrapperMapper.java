package com.jasperReport.module.conge.response;

import com.jasperReport.common.Mapper.BaseMapper;
import com.jasperReport.module.conge.dto.CongeResponseWrapper;
import com.jasperReport.module.conge.entity.Conge;
import com.jasperReport.module.employee.response.EmployeeResponseWrapperMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {EmployeeResponseWrapperMapper.class})
public interface CongeResponseWrapperMapper extends BaseMapper<Conge, CongeResponseWrapper> {
}
