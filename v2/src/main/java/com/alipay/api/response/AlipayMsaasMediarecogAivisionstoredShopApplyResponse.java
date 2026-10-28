package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.aivisionstored.shop.apply response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-26 15:38:01
 */
public class AlipayMsaasMediarecogAivisionstoredShopApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4241187376631578767L;

	/** 
	 * 机具类型
	 */
	@ApiField("category_name")
	private String categoryName;

	/** 
	 * 系统类型
	 */
	@ApiField("os_type")
	private String osType;

	/** 
	 * 系统版本号
	 */
	@ApiField("os_version")
	private String osVersion;

	/** 
	 * smile版本号
	 */
	@ApiField("smile_version")
	private String smileVersion;

	/** 
	 * 机具SN
	 */
	@ApiField("sn")
	private String sn;

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryName( ) {
		return this.categoryName;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}
	public String getOsType( ) {
		return this.osType;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}
	public String getOsVersion( ) {
		return this.osVersion;
	}

	public void setSmileVersion(String smileVersion) {
		this.smileVersion = smileVersion;
	}
	public String getSmileVersion( ) {
		return this.smileVersion;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}
	public String getSn( ) {
		return this.sn;
	}

}
