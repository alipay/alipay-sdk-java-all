package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 跨端服务信息
 *
 * @author auto create
 * @since 1.0, 2021-01-12 12:24:49
 */
public class MultiBundleAppServiceResult extends AlipayObject {

	private static final long serialVersionUID = 1786611377989926236L;

	/**
	 * 多端服务客户端标识
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 服务地址
	 */
	@ApiField("carrier_url")
	private String carrierUrl;

	/**
	 * 是否拥有当前端的链接
	 */
	@ApiField("has_bundle_url")
	private Boolean hasBundleUrl;

	/**
	 * 服务logo
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/**
	 * 小程序子服务编码
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 叮咚买药
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * 子服务简要介绍
	 */
	@ApiField("simple_desc")
	private String simpleDesc;

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public String getCarrierUrl() {
		return this.carrierUrl;
	}
	public void setCarrierUrl(String carrierUrl) {
		this.carrierUrl = carrierUrl;
	}

	public Boolean getHasBundleUrl() {
		return this.hasBundleUrl;
	}
	public void setHasBundleUrl(Boolean hasBundleUrl) {
		this.hasBundleUrl = hasBundleUrl;
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
