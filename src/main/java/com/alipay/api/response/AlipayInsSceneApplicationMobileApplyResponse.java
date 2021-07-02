package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.application.mobile.apply response.
 * 
 * @author auto create
 * @since 1.0, 2021-05-31 17:00:21
 */
public class AlipayInsSceneApplicationMobileApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6165388931234123677L;

	/** 
	 * 保障卡短连
	 */
	@ApiField("card_url")
	private String cardUrl;

	/** 
	 * 外部商户业务ID，必须唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 保险保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	public void setCardUrl(String cardUrl) {
		this.cardUrl = cardUrl;
	}
	public String getCardUrl( ) {
		return this.cardUrl;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getPolicyNo( ) {
		return this.policyNo;
	}

}
