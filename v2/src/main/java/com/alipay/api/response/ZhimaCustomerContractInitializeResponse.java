package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.contract.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 06:41:59
 */
public class ZhimaCustomerContractInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 1739894135523571673L;

	/** 
	 * 电子合约号，后续的电子签名流程需要用到
	 */
	@ApiField("contract_no")
	private String contractNo;

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	public String getContractNo( ) {
		return this.contractNo;
	}

}
