package com.jasperReport.module.vacance.request;

import com.jasperReport.common.Mapper.BaseMapper;
import com.jasperReport.module.entreprise.entity.Entreprise;
import com.jasperReport.module.vacance.dto.VacanceRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VacanceRequestMapper extends BaseMapper<Entreprise, VacanceRequest> {
}
