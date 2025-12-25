package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dpc.alisis.olapprocessor response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 10:08:47
 */
public class AlipayDataDpcAlisisOlapprocessorResponse extends AlipayResponse {

	private static final long serialVersionUID = 1128596254242711276L;

	/** 
	 * 业务处理后返回的数据
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
