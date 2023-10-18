package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.Config;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.function.config.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-08 22:46:42
 */
public class AlipayCloudCloudbaseFunctionConfigGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5358525375853913587L;

	/** 
	 * 云函数配置
	 */
	@ApiField("config")
	private Config config;

	/** 
	 * 云函数名称
	 */
	@ApiField("function_name")
	private String functionName;

	public void setConfig(Config config) {
		this.config = config;
	}
	public Config getConfig( ) {
		return this.config;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}
	public String getFunctionName( ) {
		return this.functionName;
	}

}
