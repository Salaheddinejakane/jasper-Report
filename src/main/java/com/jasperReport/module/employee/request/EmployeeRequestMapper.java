package com.jasperReport.module.employee.request;

import com.jasperReport.common.Mapper.BaseMapper;
import com.jasperReport.module.employee.entity.Employee;
import com.jasperReport.module.employee.dto.EmployeeRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeRequestMapper extends BaseMapper<Employee, EmployeeRequest> {
}
