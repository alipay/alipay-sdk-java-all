package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.channel.rate.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-10 11:06:51
 */
public class AnttechOceanbaseChannelRateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1232192383328312965L;

	/** 
	 * 抽佣比例，单位：%
	 */
	@ApiField("commission_rate")
	private String commissionRate;

	/** 
	 * 渠道code
	 */
	@ApiField("sell_channel_code")
	private String sellChannelCode;

	/** 
	 * 分成比例，单位：%
	 */
	@ApiField("split_rate")
	private String splitRate;

	public void setCommissionRate(String commissionRate) {
		this.commissionRate = commissionRate;
	}
	public String getCommissionRate( ) {
		return this.commissionRate;
	}

	public void setSellChannelCode(String sellChannelCode) {
		this.sellChannelCode = sellChannelCode;
	}
	public String getSellChannelCode( ) {
		return this.sellChannelCode;
	}

	public void setSplitRate(String splitRate) {
		this.splitRate = splitRate;
	}
	public String getSplitRate( ) {
		return this.splitRate;
	}

}
