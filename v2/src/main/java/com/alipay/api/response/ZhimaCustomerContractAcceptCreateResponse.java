package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.contract.accept.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 21:02:01
 */
public class ZhimaCustomerContractAcceptCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1665841879123458736L;

	/** 
	 * 合约号
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
