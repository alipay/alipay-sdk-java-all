package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.creditphone.order.precreate response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-17 13:52:04
 */
public class AlipayCommerceAcommunicationCreditphoneOrderPrecreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2298611719591388749L;

	/** 
	 * 支付宝订单号
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/** 
	 * 用于业务在后续操作中需要使用的业务信息。一期为orderId用于拉起芝麻收银台
	 */
	@ApiField("biz_params")
	private String bizParams;

	/** 
	 * 外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 用户页面订单id
	 */
	@ApiField("page_order_no")
	private String pageOrderNo;

	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}
	public String getAlipayOrderNo( ) {
		return this.alipayOrderNo;
	}

	public void setBizParams(String bizParams) {
		this.bizParams = bizParams;
	}
	public String getBizParams( ) {
		return this.bizParams;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setPageOrderNo(String pageOrderNo) {
		this.pageOrderNo = pageOrderNo;
	}
	public String getPageOrderNo( ) {
		return this.pageOrderNo;
	}

}
