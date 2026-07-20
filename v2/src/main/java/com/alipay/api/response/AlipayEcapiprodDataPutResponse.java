package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ecapiprod.data.put response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-30 09:14:32
 */
public class AlipayEcapiprodDataPutResponse extends AlipayResponse {

	private static final long serialVersionUID = 8659264361498432357L;

	/** 
	 * 数据版本
	 */
	@ApiField("data_version")
	private String dataVersion;

	public void setDataVersion(String dataVersion) {
		this.dataVersion = dataVersion;
	}
	public String getDataVersion( ) {
		return this.dataVersion;
	}

}
