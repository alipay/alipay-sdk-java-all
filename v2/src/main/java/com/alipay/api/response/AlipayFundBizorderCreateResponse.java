package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.bizorder.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:54
 */
public class AlipayFundBizorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5342269159947617585L;

	/** 
	 * 支付宝业务订单号
	 */
	@ApiField("biz_order_no")
	private String bizOrderNo;

	/** 
	 * 商户订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 业务单据状态。
WAIT_PAY：待支付；
DEALING：支付处理中；
SUCCESS：已支付；
CLOSE：已废弃；
OFFLINE_PAY：线下已付。
	 */
	@ApiField("status")
	private String status;

	public void setBizOrderNo(String bizOrderNo) {
		this.bizOrderNo = bizOrderNo;
	}
	public String getBizOrderNo( ) {
		return this.bizOrderNo;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
