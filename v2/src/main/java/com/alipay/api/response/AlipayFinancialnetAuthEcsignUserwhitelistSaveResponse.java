package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.ecsign.userwhitelist.save response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 01:06:48
 */
public class AlipayFinancialnetAuthEcsignUserwhitelistSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 4831392175724595577L;

	/** 
	 * 电子签约订单号,唯一值。
	 */
	@ApiField("sign_order_no")
	private String signOrderNo;

	public void setSignOrderNo(String signOrderNo) {
		this.signOrderNo = signOrderNo;
	}
	public String getSignOrderNo( ) {
		return this.signOrderNo;
	}

}
