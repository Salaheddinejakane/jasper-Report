package com.jasperReport.module.entreprise.request;

import com.jasperReport.common.Mapper.BaseMapper;
import com.jasperReport.module.entreprise.dto.EntrepriseRequest;
import com.jasperReport.module.entreprise.entity.Entreprise;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EntrepriseRequestMapper extends BaseMapper<Entreprise, EntrepriseRequest> {
}
