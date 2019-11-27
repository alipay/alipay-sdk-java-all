package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.superviseaccount.config.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-31 15:42:03
 */
public class AlipayCommerceEducateSuperviseaccountConfigQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6224945341666175494L;

	/** 
	 * 已冻结的金额
	 */
	@ApiField("freeze_amount")
	private String freezeAmount;

	/** 
	 * 保证金阈值
	 */
	@ApiField("margin_threshold")
	private String marginThreshold;

	/** 
	 * 提现单笔阈值
	 */
	@ApiField("withdrawal_single_threshold")
	private String withdrawalSingleThreshold;

	/** 
	 * 提现汇总阈值
	 */
	@ApiField("withdrawal_sum_threshold")
	private String withdrawalSumThreshold;

	public void setFreezeAmount(String freezeAmount) {
		this.freezeAmount = freezeAmount;
	}
	public String getFreezeAmount( ) {
		return this.freezeAmount;
	}

	public void setMarginThreshold(String marginThreshold) {
		this.marginThreshold = marginThreshold;
	}
	public String getMarginThreshold( ) {
		return this.marginThreshold;
	}

	public void setWithdrawalSingleThreshold(String withdrawalSingleThreshold) {
		this.withdrawalSingleThreshold = withdrawalSingleThreshold;
	}
	public String getWithdrawalSingleThreshold( ) {
		return this.withdrawalSingleThreshold;
	}

	public void setWithdrawalSumThreshold(String withdrawalSumThreshold) {
		this.withdrawalSumThreshold = withdrawalSumThreshold;
	}
	public String getWithdrawalSumThreshold( ) {
		return this.withdrawalSumThreshold;
	}

}
