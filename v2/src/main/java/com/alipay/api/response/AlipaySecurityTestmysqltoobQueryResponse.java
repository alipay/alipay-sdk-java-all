package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.testmysqltoob.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-03 21:57:31
 */
public class AlipaySecurityTestmysqltoobQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6557451817397699432L;

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
