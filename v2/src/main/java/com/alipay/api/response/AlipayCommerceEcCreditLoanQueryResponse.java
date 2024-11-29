package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LoanApply;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.credit.loan.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-08 15:27:04
 */
public class AlipayCommerceEcCreditLoanQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3534134154421591216L;

	/** 
	 * 借款申请记录
	 */
	@ApiListField("loan_apply_infos")
	@ApiField("loan_apply")
	private List<LoanApply> loanApplyInfos;

	public void setLoanApplyInfos(List<LoanApply> loanApplyInfos) {
		this.loanApplyInfos = loanApplyInfos;
	}
	public List<LoanApply> getLoanApplyInfos( ) {
		return this.loanApplyInfos;
	}

}
