package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CustomerNameResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.customer.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-01 19:27:41
 */
public class AnttechOceanbaseObglobalCustomerQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3616688175511972728L;

	/** 
	 * 出参
	 */
	@ApiField("result")
	private CustomerNameResponse result;

	public void setResult(CustomerNameResponse result) {
		this.result = result;
	}
	public CustomerNameResponse getResult( ) {
		return this.result;
	}

}
