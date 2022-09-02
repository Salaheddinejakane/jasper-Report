package com.jasperReport.module.vacance.response;

import com.jasperReport.common.Mapper.BaseMapper;
import com.jasperReport.module.employee.response.EmployeeResponseWrapperMapper;
import com.jasperReport.module.entreprise.entity.Entreprise;
import com.jasperReport.module.vacance.dto.VacanceResponseWrapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {EmployeeResponseWrapperMapper.class})
public interface VacanceResponseWrapperMapper extends BaseMapper<Entreprise, VacanceResponseWrapper> {
}
