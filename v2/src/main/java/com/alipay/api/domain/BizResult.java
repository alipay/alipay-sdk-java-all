package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务结果
 *
 * @author auto create
 * @since 1.0, 2020-05-20 15:42:29
 */
public class BizResult extends AlipayObject {

	private static final long serialVersionUID = 7228548327336117438L;

	/**
	 * 编码后的真实业务信息
	 */
	@ApiField("encoded_result_obj")
	private String encodedResultObj;

	/**
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误信息，面向开发人员
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * 中文错误信息，面向客户
	 */
	@ApiField("error_view_msg")
	private String errorViewMsg;

	/**
	 * 是否需要重试
	 */
	@ApiField("need_retry")
	private Boolean needRetry;

	/**
	 * 业务成功失败
	 */
	@ApiField("success")
	private Boolean success;

	public String getEncodedResultObj() {
		return this.encodedResultObj;
	}
	public void setEncodedResultObj(String encodedResultObj) {
		this.encodedResultObj = encodedResultObj;
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

	public String getErrorViewMsg() {
		return this.errorViewMsg;
	}
	public void setErrorViewMsg(String errorViewMsg) {
		this.errorViewMsg = errorViewMsg;
	}

	public Boolean getNeedRetry() {
		return this.needRetry;
	}
	public void setNeedRetry(Boolean needRetry) {
		this.needRetry = needRetry;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

}
