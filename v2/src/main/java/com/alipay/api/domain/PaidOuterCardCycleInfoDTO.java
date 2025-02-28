package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户连续购买付费卡信息
 *
 * @author auto create
 * @since 1.0, 2023-07-03 13:55:13
 */
public class PaidOuterCardCycleInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8615567852229895617L;

	/**
	 * 支付宝用户签约协议号
	 */
	@ApiField("alipay_deduct_agreement")
	private String alipayDeductAgreement;

	/**
	 * 支付宝代扣产品码
	 */
	@ApiField("alipay_deduct_product_code")
	private String alipayDeductProductCode;

	/**
	 * 支付宝代扣场景码
	 */
	@ApiField("alipay_deduct_scene")
	private String alipayDeductScene;

	/**
	 * 关闭连续购买原因。
	 */
	@ApiField("close_reason")
	private String closeReason;

	/**
	 * 用户开通连续购买类型。
	 */
	@ApiField("cycle_type")
	private String cycleType;

	/**
	 * 开通连续购买状态。
	 */
	@ApiField("open_status")
	private String openStatus;

	public String getAlipayDeductAgreement() {
		return this.alipayDeductAgreement;
	}
	public void setAlipayDeductAgreement(String alipayDeductAgreement) {
		this.alipayDeductAgreement = alipayDeductAgreement;
	}

	public String getAlipayDeductProductCode() {
		return this.alipayDeductProductCode;
	}
	public void setAlipayDeductProductCode(String alipayDeductProductCode) {
		this.alipayDeductProductCode = alipayDeductProductCode;
	}

	public String getAlipayDeductScene() {
		return this.alipayDeductScene;
	}
	public void setAlipayDeductScene(String alipayDeductScene) {
		this.alipayDeductScene = alipayDeductScene;
	}

	public String getCloseReason() {
		return this.closeReason;
	}
	public void setCloseReason(String closeReason) {
		this.closeReason = closeReason;
	}

	public String getCycleType() {
		return this.cycleType;
	}
	public void setCycleType(String cycleType) {
		this.cycleType = cycleType;
	}

	public String getOpenStatus() {
		return this.openStatus;
	}
	public void setOpenStatus(String openStatus) {
		this.openStatus = openStatus;
	}

}
