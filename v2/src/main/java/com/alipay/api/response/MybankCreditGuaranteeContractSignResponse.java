package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.guarantee.contract.sign response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:39:06
 */
public class MybankCreditGuaranteeContractSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 1647224683321843512L;

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
