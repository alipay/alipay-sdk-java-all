package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退分润信息
 *
 * @author auto create
 * @since 1.0, 2016-11-21 12:06:26
 */
public class RefundRoyaltyInfo extends AlipayObject {

	private static final long serialVersionUID = 2331579415686461933L;

	/**
	 * 退分润备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 退分润金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 转入人支付宝账号对应用户ID[2088开头16位纯数字]；
trans_in和trans_in_email不能同时为空。
	 */
	@ApiField("trans_in")
	private String transIn;

	/**
	 * 转入人支付宝账号[原付出分润金额的账户]
trans_in和trans_in_email不能同时为空。
	 */
	@ApiField("trans_in_email")
	private String transInEmail;

	/**
	 * 转出人支付宝账号对应用户ID[2088开头16位纯数字]；
trans_out和trans_out_email不能同时为空
	 */
	@ApiField("trans_out")
	private String transOut;

	/**
	 * 转出人支付宝账号[原收到分润金额的账户]；
trans_out和trans_out_email不能同时为空。
	 */
	@ApiField("trans_out_email")
	private String transOutEmail;

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getTransIn() {
		return this.transIn;
	}
	public void setTransIn(String transIn) {
		this.transIn = transIn;
	}

	public String getTransInEmail() {
		return this.transInEmail;
	}
	public void setTransInEmail(String transInEmail) {
		this.transInEmail = transInEmail;
	}

	public String getTransOut() {
		return this.transOut;
	}
	public void setTransOut(String transOut) {
		this.transOut = transOut;
	}

	public String getTransOutEmail() {
		return this.transOutEmail;
	}
	public void setTransOutEmail(String transOutEmail) {
		this.transOutEmail = transOutEmail;
	}

}
