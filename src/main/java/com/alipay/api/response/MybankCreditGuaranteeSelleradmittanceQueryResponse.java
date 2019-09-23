package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.guarantee.selleradmittance.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-10 11:05:01
 */
public class MybankCreditGuaranteeSelleradmittanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1354654496763227367L;

	/** 
	 * 查询decision是否准入
	 */
	@ApiField("is_admitted")
	private Boolean isAdmitted;

	/** 
	 * 是否签约
	 */
	@ApiField("is_signed")
	private Boolean isSigned;

	public void setIsAdmitted(Boolean isAdmitted) {
		this.isAdmitted = isAdmitted;
	}
	public Boolean getIsAdmitted( ) {
		return this.isAdmitted;
	}

	public void setIsSigned(Boolean isSigned) {
		this.isSigned = isSigned;
	}
	public Boolean getIsSigned( ) {
		return this.isSigned;
	}

}
