package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.guarantee.contract.unsign response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-26 17:31:44
 */
public class MybankCreditGuaranteeContractUnsignResponse extends AlipayResponse {

	private static final long serialVersionUID = 3216832846655234279L;

	/** 
	 * 合约号。调用成功则返回对应签约的合约号。
	 */
	@ApiField("ar_no")
	private String arNo;

	public void setArNo(String arNo) {
		this.arNo = arNo;
	}
	public String getArNo( ) {
		return this.arNo;
	}

}
