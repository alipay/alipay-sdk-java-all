package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RepaymentInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.ecny.fund.repayment.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-18 11:32:56
 */
public class MybankEcnyFundRepaymentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5645216892152194573L;

	/** 
	 * null
	 */
	@ApiListField("repayment_info")
	@ApiField("repayment_info")
	private List<RepaymentInfo> repaymentInfo;

	public void setRepaymentInfo(List<RepaymentInfo> repaymentInfo) {
		this.repaymentInfo = repaymentInfo;
	}
	public List<RepaymentInfo> getRepaymentInfo( ) {
		return this.repaymentInfo;
	}

}
