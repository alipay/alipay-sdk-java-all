package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户支付宝账户支付能力
 *
 * @author auto create
 * @since 1.0, 2023-03-30 18:57:06
 */
public class AlipayTradePaygrowthPayabilityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5229685276686662721L;

	/**
	 * 业务标识，用于支付场景，需要根据具体的支付类型传值。
	 */
	@ApiField("biz_identity")
	private String bizIdentity;

	/**
	 * 支付宝openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 实际支付金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("real_pay_amount")
	private String realPayAmount;

	/**
	 * 请求来源，必传，新的场景取值需要根据业务定义。
	 */
	@ApiField("request_from")
	private String requestFrom;

	/**
	 * 支付宝userId，不能为空
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizIdentity() {
		return this.bizIdentity;
	}
	public void setBizIdentity(String bizIdentity) {
		this.bizIdentity = bizIdentity;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getRealPayAmount() {
		return this.realPayAmount;
	}
	public void setRealPayAmount(String realPayAmount) {
		this.realPayAmount = realPayAmount;
	}

	public String getRequestFrom() {
		return this.requestFrom;
	}
	public void setRequestFrom(String requestFrom) {
		this.requestFrom = requestFrom;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
