package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.liferecord.send response.
 * 
 * @author auto create
 * @since 1.0, 2021-06-18 09:40:23
 */
public class ZhimaCustomerLiferecordSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 3729831165583335864L;

	/** 
	 * 数据回流是否成功
	 */
	@ApiField("feed_back_success")
	private Boolean feedBackSuccess;

	/** 
	 * 结果code
	 */
	@ApiField("sub_code")
	private String subCode;

	/** 
	 * code对应的数值码
	 */
	@ApiField("sub_code_number")
	private Long subCodeNumber;

	/** 
	 * 异常码说明
	 */
	@ApiField("sub_message")
	private String subMessage;

	/** 
	 * 接口调用是否成功
	 */
	@ApiField("sub_success")
	private Boolean subSuccess;

	public void setFeedBackSuccess(Boolean feedBackSuccess) {
		this.feedBackSuccess = feedBackSuccess;
	}
	public Boolean getFeedBackSuccess( ) {
		return this.feedBackSuccess;
	}

	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}
	public String getSubCode( ) {
		return this.subCode;
	}

	public void setSubCodeNumber(Long subCodeNumber) {
		this.subCodeNumber = subCodeNumber;
	}
	public Long getSubCodeNumber( ) {
		return this.subCodeNumber;
	}

	public void setSubMessage(String subMessage) {
		this.subMessage = subMessage;
	}
	public String getSubMessage( ) {
		return this.subMessage;
	}

	public void setSubSuccess(Boolean subSuccess) {
		this.subSuccess = subSuccess;
	}
	public Boolean getSubSuccess( ) {
		return this.subSuccess;
	}

}
