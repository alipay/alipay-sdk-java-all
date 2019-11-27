package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.test.demo.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-18 13:02:21
 */
public class AlipayDataDataserviceTestDemoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4258686819464959383L;

	/** 
	 * 测试
	 */
	@ApiField("result")
	private Long result;

	public void setResult(Long result) {
		this.result = result;
	}
	public Long getResult( ) {
		return this.result;
	}

}
