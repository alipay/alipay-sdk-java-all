package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.shop.applyorder.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 04:29:26
 */
public class AlipayOfflineMarketShopApplyorderCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 6412957826694379619L;

	/** 
	 * 申请撤销成功接口同步返回的支付宝申请流水号。
	 */
	@ApiField("apply_id")
	private String applyId;

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}
	public String getApplyId( ) {
		return this.applyId;
	}

}
