package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.xuanyitest.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-16 17:26:45
 */
public class AlipayMarketingToolXuanyitestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6256756843253275396L;

	/** 
	 * 测试用的
	 */
	@ApiField("test_100")
	private String test100;

	/** 
	 * 测试2
	 */
	@ApiField("test_101")
	private Boolean test101;

	public void setTest100(String test100) {
		this.test100 = test100;
	}
	public String getTest100( ) {
		return this.test100;
	}

	public void setTest101(Boolean test101) {
		this.test101 = test101;
	}
	public Boolean getTest101( ) {
		return this.test101;
	}

}
