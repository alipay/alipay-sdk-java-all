package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 第三方错误信息描述
 *
 * @author auto create
 * @since 1.0, 2020-05-06 19:07:46
 */
public class ThirdErrorContext extends AlipayObject {

	private static final long serialVersionUID = 1288453849948317281L;

	/**
	 * 支付宝三代错误码内部值
	 */
	@ApiField("third_error_code")
	private String thirdErrorCode;

	/**
	 * thirdErrorCode的错误描述
	 */
	@ApiField("third_error_msg")
	private String thirdErrorMsg;

	public String getThirdErrorCode() {
		return this.thirdErrorCode;
	}
	public void setThirdErrorCode(String thirdErrorCode) {
		this.thirdErrorCode = thirdErrorCode;
	}

	public String getThirdErrorMsg() {
		return this.thirdErrorMsg;
	}
	public void setThirdErrorMsg(String thirdErrorMsg) {
		this.thirdErrorMsg = thirdErrorMsg;
	}

}
