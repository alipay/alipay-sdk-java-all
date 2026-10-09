package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SalesforceCreateLeadsResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.sfleads.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-22 14:29:24
 */
public class AnttechOceanbaseObglobalSfleadsCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5259913459466319381L;

	/** 
	 * 创建商机返回参数
	 */
	@ApiField("result")
	private SalesforceCreateLeadsResponse result;

	public void setResult(SalesforceCreateLeadsResponse result) {
		this.result = result;
	}
	public SalesforceCreateLeadsResponse getResult( ) {
		return this.result;
	}

}
