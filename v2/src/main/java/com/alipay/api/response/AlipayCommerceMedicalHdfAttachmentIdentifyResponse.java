package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hdf.attachment.identify response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-11 17:02:25
 */
public class AlipayCommerceMedicalHdfAttachmentIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7665791412619248628L;

	/** 
	 * 返回的数据内容
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
