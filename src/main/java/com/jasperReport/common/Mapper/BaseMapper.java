package com.jasperReport.common.Mapper;


import java.util.List;

public interface BaseMapper<S, T>{
    T sourceToTarget(S source);

    S targetToSource(T target);

    List<T> sourceListToTargetList(List<S> sources);

    List<S> targetListToSourceList(List<T> targets);
}
