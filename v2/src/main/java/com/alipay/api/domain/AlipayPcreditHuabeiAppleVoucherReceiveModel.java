package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 苹果NPI会场领取分期专享额度券
 *
 * @author auto create
 * @since 1.0, 2026-08-18 17:38:57
 */
public class AlipayPcreditHuabeiAppleVoucherReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 1515938675638648154L;

	/**
	 * 不同活动传不同活动id
	 */
	@ApiField("amount_activity_id")
	private String amountActivityId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户id，政策给出
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 场景标识
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getAmountActivityId() {
		return this.amountActivityId;
	}
	public void setAmountActivityId(String amountActivityId) {
		this.amountActivityId = amountActivityId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
