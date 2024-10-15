package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.devops.device.condition.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-09 13:56:57
 */
public class AlipayCloudDevopsDeviceConditionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8416494561265992678L;

	/** 
	 * 设备架构
	 */
	@ApiField("abi")
	private String abi;

	/** 
	 * 设备品牌型号信息
	 */
	@ApiField("brand_product")
	private String brandProduct;

	/** 
	 * 屏幕像素密度
	 */
	@ApiField("dpi")
	private String dpi;

	/** 
	 * 系统版本
	 */
	@ApiField("os_version")
	private String osVersion;

	/** 
	 * 设备屏幕分辨率
	 */
	@ApiField("resolution")
	private String resolution;

	public void setAbi(String abi) {
		this.abi = abi;
	}
	public String getAbi( ) {
		return this.abi;
	}

	public void setBrandProduct(String brandProduct) {
		this.brandProduct = brandProduct;
	}
	public String getBrandProduct( ) {
		return this.brandProduct;
	}

	public void setDpi(String dpi) {
		this.dpi = dpi;
	}
	public String getDpi( ) {
		return this.dpi;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}
	public String getOsVersion( ) {
		return this.osVersion;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	public String getResolution( ) {
		return this.resolution;
	}

}
