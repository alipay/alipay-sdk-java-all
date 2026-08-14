package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收质检问题答案对象
 *
 * @author auto create
 * @since 1.0, 2026-08-10 10:26:39
 */
public class RecycleInspectAnswerVO extends AlipayObject {

	private static final long serialVersionUID = 8647674678748668882L;

	/**
	 * 答案的类型
	 */
	@ApiField("answer_type")
	private String answerType;

	/**
	 * 答案内容
	 */
	@ApiField("answer_value")
	private String answerValue;

	/**
	 * 答案内容校验是否通过
	 */
	@ApiField("check_pass")
	private Boolean checkPass;

	/**
	 * 答案内容校验结果编码
	 */
	@ApiField("check_result_code")
	private String checkResultCode;

	/**
	 * 答案内容校验结果描述
	 */
	@ApiField("check_result_msg")
	private String checkResultMsg;

	public String getAnswerType() {
		return this.answerType;
	}
	public void setAnswerType(String answerType) {
		this.answerType = answerType;
	}

	public String getAnswerValue() {
		return this.answerValue;
	}
	public void setAnswerValue(String answerValue) {
		this.answerValue = answerValue;
	}

	public Boolean getCheckPass() {
		return this.checkPass;
	}
	public void setCheckPass(Boolean checkPass) {
		this.checkPass = checkPass;
	}

	public String getCheckResultCode() {
		return this.checkResultCode;
	}
	public void setCheckResultCode(String checkResultCode) {
		this.checkResultCode = checkResultCode;
	}

	public String getCheckResultMsg() {
		return this.checkResultMsg;
	}
	public void setCheckResultMsg(String checkResultMsg) {
		this.checkResultMsg = checkResultMsg;
	}

}
