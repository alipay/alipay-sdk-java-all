package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.industry.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-12 10:53:01
 */
public class ZhimaCreditPeIndustryOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7288954121454242689L;

	/** 
	 * 入参传入的外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 订单状态,具体业务对应的订单状态值请联系业务确认
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 平台订单号
	 */
	@ApiField("zm_order_id")
	private String zmOrderId;

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setZmOrderId(String zmOrderId) {
		this.zmOrderId = zmOrderId;
	}
	public String getZmOrderId( ) {
		return this.zmOrderId;
	}

}
