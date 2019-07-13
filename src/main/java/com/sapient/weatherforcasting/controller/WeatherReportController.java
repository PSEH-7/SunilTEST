package com.sapient.weatherforcasting.controller;

import java.text.ParseException;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.weatherforcasting.service.WeatherService;

@RestController
public class WeatherReportController {

	@Autowired
	WeatherService weatherService;
	
	@GetMapping(value="/weatherforcasting")
	public String getWeatherReport(@RequestParam("city") String city,@RequestParam("country") String country) throws ParseException, JSONException {
		return weatherService.getWeatherReport(city,country).toString();
	}
}
