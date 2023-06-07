package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.subsidiaries.close response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 08:01:57
 */
public class ZhimaMerchantSubsidiariesCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 6585826671185225531L;

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
	 * 工单审核备注
	 */
	@ApiField("order_memo")
	private String orderMemo;

	/** 
	 * 工单标识，业务成功时返回工单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 工单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

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

	public void setOrderMemo(String orderMemo) {
		this.orderMemo = orderMemo;
	}
	public String getOrderMemo( ) {
		return this.orderMemo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

}
