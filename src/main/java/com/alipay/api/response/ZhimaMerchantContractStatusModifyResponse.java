package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.contract.status.modify response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-01 18:00:00
 */
public class ZhimaMerchantContractStatusModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7119384678769244516L;

	/** 
	 * 承诺消费合约号，唯一定位用户的一笔合约
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
