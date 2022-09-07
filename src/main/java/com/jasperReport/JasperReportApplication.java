package com.jasperReport;

import com.jasperReport.module.order.entity.OrderEntity;
import com.jasperReport.module.order.repository.OrderEntityRepository;
import com.jasperReport.module.order.service.ReportService;
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
	private OrderEntityRepository repository;
	@Autowired
	private ReportService service;
//	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
@RequestMapping(value = "/getOrder", produces = MediaType.APPLICATION_JSON_VALUE)
	//@GetMapping("/getEmployees",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<OrderEntity>> getOrders() {

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
