package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GatewayConfig;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.ide.config.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:27
 */
public class AlipayCloudCloudbaseIdeConfigGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5156449976426617294L;

	/** 
	 * accessKey
	 */
	@ApiField("access_key")
	private String accessKey;

	/** 
	 * 网关配置
	 */
	@ApiListField("gateway_configs")
	@ApiField("gateway_config")
	private List<GatewayConfig> gatewayConfigs;

	/** 
	 * secretKey
	 */
	@ApiField("secret_key")
	private String secretKey;

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}
	public String getAccessKey( ) {
		return this.accessKey;
	}

	public void setGatewayConfigs(List<GatewayConfig> gatewayConfigs) {
		this.gatewayConfigs = gatewayConfigs;
	}
	public List<GatewayConfig> getGatewayConfigs( ) {
		return this.gatewayConfigs;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}
	public String getSecretKey( ) {
		return this.secretKey;
	}

}
