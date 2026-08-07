package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hdf.recipeinfo.send response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-30 11:12:56
 */
public class AlipayCommerceMedicalHdfRecipeinfoSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 4255917253131466467L;

	/** 
	 * 返回内容
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
