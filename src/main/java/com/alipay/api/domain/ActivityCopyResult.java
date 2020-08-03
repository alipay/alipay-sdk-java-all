package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动权益复制结果
 *
 * @author auto create
 * @since 1.0, 2019-12-05 18:09:02
 */
public class ActivityCopyResult extends AlipayObject {

	private static final long serialVersionUID = 1342573752666621249L;

	/**
	 * 活动权益复制内容，和入参中copy_content相对应，表示其执行结果
	 */
	@ApiField("copy_content")
	private String copyContent;

	/**
	 * 本对象中copy_content所对应的活动权益复制失败原因，当result=fail时本字段才有值
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * 本对象中copy_content所对应的活动权益复制结果，值为success和fail
	 */
	@ApiField("result")
	private Boolean result;

	public String getCopyContent() {
		return this.copyContent;
	}
	public void setCopyContent(String copyContent) {
		this.copyContent = copyContent;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Boolean getResult() {
		return this.result;
	}
	public void setResult(Boolean result) {
		this.result = result;
	}

}
