package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.recharge.flow.send response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayEbppRechargeFlowSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6825319276612171866L;

	/** 
	 * 扩展字段
	 */
	@ApiField("ext_msg")
	private String extMsg;

	/** 
	 * 内部交易号
	 */
	@ApiField("merchant_order_id")
	private String merchantOrderId;

	/** 
	 * P:已接受，处理中
F:兑换上送失败
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 外部交易id
	 */
	@ApiField("trade_id")
	private String tradeId;

	public void setExtMsg(String extMsg) {
		this.extMsg = extMsg;
	}
	public String getExtMsg( ) {
		return this.extMsg;
	}

	public void setMerchantOrderId(String merchantOrderId) {
		this.merchantOrderId = merchantOrderId;
	}
	public String getMerchantOrderId( ) {
		return this.merchantOrderId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	public String getTradeId( ) {
		return this.tradeId;
	}

}
