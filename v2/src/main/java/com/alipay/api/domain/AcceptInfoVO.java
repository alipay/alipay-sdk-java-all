package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单受理模式
 *
 * @author auto create
 * @since 1.0, 2024-09-01 22:13:49
 */
public class AcceptInfoVO extends AlipayObject {

	private static final long serialVersionUID = 2725257923597738458L;

	/**
	 * 订单的受理模式，租赁类型订单且通过交易组件快捷下单场景特有
	 */
	@ApiField("accept_mode")
	private String acceptMode;

	/**
	 * 人脸核身结果
	 */
	@ApiField("verify_result")
	private String verifyResult;

	public String getAcceptMode() {
		return this.acceptMode;
	}
	public void setAcceptMode(String acceptMode) {
		this.acceptMode = acceptMode;
	}

	public String getVerifyResult() {
		return this.verifyResult;
	}
	public void setVerifyResult(String verifyResult) {
		this.verifyResult = verifyResult;
	}

}
