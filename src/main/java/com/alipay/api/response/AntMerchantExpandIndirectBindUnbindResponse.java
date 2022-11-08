package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.bind.unbind response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-11 14:35:40
 */
public class AntMerchantExpandIndirectBindUnbindResponse extends AlipayResponse {

	private static final long serialVersionUID = 8431579243714885117L;

	/** 
	 * 支付宝登录号，脱敏展示
	 */
	@ApiField("alipay_account")
	private String alipayAccount;

	/** 
	 * 解绑结果，TRUE成功，FALSE失败
	 */
	@ApiField("handle_result")
	private String handleResult;

	/** 
	 * 是否已经存在申请中的处理单
	 */
	@ApiField("has_apply")
	private String hasApply;

	/** 
	 * 申请单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 姓名
	 */
	@ApiField("user_name")
	private String userName;

	public void setAlipayAccount(String alipayAccount) {
		this.alipayAccount = alipayAccount;
	}
	public String getAlipayAccount( ) {
		return this.alipayAccount;
	}

	public void setHandleResult(String handleResult) {
		this.handleResult = handleResult;
	}
	public String getHandleResult( ) {
		return this.handleResult;
	}

	public void setHasApply(String hasApply) {
		this.hasApply = hasApply;
	}
	public String getHasApply( ) {
		return this.hasApply;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName( ) {
		return this.userName;
	}

}
