package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RentLoanConsultResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.loan.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-10 15:12:29
 */
public class AlipayCommerceRentLoanQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4241533658223454456L;

	/** 
	 * null
	 */
	@ApiListField("consult_result_infos")
	@ApiField("rent_loan_consult_result")
	private List<RentLoanConsultResult> consultResultInfos;

	public void setConsultResultInfos(List<RentLoanConsultResult> consultResultInfos) {
		this.consultResultInfos = consultResultInfos;
	}
	public List<RentLoanConsultResult> getConsultResultInfos( ) {
		return this.consultResultInfos;
	}

}
