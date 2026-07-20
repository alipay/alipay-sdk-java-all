package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.dapply.applyorder.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-03 15:30:17
 */
public class AlipayCommerceIotDapplyApplyorderCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 6193445199398646867L;

	/** 
	 * 设备申请业务订单号与传入值相同
	 */
	@ApiField("order_biz_id")
	private String orderBizId;

	/** 
	 * 返回请求成功后订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	public void setOrderBizId(String orderBizId) {
		this.orderBizId = orderBizId;
	}
	public String getOrderBizId( ) {
		return this.orderBizId;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

}
