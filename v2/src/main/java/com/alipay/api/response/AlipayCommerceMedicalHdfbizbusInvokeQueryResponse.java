package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hdfbizbus.invoke.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-12 16:32:56
 */
public class AlipayCommerceMedicalHdfbizbusInvokeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8391513623285521824L;

	/** 
	 * 返回的业务类型
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
