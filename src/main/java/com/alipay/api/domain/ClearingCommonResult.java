package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 清算facade公共返回结果
 *
 * @author auto create
 * @since 1.0, 2020-06-24 12:05:41
 */
public class ClearingCommonResult extends AlipayObject {

	private static final long serialVersionUID = 8588144414352399646L;

	/**
	 * 返回结果code
	 */
	@ApiField("result_code")
	private String resultCode;

	/**
	 * 结果中文描述
EXECUTE_SUCCESS
UNKNOWN_EXCEPTION
DATABASE_EXCEPTION
	 */
	@ApiField("result_description")
	private String resultDescription;

	/**
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public String getResultCode() {
		return this.resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultDescription() {
		return this.resultDescription;
	}
	public void setResultDescription(String resultDescription) {
		this.resultDescription = resultDescription;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

}
