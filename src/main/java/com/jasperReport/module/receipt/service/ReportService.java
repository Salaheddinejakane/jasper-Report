package com.jasperReport.module.receipt.service;


import com.jasperReport.module.receipt.repository.ReceiptEntityRepository;


import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.InputStream;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;

@Service
public class ReportService {
    private final ResourceLoader resourceLoader;

    @Autowired
    private ReceiptEntityRepository repository;

    public ReportService(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }


    public String exportReport(String reportFormat) throws Exception {

        HashMap<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("logo", getBase64String());
        String path = "C:\\Users\\J.SaLahEddine\\Desktop\\Report";
        //load file and compile it
        File file = ResourceUtils.getFile("classpath:Receipt.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(Collections.singleton( repository.findById(1L).get()));

        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        if (reportFormat.equalsIgnoreCase("html")) {
            JasperExportManager.exportReportToHtmlFile(jasperPrint, path + "\\Receipts.html");
        }
        if (reportFormat.equalsIgnoreCase("pdf")) {
            JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\Receipts.pdf");
        }

        return "report generated in path : " + path;
    }




    public  String getBase64String() throws Exception {
        InputStream file = this.resourceLoader.getResource("classpath:" + "/images/Vector (1).jpg").getInputStream();


        String encodedString = Base64.getEncoder().encodeToString(IOUtils.toByteArray(file ));

        return encodedString;

    }
}
