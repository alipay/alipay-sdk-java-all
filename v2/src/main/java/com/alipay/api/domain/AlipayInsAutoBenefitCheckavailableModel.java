package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车险权益使用资格查询
 *
 * @author auto create
 * @since 1.0, 2022-12-28 16:56:00
 */
public class AlipayInsAutoBenefitCheckavailableModel extends AlipayObject {

	private static final long serialVersionUID = 4422368847345139766L;

	/**
	 * 支付宝权益编码标识
	 */
	@ApiField("benefit_code")
	private String benefitCode;

	/**
	 * 预留扩展字段
	 */
	@ApiField("extend")
	private String extend;

	/**
	 * 支付宝用户标识openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户标识
	 */
	@ApiField("user_id")
	private String userId;

	public String getBenefitCode() {
		return this.benefitCode;
	}
	public void setBenefitCode(String benefitCode) {
		this.benefitCode = benefitCode;
	}

	public String getExtend() {
		return this.extend;
	}
	public void setExtend(String extend) {
		this.extend = extend;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
