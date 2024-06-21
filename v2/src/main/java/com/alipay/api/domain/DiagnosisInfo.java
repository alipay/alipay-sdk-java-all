package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 诊断信息
 *
 * @author auto create
 * @since 1.0, 2019-04-17 16:16:07
 */
public class DiagnosisInfo extends AlipayObject {

	private static final long serialVersionUID = 1855827177285952211L;

	/**
	 * 推荐的决策码，业务方可以根据这个码来做具体的事情
	 */
	@ApiField("decision_code")
	private String decisionCode;

	/**
	 * 对决策信息的中文描述，方便业务方能更好感知问题解决方案
	 */
	@ApiField("decision_desc")
	private String decisionDesc;

	/**
	 * 系统异常
	 */
	@ApiField("orgin_error_code")
	private String orginErrorCode;

	/**
	 * 错误原因的code类型，外围可以用这个类型，知道是什么原因
	 */
	@ApiField("reason_code")
	private String reasonCode;

	/**
	 * 对于错误原因的具体中文描述
	 */
	@ApiField("reason_desc")
	private String reasonDesc;

	/**
	 * 具体问题的时间
	 */
	@ApiField("time")
	private String time;

	public String getDecisionCode() {
		return this.decisionCode;
	}
	public void setDecisionCode(String decisionCode) {
		this.decisionCode = decisionCode;
	}

	public String getDecisionDesc() {
		return this.decisionDesc;
	}
	public void setDecisionDesc(String decisionDesc) {
		this.decisionDesc = decisionDesc;
	}

	public String getOrginErrorCode() {
		return this.orginErrorCode;
	}
	public void setOrginErrorCode(String orginErrorCode) {
		this.orginErrorCode = orginErrorCode;
	}

	public String getReasonCode() {
		return this.reasonCode;
	}
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getReasonDesc() {
		return this.reasonDesc;
	}
	public void setReasonDesc(String reasonDesc) {
		this.reasonDesc = reasonDesc;
	}

	public String getTime() {
		return this.time;
	}
	public void setTime(String time) {
		this.time = time;
	}

}
