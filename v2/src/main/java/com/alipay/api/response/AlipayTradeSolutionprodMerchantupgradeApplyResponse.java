package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.solutionprod.merchantupgrade.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-17 21:42:42
 */
public class AlipayTradeSolutionprodMerchantupgradeApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7364643579414865114L;

	/** 
	 * 用于直接跳转至用户升级确认页面
	 */
	@ApiField("jump_url")
	private String jumpUrl;

	/** 
	 * 升级申请单号
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * INIT：获取返回的jump_url跳转至支付宝端进行用户确认、 PROCESSING：已存升级申请，正在处理中、SUCCESS：已存升级申请开通成功，RETRY:升级请求失败，可通过查询接口alipay.trade.solutionprod.merchantupgrade.query获取具体失败原因，解决后续使用原单重试
	 */
	@ApiField("status")
	private String status;

	public void setJumpUrl(String jumpUrl) {
		this.jumpUrl = jumpUrl;
	}
	public String getJumpUrl( ) {
		return this.jumpUrl;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
