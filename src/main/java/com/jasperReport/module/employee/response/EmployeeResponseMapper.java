package com.jasperReport.module.employee.response;

import com.jasperReport.common.Mapper.BaseMapper;
import com.jasperReport.module.employee.dto.EmployeeResponse;
import com.jasperReport.module.employee.entity.Employee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeResponseMapper extends BaseMapper<Employee, EmployeeResponse> {
}
