package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FindTextResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.bailingual.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-15 15:17:46
 */
public class AnttechOceanbaseObglobalBailingualBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5634249156231316779L;

	/** 
	 * 响应对象
	 */
	@ApiField("result")
	private FindTextResponse result;

	public void setResult(FindTextResponse result) {
		this.result = result;
	}
	public FindTextResponse getResult( ) {
		return this.result;
	}

}
