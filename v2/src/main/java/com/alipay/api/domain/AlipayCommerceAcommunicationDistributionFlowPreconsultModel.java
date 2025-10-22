package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流量订单预校验
 *
 * @author auto create
 * @since 1.0, 2025-09-23 14:18:59
 */
public class AlipayCommerceAcommunicationDistributionFlowPreconsultModel extends AlipayObject {

	private static final long serialVersionUID = 3248946786119664918L;

	/**
	 * 支付宝的userId
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 加密后手机号
	 */
	@ApiField("encrypted_mobile")
	private String encryptedMobile;

	/**
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 请求号
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 目标账号
	 */
	@ApiField("target_account")
	private String targetAccount;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getEncryptedMobile() {
		return this.encryptedMobile;
	}
	public void setEncryptedMobile(String encryptedMobile) {
		this.encryptedMobile = encryptedMobile;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTargetAccount() {
		return this.targetAccount;
	}
	public void setTargetAccount(String targetAccount) {
		this.targetAccount = targetAccount;
	}

}
