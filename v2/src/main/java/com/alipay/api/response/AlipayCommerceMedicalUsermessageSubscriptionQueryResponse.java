package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MedicalUserMessageSubcriptionInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.usermessage.subscription.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:29:55
 */
public class AlipayCommerceMedicalUsermessageSubscriptionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2881376526674788132L;

	/** 
	 * 用户消息订阅信息列表
	 */
	@ApiListField("data")
	@ApiField("medical_user_message_subcription_info")
	private List<MedicalUserMessageSubcriptionInfo> data;

	/** 
	 * 错误信息
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	public void setData(List<MedicalUserMessageSubcriptionInfo> data) {
		this.data = data;
	}
	public List<MedicalUserMessageSubcriptionInfo> getData( ) {
		return this.data;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage( ) {
		return this.errorMessage;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

}
