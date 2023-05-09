package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.payafteruse.creditbizorder.finish response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 18:58:09
 */
public class ZhimaCreditPayafteruseCreditbizorderFinishResponse extends AlipayResponse {

	private static final long serialVersionUID = 3337126973752547325L;

	/** 
	 * 信用服务订单号
	 */
	@ApiField("credit_biz_order_id")
	private String creditBizOrderId;

	/** 
	 * 信用服务订单状态.INIT: 下单状态; TRADE_CLOSED: 订单取消或者交易全额退款； TRADE_FINISHED：扣款成功状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 商户外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public void setCreditBizOrderId(String creditBizOrderId) {
		this.creditBizOrderId = creditBizOrderId;
	}
	public String getCreditBizOrderId( ) {
		return this.creditBizOrderId;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

}
