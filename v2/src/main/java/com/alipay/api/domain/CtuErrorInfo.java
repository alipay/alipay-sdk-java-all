package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * CTU事件发送后返回的错误信息
 *
 * @author auto create
 * @since 1.0, 2023-10-12 20:18:43
 */
public class CtuErrorInfo extends AlipayObject {

	private static final long serialVersionUID = 8266939487364724843L;

	/**
	 * ctu事件发送校验结果：
success：校验通过；needRecheck：需要灰商户核身校验；failed：阻断业务
	 */
	@ApiField("check_result")
	private String checkResult;

	/**
	 * 风险咨询不通过的错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 风险咨询不通过的错误信息
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * 风险文案编码
	 */
	@ApiField("risk_temp_code")
	private String riskTempCode;

	public String getCheckResult() {
		return this.checkResult;
	}
	public void setCheckResult(String checkResult) {
		this.checkResult = checkResult;
	}

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getRiskTempCode() {
		return this.riskTempCode;
	}
	public void setRiskTempCode(String riskTempCode) {
		this.riskTempCode = riskTempCode;
	}

}
