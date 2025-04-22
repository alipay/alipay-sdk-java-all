package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.acceptance.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-25 11:30:55
 */
public class ZhimaCreditEpAcceptanceInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 5218163968953965212L;

	/** 
	 * 芝麻企业信用数据访问令牌
	 */
	@ApiField("access_token")
	private String accessToken;

	/** 
	 * 用户接入企业信用受理台服务H5页面地址
（根据平台的具体应用场景决策返回，目前是实力标产品并且入参指定企业时）
	 */
	@ApiField("access_url")
	private String accessUrl;

	/** 
	 * 一次受理的唯一标识
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 商户唯一业务流水号，由大小写字母和数字构成（当商户传入时返回）
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getAccessToken( ) {
		return this.accessToken;
	}

	public void setAccessUrl(String accessUrl) {
		this.accessUrl = accessUrl;
	}
	public String getAccessUrl( ) {
		return this.accessUrl;
	}

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
