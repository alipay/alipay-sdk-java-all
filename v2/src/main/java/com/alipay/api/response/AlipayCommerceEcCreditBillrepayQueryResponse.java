package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EcCreditBillRepayment;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.credit.billrepay.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-15 21:37:06
 */
public class AlipayCommerceEcCreditBillrepayQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6294362242131951532L;

	/** 
	 * 授信账单还款信息
	 */
	@ApiListField("repayments")
	@ApiField("ec_credit_bill_repayment")
	private List<EcCreditBillRepayment> repayments;

	public void setRepayments(List<EcCreditBillRepayment> repayments) {
		this.repayments = repayments;
	}
	public List<EcCreditBillRepayment> getRepayments( ) {
		return this.repayments;
	}

}
