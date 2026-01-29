package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发放奖品结果
 *
 * @author auto create
 * @since 1.0, 2025-07-10 14:48:41
 */
public class CouponSendResult extends AlipayObject {

	private static final long serialVersionUID = 6124836983732476292L;

	/**
	 * 发放奖品的id，发放成功时必填
	 */
	@ApiField("coupon_code")
	private String couponCode;

	/**
	 * 发放失败错误码，发放失败必填
	 */
	@ApiField("fail_reason_code")
	private String failReasonCode;

	/**
	 * 发放失败原因描述，发放失败时必填
	 */
	@ApiField("fail_reason_message")
	private String failReasonMessage;

	/**
	 * 奖品是否发放成功
	 */
	@ApiField("send_result")
	private Boolean sendResult;

	public String getCouponCode() {
		return this.couponCode;
	}
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public String getFailReasonCode() {
		return this.failReasonCode;
	}
	public void setFailReasonCode(String failReasonCode) {
		this.failReasonCode = failReasonCode;
	}

	public String getFailReasonMessage() {
		return this.failReasonMessage;
	}
	public void setFailReasonMessage(String failReasonMessage) {
		this.failReasonMessage = failReasonMessage;
	}

	public Boolean getSendResult() {
		return this.sendResult;
	}
	public void setSendResult(Boolean sendResult) {
		this.sendResult = sendResult;
	}

}
