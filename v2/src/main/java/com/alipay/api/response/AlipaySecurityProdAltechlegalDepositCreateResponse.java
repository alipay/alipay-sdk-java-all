package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.altechlegal.deposit.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-26 18:07:44
 */
public class AlipaySecurityProdAltechlegalDepositCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1192913993143827236L;

	/** 
	 * 存证发起成功时返回
	 */
	@ApiField("deposit_no")
	private String depositNo;

	public void setDepositNo(String depositNo) {
		this.depositNo = depositNo;
	}
	public String getDepositNo( ) {
		return this.depositNo;
	}

}
