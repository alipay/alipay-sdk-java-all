package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.payafteruse.creditbizorder.order response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-03 10:39:43
 */
public class ZhimaCreditPayafteruseCreditbizorderOrderResponse extends AlipayResponse {

	private static final long serialVersionUID = 4153736347126951162L;

	/** 
	 * 信用服务订单号
	 */
	@ApiField("credit_biz_order_id")
	private String creditBizOrderId;

	/** 
	 * 商户传入的外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	public void setCreditBizOrderId(String creditBizOrderId) {
		this.creditBizOrderId = creditBizOrderId;
	}
	public String getCreditBizOrderId( ) {
		return this.creditBizOrderId;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

}
