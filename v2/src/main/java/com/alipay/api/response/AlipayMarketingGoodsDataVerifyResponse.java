package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.goods.data.verify response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-28 14:27:26
 */
public class AlipayMarketingGoodsDataVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1177141828228715521L;

	/** 
	 * 流水id写操作接口返回
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 返回第三方业务信息
	 */
	@ApiField("result_info")
	private String resultInfo;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setResultInfo(String resultInfo) {
		this.resultInfo = resultInfo;
	}
	public String getResultInfo( ) {
		return this.resultInfo;
	}

}
