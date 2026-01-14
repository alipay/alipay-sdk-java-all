package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hdf.medlib.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-02 11:37:22
 */
public class AlipayCommerceMedicalHdfMedlibSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6368628173487315727L;

	/** 
	 * 接口返回数据
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
