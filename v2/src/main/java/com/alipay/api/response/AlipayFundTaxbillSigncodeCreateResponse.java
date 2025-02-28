package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.taxbill.signcode.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-22 21:52:04
 */
public class AlipayFundTaxbillSigncodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6164768926662886224L;

	/** 
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/** 
	 * 签约吱口令/签约短链接，请求成功响应时存在
	 */
	@ApiField("sign_code")
	private String signCode;

	/** 
	 * 签约码类型，请求成功响应时存在，标明当前sign_code的类型，默认为SHARE_CODE。
1. SHARE_CODE（吱口令） 2.SHORT_URL（短链接）
	 */
	@ApiField("sign_code_type")
	private String signCodeType;

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}
	public String getBizScene( ) {
		return this.bizScene;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode( ) {
		return this.productCode;
	}

	public void setSignCode(String signCode) {
		this.signCode = signCode;
	}
	public String getSignCode( ) {
		return this.signCode;
	}

	public void setSignCodeType(String signCodeType) {
		this.signCodeType = signCodeType;
	}
	public String getSignCodeType( ) {
		return this.signCodeType;
	}

}
