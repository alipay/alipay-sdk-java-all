package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dpc.alisis.olapprocessor response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayDataDpcAlisisOlapprocessorResponse extends AlipayResponse {

	private static final long serialVersionUID = 4734845798684265366L;

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
