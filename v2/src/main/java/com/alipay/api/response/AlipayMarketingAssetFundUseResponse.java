package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.asset.fund.use response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-10 14:49:34
 */
public class AlipayMarketingAssetFundUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 6879187535445521736L;

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
