package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MarketInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.vehicleowner.campaign.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 15:01:09
 */
public class AlipayCommerceTransportVehicleownerCampaignQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4456141813629227531L;

	/** 
	 * 活动信息
	 */
	@ApiField("market_info")
	private MarketInfo marketInfo;

	public void setMarketInfo(MarketInfo marketInfo) {
		this.marketInfo = marketInfo;
	}
	public MarketInfo getMarketInfo( ) {
		return this.marketInfo;
	}

}
