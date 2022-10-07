package com.jasperReport.module.receipt.service;


import com.jasperReport.module.receipt.repository.ReceiptEntityRepository;


import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import javax.xml.bind.DatatypeConverter;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Service
public class ReportService {

    @Autowired
    private ReceiptEntityRepository repository;




    public String exportReport(String reportFormat) throws FileNotFoundException, JRException {
        String path = "C:\\Users\\J.SaLahEddine\\Desktop\\Report";
        //load file and compile it
        File file = ResourceUtils.getFile("classpath:Receipt.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(Collections.singleton( repository.findById(1L).get()));
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("createdBy", "Binarios-it");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        if (reportFormat.equalsIgnoreCase("html")) {
            JasperExportManager.exportReportToHtmlFile(jasperPrint, path + "\\Receipts.html");
        }
        if (reportFormat.equalsIgnoreCase("pdf")) {
            JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\Receiptrs.pdf");
        }

        return "report generated in path : " + path;
    }


}
