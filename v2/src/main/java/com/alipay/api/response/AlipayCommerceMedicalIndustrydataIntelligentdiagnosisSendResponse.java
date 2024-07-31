package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MedicalGuideChatContentDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.industrydata.intelligentdiagnosis.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-04 20:21:54
 */
public class AlipayCommerceMedicalIndustrydataIntelligentdiagnosisSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 3871691972883815481L;

	/** 
	 * 返回数据
	 */
	@ApiField("chat_content")
	private MedicalGuideChatContentDTO chatContent;

	/** 
	 * 业务结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 结果描述
	 */
	@ApiField("result_desc")
	private String resultDesc;

	public void setChatContent(MedicalGuideChatContentDTO chatContent) {
		this.chatContent = chatContent;
	}
	public MedicalGuideChatContentDTO getChatContent( ) {
		return this.chatContent;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}
	public String getResultDesc( ) {
		return this.resultDesc;
	}

}
