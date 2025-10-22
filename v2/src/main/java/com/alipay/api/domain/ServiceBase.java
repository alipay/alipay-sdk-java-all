package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务基础信息
 *
 * @author auto create
 * @since 1.0, 2020-11-18 16:46:17
 */
public class ServiceBase extends AlipayObject {

	private static final long serialVersionUID = 5473693989352234422L;

	/**
	 * 服务载体链接
	 */
	@ApiField("service_carrier_url")
	private String serviceCarrierUrl;

	/**
	 * 服务编码
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 服务Logo
	 */
	@ApiField("service_logo")
	private String serviceLogo;

	/**
	 * 服务名称
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * 服务简述
	 */
	@ApiField("service_simple_desc")
	private String serviceSimpleDesc;

	/**
	 * 服务规格
	 */
	@ApiField("service_spec_code")
	private String serviceSpecCode;

	public String getServiceCarrierUrl() {
		return this.serviceCarrierUrl;
	}
	public void setServiceCarrierUrl(String serviceCarrierUrl) {
		this.serviceCarrierUrl = serviceCarrierUrl;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getServiceLogo() {
		return this.serviceLogo;
	}
	public void setServiceLogo(String serviceLogo) {
		this.serviceLogo = serviceLogo;
	}

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceSimpleDesc() {
		return this.serviceSimpleDesc;
	}
	public void setServiceSimpleDesc(String serviceSimpleDesc) {
		this.serviceSimpleDesc = serviceSimpleDesc;
	}

	public String getServiceSpecCode() {
		return this.serviceSpecCode;
	}
	public void setServiceSpecCode(String serviceSpecCode) {
		this.serviceSpecCode = serviceSpecCode;
	}

}
