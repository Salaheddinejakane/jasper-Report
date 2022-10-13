package com.jasperReport.module.order.service;
import com.jasperReport.module.order.repository.OrderEntityRepository;


import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.InputStream;
import java.util.*;

@Service
public class ReportService {
    private final ResourceLoader resourceLoader;

    @Autowired
    private OrderEntityRepository repository;

    public ReportService(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }


    public String exportReport(String reportFormat) throws Exception {

        HashMap<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("logo1", getBase64String1());
        parameters.put("logo2", getBase64String2());
        parameters.put("logo3", getBase64String3());
        parameters.put("logo4", getBase64String4());
        parameters.put("logo5", getBase64String5());
        parameters.put("logo6", getBase64String6());
        String path = "C:\\Users\\J.SaLahEddine\\Desktop\\Report";
        //load file and compile it
        File file = ResourceUtils.getFile("classpath:order.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(Collections.singleton( repository.findById(1L).get()));

        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        if (reportFormat.equalsIgnoreCase("html")) {
            JasperExportManager.exportReportToHtmlFile(jasperPrint, path + "\\Orders.html");
        }
        if (reportFormat.equalsIgnoreCase("pdf")) {
            JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\Orders.pdf");
        }

        return "report generated in path : " + path;
    }




    public  String getBase64String1() throws Exception {
        InputStream file = this.resourceLoader.getResource("classpath:" + "/images/1.jpg").getInputStream();


        String encodedString = Base64.getEncoder().encodeToString(IOUtils.toByteArray(file ));

        return encodedString;

    }
    public  String getBase64String2() throws Exception {
        InputStream file = this.resourceLoader.getResource("classpath:" + "/images/2.jpg").getInputStream();


        String encodedString = Base64.getEncoder().encodeToString(IOUtils.toByteArray(file ));

        return encodedString;

    }
    public  String getBase64String3() throws Exception {
        InputStream file = this.resourceLoader.getResource("classpath:" + "/images/3.jpg").getInputStream();


        String encodedString = Base64.getEncoder().encodeToString(IOUtils.toByteArray(file ));

        return encodedString;

    }
    public  String getBase64String4() throws Exception {
        InputStream file = this.resourceLoader.getResource("classpath:" + "/images/4.jpg").getInputStream();


        String encodedString = Base64.getEncoder().encodeToString(IOUtils.toByteArray(file ));

        return encodedString;

    }
    public  String getBase64String5() throws Exception {
        InputStream file = this.resourceLoader.getResource("classpath:" + "/images/5.jpg").getInputStream();


        String encodedString = Base64.getEncoder().encodeToString(IOUtils.toByteArray(file ));

        return encodedString;

    }
    public  String getBase64String6() throws Exception {
        InputStream file = this.resourceLoader.getResource("classpath:" + "/images/6.jpg").getInputStream();


        String encodedString = Base64.getEncoder().encodeToString(IOUtils.toByteArray(file ));

        return encodedString;

    }
}
