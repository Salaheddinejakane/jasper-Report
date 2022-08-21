package com.jasperReport.module.conge.request;

import com.jasperReport.common.Mapper.BaseMapper;
import com.jasperReport.module.conge.dto.CongeRequest;
import com.jasperReport.module.conge.entity.Conge;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CongeRequestMapper extends BaseMapper<Conge, CongeRequest> {
}
