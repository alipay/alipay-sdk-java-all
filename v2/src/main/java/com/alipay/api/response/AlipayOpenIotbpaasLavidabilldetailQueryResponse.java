package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotbpaas.lavidabilldetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 01:19:53
 */
public class AlipayOpenIotbpaasLavidabilldetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1426594667591316268L;

	/** 
	 * 交易号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 订单金额 or 订单退款金额
	 */
	@ApiField("biz_order_amt")
	private String bizOrderAmt;

	/** 
	 * 商家优惠金额或者退商家优惠金额，根据rpRecordType字段值判断方向，rpRecordType=1，则为商家优惠金额，rpRecordType=2，则为退商家优惠金额
	 */
	@ApiField("mercht_disc_amt")
	private String merchtDiscAmt;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setBizOrderAmt(String bizOrderAmt) {
		this.bizOrderAmt = bizOrderAmt;
	}
	public String getBizOrderAmt( ) {
		return this.bizOrderAmt;
	}

	public void setMerchtDiscAmt(String merchtDiscAmt) {
		this.merchtDiscAmt = merchtDiscAmt;
	}
	public String getMerchtDiscAmt( ) {
		return this.merchtDiscAmt;
	}

}
