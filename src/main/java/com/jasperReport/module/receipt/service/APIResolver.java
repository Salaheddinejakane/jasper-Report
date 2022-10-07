package com.jasperReport.module.receipt.service;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.io.*;
import java.util.Base64;


@Component
public class APIResolver {
    
    static ReportService reportService;

// Image conversion

    public String getBase64String() throws Exception {
        InputStream stream  = reportService.getClass().getResource("C:/Users/J.SaLahEddine/Desktop/Bon Commande/jasper-Report/src/main/resources/images/Vector (1).svg").openStream();

        byte[] bytes = IOUtils.toByteArray(stream);
        String encodedString = Base64.getEncoder().encodeToString(bytes);

        return encodedString;

    }
}
