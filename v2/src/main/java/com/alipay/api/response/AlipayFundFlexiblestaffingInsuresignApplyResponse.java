package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.flexiblestaffing.insuresign.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-24 13:48:06
 */
public class AlipayFundFlexiblestaffingInsuresignApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4657152626966874287L;

	/** 
	 * 签约企业支付宝账号id
	 */
	@ApiField("alipay_id")
	private String alipayId;

	/** 
	 * 企业支付宝账号Id
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/** 
	 * 签约链接
	 */
	@ApiField("apply_link")
	private String applyLink;

	/** 
	 * 签约状态
	 */
	@ApiField("status")
	private String status;

	public void setAlipayId(String alipayId) {
		this.alipayId = alipayId;
	}
	public String getAlipayId( ) {
		return this.alipayId;
	}

	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}
	public String getAlipayOpenId( ) {
		return this.alipayOpenId;
	}

	public void setApplyLink(String applyLink) {
		this.applyLink = applyLink;
	}
	public String getApplyLink( ) {
		return this.applyLink;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
