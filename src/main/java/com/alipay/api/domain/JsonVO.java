package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 银行流水认领结果
 *
 * @author auto create
 * @since 1.0, 2021-12-01 21:22:41
 */
public class JsonVO extends AlipayObject {

	private static final long serialVersionUID = 5565135849266337916L;

	/**
	 * 失败信息
	 */
	@ApiField("err_msg")
	private String errMsg;

	/**
	 * 是否成功
	 */
	@ApiField("is_success")
	private String isSuccess;

	public String getErrMsg() {
		return this.errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public String getIsSuccess() {
		return this.isSuccess;
	}
	public void setIsSuccess(String isSuccess) {
		this.isSuccess = isSuccess;
	}

}
