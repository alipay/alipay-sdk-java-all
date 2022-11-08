package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 解语花统一返回对象
 *
 * @author auto create
 * @since 1.0, 2022-08-22 14:17:47
 */
public class RcSmartResponse extends AlipayObject {

	private static final long serialVersionUID = 3139787759116189987L;

	/**
	 * 返回的提示信息
	 */
	@ApiField("message")
	private String message;

	/**
	 * 返回的结果编码。
其中FAIL和RATE_LIMIT可支持更换requestId重新发起
枚举
成功：SUCCESS
失败：FAIl
幂等：DUP_SUCESS
降级：DEGRADE
限流：RATE_LIMIT
	 */
	@ApiField("result_code")
	private String resultCode;

	/**
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;

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
