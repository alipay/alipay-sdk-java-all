package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hdf.bankcard.certify response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-28 14:33:32
 */
public class AlipayCommerceMedicalHdfBankcardCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8891961414976351215L;

	/** 
	 * 结果
	 */
	@ApiField("data")
	private String data;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

}
