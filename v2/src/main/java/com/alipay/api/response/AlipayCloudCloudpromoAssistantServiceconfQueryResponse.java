package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ServiceConfig;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.assistant.serviceconf.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-15 16:22:04
 */
public class AlipayCloudCloudpromoAssistantServiceconfQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4471259518873855252L;

	/** 
	 * 配置服务列表
	 */
	@ApiListField("service_configs")
	@ApiField("service_config")
	private List<ServiceConfig> serviceConfigs;

	public void setServiceConfigs(List<ServiceConfig> serviceConfigs) {
		this.serviceConfigs = serviceConfigs;
	}
	public List<ServiceConfig> getServiceConfigs( ) {
		return this.serviceConfigs;
	}

}
