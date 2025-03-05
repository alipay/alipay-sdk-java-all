package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.supervision.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-23 19:37:22
 */
public class AlipayEbppIndustrySupervisionOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3681725192611882352L;

	/** 
	 * 冻资单地址
	 */
	@ApiField("alipay_order_detail_url")
	private String alipayOrderDetailUrl;

	/** 
	 * 支付宝订单号
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/** 
	 * 冻资单订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 请求参数中的外部商户订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	public void setAlipayOrderDetailUrl(String alipayOrderDetailUrl) {
		this.alipayOrderDetailUrl = alipayOrderDetailUrl;
	}
	public String getAlipayOrderDetailUrl( ) {
		return this.alipayOrderDetailUrl;
	}

	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}
	public String getAlipayOrderNo( ) {
		return this.alipayOrderNo;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

}
