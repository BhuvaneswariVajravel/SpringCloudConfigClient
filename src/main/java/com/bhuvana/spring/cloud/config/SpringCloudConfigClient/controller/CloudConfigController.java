package com.bhuvana.spring.cloud.config.SpringCloudConfigClient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudConfigController {

		@Value("${my.greetings:Unable to connect to config server}")
		private String url;

		@RequestMapping("/server/url")
		String getURL() {
			return this.url;
		}
	}
