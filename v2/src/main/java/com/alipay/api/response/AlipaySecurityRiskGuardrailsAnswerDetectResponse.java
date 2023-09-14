package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.guardrails.answer.detect response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-30 18:46:42
 */
public class AlipaySecurityRiskGuardrailsAnswerDetectResponse extends AlipayResponse {

	private static final long serialVersionUID = 2545988664736832612L;

	/** 
	 * 风险识别标签内容
	 */
	@ApiListField("detect_check_labels")
	@ApiField("string")
	private List<String> detectCheckLabels;

	/** 
	 * 检测数据ID
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 处置建议：pass、review、block
	 */
	@ApiField("suggestion")
	private String suggestion;

	public void setDetectCheckLabels(List<String> detectCheckLabels) {
		this.detectCheckLabels = detectCheckLabels;
	}
	public List<String> getDetectCheckLabels( ) {
		return this.detectCheckLabels;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}
	public String getSuggestion( ) {
		return this.suggestion;
	}

}
