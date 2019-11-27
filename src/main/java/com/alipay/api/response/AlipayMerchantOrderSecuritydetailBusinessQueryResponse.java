package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AlipayOrderDataOpenapiResultInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.order.securitydetail.business.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-14 17:41:23
 */
public class AlipayMerchantOrderSecuritydetailBusinessQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4423299561371925947L;

	/** 
	 * 订单信息
	 */
	@ApiField("order_info")
	private AlipayOrderDataOpenapiResultInfo orderInfo;

	public void setOrderInfo(AlipayOrderDataOpenapiResultInfo orderInfo) {
		this.orderInfo = orderInfo;
	}
	public AlipayOrderDataOpenapiResultInfo getOrderInfo( ) {
		return this.orderInfo;
	}

}
