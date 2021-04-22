package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.flow.status.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayEbppFlowStatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8753411725926168911L;

	/** 
	 * 扩展字段
	 */
	@ApiField("ext_msg")
	private String extMsg;

	/** 
	 * 内部订单号
	 */
	@ApiField("merchant_order_id")
	private String merchantOrderId;

	/** 
	 * 订单状态
S:成功
F:失败
P:处理中
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 外表订单号
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
