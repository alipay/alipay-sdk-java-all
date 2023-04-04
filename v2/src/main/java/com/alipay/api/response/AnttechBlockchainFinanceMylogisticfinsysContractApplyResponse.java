package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.mylogisticfinsys.contract.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 05:11:56
 */
public class AnttechBlockchainFinanceMylogisticfinsysContractApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4155952872944289852L;

	/** 
	 * 错误码
	 */
	@ApiField("code")
	private String code;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

}
