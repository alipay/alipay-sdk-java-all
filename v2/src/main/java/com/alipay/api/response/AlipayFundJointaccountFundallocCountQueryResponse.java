package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.jointaccount.fundalloc.count.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:58
 */
public class AlipayFundJointaccountFundallocCountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6113544614371655214L;

	/** 
	 * 自动攒计划的调拨汇总金额（单位为元，必须大于0且最多小数点后两位）
	 */
	@ApiField("alloc_amount")
	private String allocAmount;

	/** 
	 * 自动攒计划的调拨次数
	 */
	@ApiField("alloc_times")
	private Long allocTimes;

	public void setAllocAmount(String allocAmount) {
		this.allocAmount = allocAmount;
	}
	public String getAllocAmount( ) {
		return this.allocAmount;
	}

	public void setAllocTimes(Long allocTimes) {
		this.allocTimes = allocTimes;
	}
	public Long getAllocTimes( ) {
		return this.allocTimes;
	}

}
