package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.baitiaoprod.account.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayBaitiaoprodAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4632939747617985612L;

	/** 
	 * 本次接口调用的错误信息描述
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * 当前账号是否已签约
	 */
	@ApiField("has_sign")
	private Boolean hasSign;

	/** 
	 * 当前账号在余额宝分期付是否有未完结的订单
	 */
	@ApiField("has_unfinished_order")
	private Boolean hasUnfinishedOrder;

	/** 
	 * 当前账号是否在余额宝分期付服务中
	 */
	@ApiField("in_service")
	private Boolean inService;

	/** 
	 * 本次接口调用是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage( ) {
		return this.errorMessage;
	}

	public void setHasSign(Boolean hasSign) {
		this.hasSign = hasSign;
	}
	public Boolean getHasSign( ) {
		return this.hasSign;
	}

	public void setHasUnfinishedOrder(Boolean hasUnfinishedOrder) {
		this.hasUnfinishedOrder = hasUnfinishedOrder;
	}
	public Boolean getHasUnfinishedOrder( ) {
		return this.hasUnfinishedOrder;
	}

	public void setInService(Boolean inService) {
		this.inService = inService;
	}
	public Boolean getInService( ) {
		return this.inService;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
