package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etc.apply.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-30 17:44:18
 */
public class AlipayCommerceTransportEtcApplySyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5298465591367417682L;

	/** 
	 * 支付宝内部生成的orderid
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 比如某种业务标准外部订单号,比如交易外部订单号，代表商户端自己订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 同步结果：0 失败, 1成功
	 */
	@ApiField("sync_result")
	private String syncResult;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setSyncResult(String syncResult) {
		this.syncResult = syncResult;
	}
	public String getSyncResult( ) {
		return this.syncResult;
	}

}
