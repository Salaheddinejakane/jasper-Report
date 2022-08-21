package com.jasperReport.module.employee.response;

import com.jasperReport.common.Mapper.BaseMapper;
import com.jasperReport.module.employee.entity.Employee;
import com.jasperReport.module.employee.dto.EmployeeResponseWrapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {EmployeeResponseWrapperMapper.class})
public interface EmployeeResponseWrapperMapper extends BaseMapper<Employee, EmployeeResponseWrapper> {
}
