package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.ctid.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 14:57:40
 */
public class AlipaySecurityProdCtidInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 1812998313631871977L;

	/** 
	 * 随机数，用于生成authcode
	 */
	@ApiField("random_data")
	private String randomData;

	/** 
	 * 公安一所返回的流水号
	 */
	@ApiField("stream_number")
	private String streamNumber;

	public void setRandomData(String randomData) {
		this.randomData = randomData;
	}
	public String getRandomData( ) {
		return this.randomData;
	}

	public void setStreamNumber(String streamNumber) {
		this.streamNumber = streamNumber;
	}
	public String getStreamNumber( ) {
		return this.streamNumber;
	}

}
