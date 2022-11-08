package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Marketingtest;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.xuanyitest.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-16 17:51:48
 */
public class AlipayMarketingXuanyitestTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 2742964617769119883L;

	/** 
	 * 12
	 */
	@ApiListField("test")
	@ApiField("string")
	private List<String> test;

	/** 
	 * 测试复杂类型描述
	 */
	@ApiListField("test_21")
	@ApiField("marketingtest")
	private List<Marketingtest> test21;

	public void setTest(List<String> test) {
		this.test = test;
	}
	public List<String> getTest( ) {
		return this.test;
	}

	public void setTest21(List<Marketingtest> test21) {
		this.test21 = test21;
	}
	public List<Marketingtest> getTest21( ) {
		return this.test21;
	}

}
