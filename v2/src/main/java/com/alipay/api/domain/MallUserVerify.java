package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户订单核销码模型
 *
 * @author auto create
 * @since 1.0, 2019-01-22 17:43:14
 */
public class MallUserVerify extends AlipayObject {

	private static final long serialVersionUID = 6397882221495875691L;

	/**
	 * 核销状态：UNUSE：未核销，USE：已经核销，CLOSE：关闭
	 */
	@ApiField("status")
	private String status;

	/**
	 * 核销码类型，包括：SCENE_ORDER(场景订单)
	 */
	@ApiField("type")
	private String type;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户订单核销码
	 */
	@ApiField("verify_code")
	private String verifyCode;

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVerifyCode() {
		return this.verifyCode;
	}
	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

}
