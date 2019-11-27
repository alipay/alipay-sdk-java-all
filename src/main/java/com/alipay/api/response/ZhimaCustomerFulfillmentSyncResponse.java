package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.fulfillment.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-22 16:51:19
 */
public class ZhimaCustomerFulfillmentSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3519734365669564977L;

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
