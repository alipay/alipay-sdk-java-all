package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.entrust.close response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:32:00
 */
public class AlipayFundTransEntrustCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 4591721266755716415L;

	/** 
	 * 该笔委托支付在支付宝系统内部的单据ID
	 */
	@ApiField("entrust_order_id")
	private String entrustOrderId;

	/** 
	 * 商户端的唯一订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * INIT，表示委托支付单据已经受理
	 */
	@ApiField("status")
	private String status;

	public void setEntrustOrderId(String entrustOrderId) {
		this.entrustOrderId = entrustOrderId;
	}
	public String getEntrustOrderId( ) {
		return this.entrustOrderId;
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
