package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数据结果返回值
 *
 * @author auto create
 * @since 1.0, 2022-08-26 11:07:32
 */
public class RcSmartAuditResponse extends AlipayObject {

	private static final long serialVersionUID = 7525538219148657633L;

	/**
	 * 解语花风险内容结果
	 */
	@ApiField("data")
	private ContentAuditResult data;

	/**
	 * 返回的提示信息
	 */
	@ApiField("message")
	private String message;

	/**
	 * 32	返回的结果编码。枚举
SUCCESS：成功
INTERNAL_ERROR：服务异常
	 */
	@ApiField("result_code")
	private String resultCode;

	/**
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public ContentAuditResult getData() {
		return this.data;
	}
	public void setData(ContentAuditResult data) {
		this.data = data;
	}

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public String getResultCode() {
		return this.resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

}
