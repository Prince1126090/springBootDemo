package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Config;
import com.example.demo.service.ConfigService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class ConfigController {

	private final ConfigService configService;

	
	@GetMapping("add/{appName}")
	public String save(@PathVariable String appName) {
		Config config = new Config();
		config.setAppName(appName);
		configService.create(config);
		return "Saved in DB";
	}

	@GetMapping
	public List<Config> getList() {
		return configService.getList();
	}

}
