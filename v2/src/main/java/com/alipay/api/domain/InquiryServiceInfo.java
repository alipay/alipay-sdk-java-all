package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务信息
 *
 * @author auto create
 * @since 1.0, 2025-04-22 15:04:13
 */
public class InquiryServiceInfo extends AlipayObject {

	private static final long serialVersionUID = 7459213169496962839L;

	/**
	 * 服务所在平台
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 币种符号 ?
	 */
	@ApiField("pre_unit")
	private String preUnit;

	/**
	 * 服务价格 元
	 */
	@ApiField("price")
	private String price;

	/**
	 * 服务模式：
IMAGE_INQUIRY ：图文问诊
PHONE_INQUIRY ：电话问诊
	 */
	@ApiField("service_mode")
	private String serviceMode;

	/**
	 * 服务名称
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * 服务类型
	 */
	@ApiField("service_type")
	private String serviceType;

	/**
	 * 服务链接
	 */
	@ApiField("service_url")
	private String serviceUrl;

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getPreUnit() {
		return this.preUnit;
	}
	public void setPreUnit(String preUnit) {
		this.preUnit = preUnit;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getServiceMode() {
		return this.serviceMode;
	}
	public void setServiceMode(String serviceMode) {
		this.serviceMode = serviceMode;
	}

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getServiceUrl() {
		return this.serviceUrl;
	}
	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

}
