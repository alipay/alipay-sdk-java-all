package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.qualification.service.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-15 21:32:41
 */
public class AlipayMarketingQualificationServiceSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8546321528911852497L;

	/** 
	 * 本次操作的流水id
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 返回服务调用数据
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
