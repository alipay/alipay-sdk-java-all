package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.guarantee.contract.sign response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-26 17:29:28
 */
public class MybankCreditGuaranteeContractSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 4486846599324353447L;

	/** 
	 * 合约号。调用成功则返回签约合约号
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
