package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: techrisk.innovate.salesgpt.order.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:25:24
 */
public class TechriskInnovateSalesgptOrderModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3855742127276887428L;

	/** 
	 * 提交描述错误码
	 */
	@ApiField("order_submit_code")
	private String orderSubmitCode;

	/** 
	 * 提交描述
	 */
	@ApiField("order_submit_msg")
	private String orderSubmitMsg;

	/** 
	 * 订单上报或更新结果
	 */
	@ApiField("order_submit_result")
	private Boolean orderSubmitResult;

	public void setOrderSubmitCode(String orderSubmitCode) {
		this.orderSubmitCode = orderSubmitCode;
	}
	public String getOrderSubmitCode( ) {
		return this.orderSubmitCode;
	}

	public void setOrderSubmitMsg(String orderSubmitMsg) {
		this.orderSubmitMsg = orderSubmitMsg;
	}
	public String getOrderSubmitMsg( ) {
		return this.orderSubmitMsg;
	}

	public void setOrderSubmitResult(Boolean orderSubmitResult) {
		this.orderSubmitResult = orderSubmitResult;
	}
	public Boolean getOrderSubmitResult( ) {
		return this.orderSubmitResult;
	}

}
