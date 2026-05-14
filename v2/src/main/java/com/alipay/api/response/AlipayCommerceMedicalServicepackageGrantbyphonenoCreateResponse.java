package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.servicepackage.grantbyphoneno.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-08 11:42:45
 */
public class AlipayCommerceMedicalServicepackageGrantbyphonenoCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6514143312921245187L;

	/** 
	 * 业务唯一单号
	 */
	@ApiField("unique_biz_no")
	private String uniqueBizNo;

	public void setUniqueBizNo(String uniqueBizNo) {
		this.uniqueBizNo = uniqueBizNo;
	}
	public String getUniqueBizNo( ) {
		return this.uniqueBizNo;
	}

}
