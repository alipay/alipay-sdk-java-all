package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * TPA押金退款
 *
 * @author auto create
 * @since 1.0, 2026-05-26 16:47:50
 */
public class AlipayCommerceMedicalInsuranceTpadepositRefundModel extends AlipayObject {

	private static final long serialVersionUID = 7235231625869878826L;

	/**
	 * 用户ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 预授权申请单号
	 */
	@ApiField("pre_auth_no")
	private String preAuthNo;

	/**
	 * 退款金额,单位:元,人民币 
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 垫资方标识
	 */
	@ApiField("tpa_id")
	private String tpaId;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPreAuthNo() {
		return this.preAuthNo;
	}
	public void setPreAuthNo(String preAuthNo) {
		this.preAuthNo = preAuthNo;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getTpaId() {
		return this.tpaId;
	}
	public void setTpaId(String tpaId) {
		this.tpaId = tpaId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
