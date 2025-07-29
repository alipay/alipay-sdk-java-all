package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.sideloansign.close.preconsult response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-25 14:02:28
 */
public class AlipayPcreditLoanSideloansignClosePreconsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 3386161252243223134L;

	/** 
	 * 关闭申请状态 returnCode为SUCCESS。可选值：
QUALIFIED - 允许退出
REJECTED - 拒绝退出
	 */
	@ApiField("check_status")
	private String checkStatus;

	/** 
	 * 拒绝必填，拒绝原因描述
	 */
	@ApiField("fail_reanson_message")
	private String failReansonMessage;

	/** 
	 * 拒绝必填，拒绝退出原因码
	 */
	@ApiField("fail_reason_code")
	private String failReasonCode;

	/** 
	 * 表示请求处理状态。 SUCCESS - 成功 NEED_RETRY -需要重试 FAIL - 不可重试
	 */
	@ApiField("return_code")
	private String returnCode;

	/** 
	 * returnCode为FAIL或者NEED_RETRY状态下，返回具体错误码
	 */
	@ApiField("return_sub_code")
	private String returnSubCode;

	/** 
	 * 可以详细描述失败原因，方便双方定位问题
	 */
	@ApiField("return_sub_message")
	private String returnSubMessage;

	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
	}
	public String getCheckStatus( ) {
		return this.checkStatus;
	}

	public void setFailReansonMessage(String failReansonMessage) {
		this.failReansonMessage = failReansonMessage;
	}
	public String getFailReansonMessage( ) {
		return this.failReansonMessage;
	}

	public void setFailReasonCode(String failReasonCode) {
		this.failReasonCode = failReasonCode;
	}
	public String getFailReasonCode( ) {
		return this.failReasonCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}
	public String getReturnCode( ) {
		return this.returnCode;
	}

	public void setReturnSubCode(String returnSubCode) {
		this.returnSubCode = returnSubCode;
	}
	public String getReturnSubCode( ) {
		return this.returnSubCode;
	}

	public void setReturnSubMessage(String returnSubMessage) {
		this.returnSubMessage = returnSubMessage;
	}
	public String getReturnSubMessage( ) {
		return this.returnSubMessage;
	}

}
