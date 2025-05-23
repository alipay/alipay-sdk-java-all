package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RiskCheckLabel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.traas.content.text.detect response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-29 11:36:22
 */
public class AlipayCloudTraasContentTextDetectResponse extends AlipayResponse {

	private static final long serialVersionUID = 6143264875721984355L;

	/** 
	 * 唯一请求ID
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 风险识别标签内容
	 */
	@ApiListField("risk_check_labels")
	@ApiField("risk_check_label")
	private List<RiskCheckLabel> riskCheckLabels;

	/** 
	 * 处置建议
枚举值
pass: pass
block: block
review: review
	 */
	@ApiField("suggestion")
	private String suggestion;

	/** 
	 * 是否同步返回
	 */
	@ApiField("sync")
	private Boolean sync;

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

	public void setRiskCheckLabels(List<RiskCheckLabel> riskCheckLabels) {
		this.riskCheckLabels = riskCheckLabels;
	}
	public List<RiskCheckLabel> getRiskCheckLabels( ) {
		return this.riskCheckLabels;
	}

	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}
	public String getSuggestion( ) {
		return this.suggestion;
	}

	public void setSync(Boolean sync) {
		this.sync = sync;
	}
	public Boolean getSync( ) {
		return this.sync;
	}

}
