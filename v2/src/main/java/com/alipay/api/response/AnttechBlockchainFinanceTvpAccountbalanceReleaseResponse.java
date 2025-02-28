package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.tvp.accountbalance.release response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-24 16:42:21
 */
public class AnttechBlockchainFinanceTvpAccountbalanceReleaseResponse extends AlipayResponse {

	private static final long serialVersionUID = 7122292927769621468L;

	/** 
	 * 机构侧资金释放流水
	 */
	@ApiField("channel_order_id")
	private String channelOrderId;

	/** 
	 * 释放成功
	 */
	@ApiField("fund_status")
	private String fundStatus;

	public void setChannelOrderId(String channelOrderId) {
		this.channelOrderId = channelOrderId;
	}
	public String getChannelOrderId( ) {
		return this.channelOrderId;
	}

	public void setFundStatus(String fundStatus) {
		this.fundStatus = fundStatus;
	}
	public String getFundStatus( ) {
		return this.fundStatus;
	}

}
