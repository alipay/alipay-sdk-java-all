package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流水认领返回结果
 *
 * @author auto create
 * @since 1.0, 2021-12-10 11:50:18
 */
public class JsonOpenApiVO extends AlipayObject {

	private static final long serialVersionUID = 4159671884276653655L;

	/**
	 * 错误信息
	 */
	@ApiField("err_msg")
	private String errMsg;

	/**
	 * 是否成功
	 */
	@ApiField("success")
	private String success;

	public String getErrMsg() {
		return this.errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public String getSuccess() {
		return this.success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}

}
