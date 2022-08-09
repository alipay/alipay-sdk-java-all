package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ecapiprod.data.put response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:13:20
 */
public class AlipayEcapiprodDataPutResponse extends AlipayResponse {

	private static final long serialVersionUID = 3389996216776419614L;

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
