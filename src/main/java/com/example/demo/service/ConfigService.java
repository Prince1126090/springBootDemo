package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Config;
import com.example.demo.repository.ConfigRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ConfigService {

	private final ConfigRepository configRepository;

	public void create(Config config) {
		configRepository.save(config);
	}

//    public List<Config> getList() {
//        return configRepository.findAll();
//    }

	public List<Config> getList() {
		List<Config> configList;
		configList = configRepository.findAll();
		if (configList == null || configList.isEmpty()) {
			Config config = new Config();
			config.setAppName("Application One");
			create(config);
			configList = configRepository.findAll();
		}
		return configList;
	}

}
