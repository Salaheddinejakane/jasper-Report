package com.jasperReport;

import com.jasperReport.entity.Employee;
import com.jasperReport.repository.EmployeeRepository;
import com.jasperReport.service.ReportService;
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

import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;

@SpringBootApplication
@RestController
public class JasperReportApplication {


	@Autowired
	private EmployeeRepository repository;
	@Autowired
	private ReportService service;
//	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
@RequestMapping(value = "/getEmployees", produces = MediaType.APPLICATION_JSON_VALUE)
	//@GetMapping("/getEmployees",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Employee>> getEmployees() {

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
