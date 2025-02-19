package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.subsidiaries.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-16 11:24:30
 */
public class ZhimaMerchantSubsidiariesApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1177543631618826237L;

	/** 
	 * 业务错误码
	 */
	@ApiField("biz_error_code")
	private String bizErrorCode;

	/** 
	 * 业务错误信息
	 */
	@ApiField("biz_error_message")
	private String bizErrorMessage;

	/** 
	 * 工单标识
	 */
	@ApiField("order_no")
	private String orderNo;

	public void setBizErrorCode(String bizErrorCode) {
		this.bizErrorCode = bizErrorCode;
	}
	public String getBizErrorCode( ) {
		return this.bizErrorCode;
	}

	public void setBizErrorMessage(String bizErrorMessage) {
		this.bizErrorMessage = bizErrorMessage;
	}
	public String getBizErrorMessage( ) {
		return this.bizErrorMessage;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

}
