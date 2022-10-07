package com.jasperReport;

import com.jasperReport.module.receipt.entity.Receipt;
import com.jasperReport.module.receipt.repository.ReceiptEntityRepository;
import com.jasperReport.module.receipt.service.ReportService;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.util.List;


@SpringBootApplication
@RestController
public class JasperReportApplication {


	@Autowired
	private ReceiptEntityRepository repository;
	@Autowired
	private ReportService service;
//	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
@RequestMapping(value = "/getReceipt", produces = MediaType.APPLICATION_JSON_VALUE)
	//@GetMapping("/getEmployees",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Receipt>> getReceipts() {

		return new ResponseEntity<>(repository.findAll(), HttpStatus.ACCEPTED);
	}

	@GetMapping("/report/{format}")
	public String generateReport(@PathVariable String format) throws FileNotFoundException, JRException {
		return service.exportReport(format);
	}
	public static void main(String[] args) {
		SpringApplication.run(JasperReportApplication.class, args);
	}



}
