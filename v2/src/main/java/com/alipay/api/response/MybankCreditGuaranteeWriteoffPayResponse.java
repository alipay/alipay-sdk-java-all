package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.guarantee.writeoff.pay response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 05:36:16
 */
public class MybankCreditGuaranteeWriteoffPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 4818326186231257959L;

	/** 
	 * 销账申请单号
	 */
	@ApiField("writeoff_apply_no")
	private String writeoffApplyNo;

	public void setWriteoffApplyNo(String writeoffApplyNo) {
		this.writeoffApplyNo = writeoffApplyNo;
	}
	public String getWriteoffApplyNo( ) {
		return this.writeoffApplyNo;
	}

}
