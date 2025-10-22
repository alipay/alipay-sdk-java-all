package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.mobile.screen.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-24 10:32:06
 */
public class AlipayInsSceneMobileScreenApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8243867241377576319L;

	/** 
	 * 投保外部业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/** 
	 * 保单详情地址
	 */
	@ApiField("policy_url")
	private String policyUrl;

	/** 
	 * 保单保费（单位：分）
	 */
	@ApiField("premium")
	private Long premium;

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

	public void setPolicyUrl(String policyUrl) {
		this.policyUrl = policyUrl;
	}
	public String getPolicyUrl( ) {
		return this.policyUrl;
	}

	public void setPremium(Long premium) {
		this.premium = premium;
	}
	public Long getPremium( ) {
		return this.premium;
	}

}
