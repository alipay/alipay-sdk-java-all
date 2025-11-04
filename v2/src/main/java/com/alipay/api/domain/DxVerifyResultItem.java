package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * decisionx的验证结果项
 *
 * @author auto create
 * @since 1.0, 2018-01-29 16:40:24
 */
public class DxVerifyResultItem extends AlipayObject {

	private static final long serialVersionUID = 4693538223966243748L;

	/**
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误信息
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * 验证的输入参数，map的json格式序列化传递
	 */
	@ApiField("input")
	private String input;

	/**
	 * 行号
	 */
	@ApiField("line")
	private Long line;

	/**
	 * 输出值，map的json格式序列化传递
	 */
	@ApiField("output")
	private String output;

	/**
	 * 预测的结果值，map的json 格式序列化传递
	 */
	@ApiField("predict")
	private String predict;

	/**
	 * 验证是否成功
	 */
	@ApiField("success")
	private Boolean success;

	/**
	 * 验证路径
	 */
	@ApiField("trace")
	private String trace;

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

	public String getInput() {
		return this.input;
	}
	public void setInput(String input) {
		this.input = input;
	}

	public Long getLine() {
		return this.line;
	}
	public void setLine(Long line) {
		this.line = line;
	}

	public String getOutput() {
		return this.output;
	}
	public void setOutput(String output) {
		this.output = output;
	}

	public String getPredict() {
		return this.predict;
	}
	public void setPredict(String predict) {
		this.predict = predict;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getTrace() {
		return this.trace;
	}
	public void setTrace(String trace) {
		this.trace = trace;
	}

}
