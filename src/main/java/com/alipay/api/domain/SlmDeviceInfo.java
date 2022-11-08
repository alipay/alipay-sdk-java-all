package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备信息
 *
 * @author auto create
 * @since 1.0, 2022-09-19 14:25:30
 */
public class SlmDeviceInfo extends AlipayObject {

	private static final long serialVersionUID = 3173746869921253662L;

	/**
	 * 设备品牌
	 */
	@ApiField("brand")
	private String brand;

	/**
	 * 设备平台
	 */
	@ApiField("platform")
	private String platform;

	/**
	 * 产品名
	 */
	@ApiField("product")
	private String product;

	/**
	 * 设备归属
	 */
	@ApiField("scope")
	private String scope;

	/**
	 * 设备唯一标识
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 业务分类
	 */
	@ApiField("support")
	private String support;

	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getPlatform() {
		return this.platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getProduct() {
		return this.product;
	}
	public void setProduct(String product) {
		this.product = product;
	}

	public String getScope() {
		return this.scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getSupport() {
		return this.support;
	}
	public void setSupport(String support) {
		this.support = support;
	}

}
