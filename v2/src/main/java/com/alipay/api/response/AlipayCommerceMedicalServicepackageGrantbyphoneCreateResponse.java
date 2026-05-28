package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.servicepackage.grantbyphone.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-01 14:38:52
 */
public class AlipayCommerceMedicalServicepackageGrantbyphoneCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5333749446241967139L;

	/** 
	 * 服务包订单号
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
