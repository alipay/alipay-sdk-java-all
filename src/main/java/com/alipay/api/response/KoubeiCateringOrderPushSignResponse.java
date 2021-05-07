package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.order.push.sign response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-18 15:35:00
 */
public class KoubeiCateringOrderPushSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 2453358923518365769L;

	/** 
	 * 扩展信息
	 */
	@ApiField("ext_infos")
	private String extInfos;

	/** 
	 * 口碑主订单号
	 */
	@ApiField("order_id")
	private String orderId;

	public void setExtInfos(String extInfos) {
		this.extInfos = extInfos;
	}
	public String getExtInfos( ) {
		return this.extInfos;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

}
