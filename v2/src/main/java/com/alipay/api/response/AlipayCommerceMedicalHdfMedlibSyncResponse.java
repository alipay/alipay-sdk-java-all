package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hdf.medlib.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-11 17:02:25
 */
public class AlipayCommerceMedicalHdfMedlibSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2383614953462932866L;

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
