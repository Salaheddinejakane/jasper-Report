package com.jasperReport.module.entreprise.response;

import com.jasperReport.common.Mapper.BaseMapper;
import com.jasperReport.module.entreprise.dto.EntrepriseResponseWrapper;
import com.jasperReport.module.entreprise.entity.Entreprise;
import com.jasperReport.module.employee.response.EmployeeResponseWrapperMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {EmployeeResponseWrapperMapper.class})
public interface EntrepriseResponseWrapperMapper extends BaseMapper<Entreprise, EntrepriseResponseWrapper> {
}
