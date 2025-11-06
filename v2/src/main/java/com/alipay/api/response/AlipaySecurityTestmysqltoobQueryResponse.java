package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.testmysqltoob.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-10 14:59:38
 */
public class AlipaySecurityTestmysqltoobQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5524258632867122694L;

	/** 
	 * 11
	 */
	@ApiListField("test_02")
	@ApiField("string")
	private List<String> test02;

	public void setTest02(List<String> test02) {
		this.test02 = test02;
	}
	public List<String> getTest02( ) {
		return this.test02;
	}

}
