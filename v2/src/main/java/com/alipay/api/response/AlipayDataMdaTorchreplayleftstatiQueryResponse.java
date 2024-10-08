package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.mda.torchreplayleftstati.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-08 22:18:58
 */
public class AlipayDataMdaTorchreplayleftstatiQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5517791699517133542L;

	/** 
	 * 参与国家数
	 */
	@ApiField("country_cnt")
	private Long countryCnt;

	/** 
	 * 国外火炬传递平台数
	 */
	@ApiField("foreign_platform")
	private String foreignPlatform;

	/** 
	 * 国外火炬传递平台数
	 */
	@ApiField("foreign_platform_cnt")
	private Long foreignPlatformCnt;

	/** 
	 * 国内火炬传递平台
	 */
	@ApiField("internal_platform")
	private String internalPlatform;

	/** 
	 * 国内火炬传递平台数
	 */
	@ApiField("internal_platform_cnt")
	private Long internalPlatformCnt;

	public void setCountryCnt(Long countryCnt) {
		this.countryCnt = countryCnt;
	}
	public Long getCountryCnt( ) {
		return this.countryCnt;
	}

	public void setForeignPlatform(String foreignPlatform) {
		this.foreignPlatform = foreignPlatform;
	}
	public String getForeignPlatform( ) {
		return this.foreignPlatform;
	}

	public void setForeignPlatformCnt(Long foreignPlatformCnt) {
		this.foreignPlatformCnt = foreignPlatformCnt;
	}
	public Long getForeignPlatformCnt( ) {
		return this.foreignPlatformCnt;
	}

	public void setInternalPlatform(String internalPlatform) {
		this.internalPlatform = internalPlatform;
	}
	public String getInternalPlatform( ) {
		return this.internalPlatform;
	}

	public void setInternalPlatformCnt(Long internalPlatformCnt) {
		this.internalPlatformCnt = internalPlatformCnt;
	}
	public Long getInternalPlatformCnt( ) {
		return this.internalPlatformCnt;
	}

}
