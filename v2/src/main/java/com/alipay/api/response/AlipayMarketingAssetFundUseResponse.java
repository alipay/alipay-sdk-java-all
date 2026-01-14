package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.asset.fund.use response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-16 14:22:41
 */
public class AlipayMarketingAssetFundUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 1489559123157344842L;

	/** 
	 * 当笔资产资金核销操作的流水id
	 */
	@ApiField("use_order_id")
	private String useOrderId;

	public void setUseOrderId(String useOrderId) {
		this.useOrderId = useOrderId;
	}
	public String getUseOrderId( ) {
		return this.useOrderId;
	}

}
