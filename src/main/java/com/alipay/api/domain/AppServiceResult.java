package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序应用子服务信息
 *
 * @author auto create
 * @since 1.0, 2021-09-09 15:38:59
 */
public class AppServiceResult extends AlipayObject {

	private static final long serialVersionUID = 2327657892353526744L;

	/**
	 * 跳转地址
	 */
	@ApiField("carrier_url")
	private String carrierUrl;

	/**
	 * 子服务的logo地址
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/**
	 * 服务code
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 服务名称
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * 简要描述
	 */
	@ApiField("simple_desc")
	private String simpleDesc;

	public String getCarrierUrl() {
		return this.carrierUrl;
	}
	public void setCarrierUrl(String carrierUrl) {
		this.carrierUrl = carrierUrl;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getSimpleDesc() {
		return this.simpleDesc;
	}
	public void setSimpleDesc(String simpleDesc) {
		this.simpleDesc = simpleDesc;
	}

}
