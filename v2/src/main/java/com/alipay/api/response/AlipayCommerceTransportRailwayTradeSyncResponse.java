package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.railway.trade.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-09 16:06:30
 */
public class AlipayCommerceTransportRailwayTradeSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2447586686739819443L;

	/** 
	 * 扩展信息，json格式，由双方约定取值
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 同步成功的账单数据ID
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 发生异常时的错误码，发生异常时非空
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 发生异常时的错误信息，发生异常时非空
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

}
