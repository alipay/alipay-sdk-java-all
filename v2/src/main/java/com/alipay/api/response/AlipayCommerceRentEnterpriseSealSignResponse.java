package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.enterprise.seal.sign response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-28 17:33:10
 */
public class AlipayCommerceRentEnterpriseSealSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 6514111762947928392L;

	/** 
	 * 业务流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 签署合同id
	 */
	@ApiField("sign_flow_id")
	private String signFlowId;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setSignFlowId(String signFlowId) {
		this.signFlowId = signFlowId;
	}
	public String getSignFlowId( ) {
		return this.signFlowId;
	}

}
