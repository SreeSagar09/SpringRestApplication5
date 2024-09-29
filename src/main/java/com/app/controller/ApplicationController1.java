package com.app.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/app1")
public class ApplicationController1 {
	
	@RequestMapping(path = "/handlerMethod")
	public ResponseEntity<Map<String, Object>> handlerMethod1() {
		Map<String, Object> data = new LinkedHashMap<>();
		data.put("methodName", "handlerMethod1");
		data.put("className", "ApplicationController1");
		data.put("description", "This handlerMethod1 method don't have params attribute.");
		
		ResponseEntity<Map<String, Object>> responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		
		return responseEntity;
	}
	
	@RequestMapping(path = "/handlerMethod", params = "param1")
	public ResponseEntity<Map<String, Object>> handlerMethod2() {
		Map<String, Object> data = new LinkedHashMap<>();
		data.put("methodName", "handlerMethod2");
		data.put("className", "ApplicationController1");
		data.put("description", "This handlerMethod2 method have params attribute.");
		
		ResponseEntity<Map<String, Object>> responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		
		return responseEntity;
	}
	
	@RequestMapping(path = "/handlerMethod", params = "param1=Test")
	public ResponseEntity<Map<String, Object>> handlerMethod3() {
		Map<String, Object> data = new LinkedHashMap<>();
		data.put("methodName", "handlerMethod3");
		data.put("className", "ApplicationController1");
		data.put("description", "This handlerMethod3 method have params attribute with value Test.");
		
		ResponseEntity<Map<String, Object>> responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		
		return responseEntity;
	}
	
	@RequestMapping(path = "/handlerMethod", params = { "param1!=Test", "param2=Test" })
	public ResponseEntity<Map<String, Object>> handlerMethod4() {
		Map<String, Object> data = new LinkedHashMap<>();
		data.put("methodName", "handlerMethod4");
		data.put("className", "ApplicationController1");
		data.put("description", "This handlerMethod4 method have params attribute with first value not Test and second value is Test.");
		
		ResponseEntity<Map<String, Object>> responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		
		return responseEntity;
	}
	
}
