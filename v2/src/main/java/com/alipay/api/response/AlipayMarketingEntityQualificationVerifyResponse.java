package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.entity.qualification.verify response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-18 22:57:22
 */
public class AlipayMarketingEntityQualificationVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1734783125742744485L;

	/** 
	 * 本次操作的流水id
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 返回第三方错误信息
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
