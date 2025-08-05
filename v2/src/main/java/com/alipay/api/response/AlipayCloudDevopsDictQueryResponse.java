package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.devops.dict.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-22 14:11:41
 */
public class AlipayCloudDevopsDictQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2643594627956554267L;

	/** 
	 * 配置属性
	 */
	@ApiField("config")
	private String config;

	public void setConfig(String config) {
		this.config = config;
	}
	public String getConfig( ) {
		return this.config;
	}

}
