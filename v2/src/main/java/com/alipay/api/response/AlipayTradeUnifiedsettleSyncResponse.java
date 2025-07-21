package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.unifiedsettle.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-26 16:37:35
 */
public class AlipayTradeUnifiedsettleSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8274238879676278311L;

	/** 
	 * 订单同步受理单号
	 */
	@ApiField("order_sync_id")
	private String orderSyncId;

	/** 
	 * 外部流水号。由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端单笔交易维度不重复。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 商户订单号。 由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 订单处理状态，PROCESSING为处理中，SUCCESS为处理成功
	 */
	@ApiField("status")
	private String status;

	public void setOrderSyncId(String orderSyncId) {
		this.orderSyncId = orderSyncId;
	}
	public String getOrderSyncId( ) {
		return this.orderSyncId;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
