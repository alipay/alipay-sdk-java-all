package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OrderDiscountDetailInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.promodecision.orderconsult.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-08 17:48:05
 */
public class AlipayOpenMiniPromodecisionOrderconsultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1792834789969917457L;

	/** 
	 * 订单优惠信息
	 */
	@ApiField("order_discount_detail_info")
	private OrderDiscountDetailInfo orderDiscountDetailInfo;

	/** 
	 * 错误码
	 */
	@ApiField("result_code")
	private String resultCode;

	public void setOrderDiscountDetailInfo(OrderDiscountDetailInfo orderDiscountDetailInfo) {
		this.orderDiscountDetailInfo = orderDiscountDetailInfo;
	}
	public OrderDiscountDetailInfo getOrderDiscountDetailInfo( ) {
		return this.orderDiscountDetailInfo;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

}
