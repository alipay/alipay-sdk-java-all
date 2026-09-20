package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预咨询开通联名卡
 *
 * @author auto create
 * @since 1.0, 2026-08-26 10:57:51
 */
public class AlipayPcreditHuabeiAffinitycardPreconsultModel extends AlipayObject {

	private static final long serialVersionUID = 3476242664442942684L;

	/**
	 * 账号类型
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 支付宝用户2088账号
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 商户与支付宝签约的PID，从商户与支付宝签约的销售方案中获取
	 */
	@ApiField("merchant_partner_id")
	private String merchantPartnerId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getMerchantPartnerId() {
		return this.merchantPartnerId;
	}
	public void setMerchantPartnerId(String merchantPartnerId) {
		this.merchantPartnerId = merchantPartnerId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

}
