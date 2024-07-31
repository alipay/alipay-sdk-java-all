package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.areaplatform.msg.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-15 17:46:58
 */
public class AlipayCommerceMedicalAreaplatformMsgSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2559683439159755982L;

	/** 
	 * 业务错误描述
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * 消息id列表
	 */
	@ApiListField("msg_id_list")
	@ApiField("string")
	private List<String> msgIdList;

	/** 
	 * 业务结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage( ) {
		return this.errorMessage;
	}

	public void setMsgIdList(List<String> msgIdList) {
		this.msgIdList = msgIdList;
	}
	public List<String> getMsgIdList( ) {
		return this.msgIdList;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

}
