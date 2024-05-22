package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.business.plan.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-22 14:42:02
 */
public class ZhimaCreditBusinessPlanModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1617388917185478159L;

	/** 
	 * 业务主单号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 请求流水号，用于标示请求流水的唯一性。 仅支持字母、数字、下划线。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

}
