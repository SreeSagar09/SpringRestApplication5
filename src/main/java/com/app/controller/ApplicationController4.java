package com.app.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/app4", headers = "header1")
public class ApplicationController4 {
	
	@RequestMapping(path = "/handlerMethod")
	public ResponseEntity<Map<String, Object>> handlerMethod1() {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		try {
			Map<String, Object> data = new LinkedHashMap<>();
			data.put("methodName", "handlerMethod1");
			data.put("className", "ApplicationController4");
			data.put("description", "This handlerMethod1 method have class level headers and don't have method level headers");
			
			responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<Map<String,Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@RequestMapping(path = "/handlerMethod", headers = "header2")
	public ResponseEntity<Map<String, Object>> handlerMethod2() {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		try {
			Map<String, Object> data = new LinkedHashMap<>();
			data.put("methodName", "handlerMethod2");
			data.put("className", "ApplicationController4");
			data.put("description", "This handlerMethod2 method have both class level and method level headers");
			
			responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<Map<String,Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@RequestMapping(path = "/handlerMethod", headers = "header2=Test")
	public ResponseEntity<Map<String, Object>> handlerMethod3() {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		try {
			Map<String, Object> data = new LinkedHashMap<>();
			data.put("methodName", "handlerMethod3");
			data.put("className", "ApplicationController4");
			data.put("description", "This handlerMethod3 method have class level headers and method level headers with value Test.");
			
			responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<Map<String,Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
}
