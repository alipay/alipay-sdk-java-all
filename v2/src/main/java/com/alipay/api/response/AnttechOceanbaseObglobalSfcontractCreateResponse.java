package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SalesForceCreateContractDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.sfcontract.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-09 14:17:53
 */
public class AnttechOceanbaseObglobalSfcontractCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2235551127322176231L;

	/** 
	 * 结果对象
	 */
	@ApiField("result")
	private SalesForceCreateContractDTO result;

	public void setResult(SalesForceCreateContractDTO result) {
		this.result = result;
	}
	public SalesForceCreateContractDTO getResult( ) {
		return this.result;
	}

}
