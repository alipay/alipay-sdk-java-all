package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.zhiqiangtest.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-13 11:47:53
 */
public class AlipayMerchantZhiqiangtestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6879475355542524681L;

	/** 
	 * 执行结果的JSON输出
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
