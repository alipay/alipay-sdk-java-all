package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MedicalGuideChatInitDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.industrydata.intelligentdiagnosis.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:34:26
 */
public class AlipayCommerceMedicalIndustrydataIntelligentdiagnosisInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 1188472114713988423L;

	/** 
	 * 返回数据
	 */
	@ApiField("chat_init_result")
	private MedicalGuideChatInitDTO chatInitResult;

	/** 
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 结果描述
	 */
	@ApiField("result_desc")
	private String resultDesc;

	public void setChatInitResult(MedicalGuideChatInitDTO chatInitResult) {
		this.chatInitResult = chatInitResult;
	}
	public MedicalGuideChatInitDTO getChatInitResult( ) {
		return this.chatInitResult;
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
