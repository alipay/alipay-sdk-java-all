package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单退款前商户回复确认退款结果
 *
 * @author auto create
 * @since 1.0, 2024-01-16 13:14:19
 */
public class AlipayMarketingCertificateOrderRefundconfirmcommitModel extends AlipayObject {

	private static final long serialVersionUID = 4772569867851871556L;

	/**
	 * 凭证标识ID。通过退款前向商户确认是否可以退款spi入参获取
	 */
	@ApiField("certificate_id")
	private String certificateId;

	/**
	 * 拒绝退款的三方码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 订单号。通过退款前向商户确认是否可以退款spi入参获取
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 拒绝原因
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 退款前向商户确认退款结果
	 */
	@ApiField("result")
	private String result;

	/**
	 * 买家的支付宝uid
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 买家的支付宝openId
	 */
	@ApiField("user_open_id")
	private String userOpenId;

	public String getCertificateId() {
		return this.certificateId;
	}
	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getResult() {
		return this.result;
	}
	public void setResult(String result) {
		this.result = result;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserOpenId() {
		return this.userOpenId;
	}
	public void setUserOpenId(String userOpenId) {
		this.userOpenId = userOpenId;
	}

}
