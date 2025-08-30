package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BenefitAccountFsFundInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.benefitaccount.account.refund response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-29 11:17:39
 */
public class AlipayMarketingBenefitaccountAccountRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 6456452923944336649L;

	/** 
	 * 总退款金额，单位：元
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 退款金额操作明细
	 */
	@ApiField("fund_infos")
	private BenefitAccountFsFundInfoDTO fundInfos;

	/** 
	 * 退款操作单号，可用于幂等
	 */
	@ApiField("order_no")
	private String orderNo;

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

	public void setFundInfos(BenefitAccountFsFundInfoDTO fundInfos) {
		this.fundInfos = fundInfos;
	}
	public BenefitAccountFsFundInfoDTO getFundInfos( ) {
		return this.fundInfos;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

}
