package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.timescard.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 15:32:42
 */
public class AlipayCommerceOperationTimescardOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6693923513624279336L;

	/** 
	 * 是否需要调用jsapi确认向卡包发卡
	 */
	@ApiField("is_need_invoke_jsapi")
	private Boolean isNeedInvokeJsapi;

	/** 
	 * 卡包发卡token
	 */
	@ApiField("kabao_token")
	private String kabaoToken;

	/** 
	 * 次卡订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 拉起收银台的订单参数
	 */
	@ApiField("order_str")
	private String orderStr;

	public void setIsNeedInvokeJsapi(Boolean isNeedInvokeJsapi) {
		this.isNeedInvokeJsapi = isNeedInvokeJsapi;
	}
	public Boolean getIsNeedInvokeJsapi( ) {
		return this.isNeedInvokeJsapi;
	}

	public void setKabaoToken(String kabaoToken) {
		this.kabaoToken = kabaoToken;
	}
	public String getKabaoToken( ) {
		return this.kabaoToken;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOrderStr(String orderStr) {
		this.orderStr = orderStr;
	}
	public String getOrderStr( ) {
		return this.orderStr;
	}

}
