package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 移动券核销接口出参Body
 *
 * @author auto create
 * @since 1.0, 2024-11-28 14:26:06
 */
public class ChinaMobileOutBody extends AlipayObject {

	private static final long serialVersionUID = 7493128282128554836L;

	/**
	 * 返回数据
	 */
	@ApiField("data")
	private String data;

	/**
	 * 返回消息
	 */
	@ApiField("msg")
	private String msg;

	/**
	 * 移动核销结果错误码
	 */
	@ApiField("result_code")
	private String resultCode;

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getMsg() {
		return this.msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getResultCode() {
		return this.resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

}
