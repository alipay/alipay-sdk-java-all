package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 二手车处理结果
 *
 * @author auto create
 * @since 1.0, 2024-08-19 14:21:46
 */
public class TransferCarResultResp extends AlipayObject {

	private static final long serialVersionUID = 2832352945985556868L;

	/**
	 * 对应外部 id 的处理结果
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * 外部id值
	 */
	@ApiField("out_id")
	private String outId;

	/**
	 * 处理结果 boolean true/false
	 */
	@ApiField("result")
	private Boolean result;

	public String getErrorMsg() {
		return this.errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getOutId() {
		return this.outId;
	}
	public void setOutId(String outId) {
		this.outId = outId;
	}

	public Boolean getResult() {
		return this.result;
	}
	public void setResult(Boolean result) {
		this.result = result;
	}

}
