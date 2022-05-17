package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.elm.creditloanadmit.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-10-22 18:15:13
 */
public class MybankCreditLoanapplyElmCreditloanadmitQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8372254485597163371L;

	/** 
	 * 可贷额度标签
	 */
	@ApiField("admit_label")
	private String admitLabel;

	public void setAdmitLabel(String admitLabel) {
		this.admitLabel = admitLabel;
	}
	public String getAdmitLabel( ) {
		return this.admitLabel;
	}

}
