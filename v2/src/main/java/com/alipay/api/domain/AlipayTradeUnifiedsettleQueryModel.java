package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收结易单据明细查询
 *
 * @author auto create
 * @since 1.0, 2025-09-18 10:25:11
 */
public class AlipayTradeUnifiedsettleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1299975634655255587L;

	/**
	 * 收结易订单的单号，一般和外部商户订单号一一对应，可能对应多笔请求号、请求流水号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单同步受理时生成的单号，一般与外部商户流水号一一对应，标识唯一一次订单同步请求
	 */
	@ApiField("order_sync_id")
	private String orderSyncId;

	/**
	 * 请求流水号。由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端单笔交易维度不重复。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 商户订单号。 由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 签约产品码，目前仅支持UNIFIED_SETTLE
	 */
	@ApiField("product_code")
	private String productCode;

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderSyncId() {
		return this.orderSyncId;
	}
	public void setOrderSyncId(String orderSyncId) {
		this.orderSyncId = orderSyncId;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
