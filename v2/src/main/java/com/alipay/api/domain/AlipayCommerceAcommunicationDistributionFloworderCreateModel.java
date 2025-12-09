package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流量分销创单接口
 *
 * @author auto create
 * @since 1.0, 2025-11-18 13:55:03
 */
public class AlipayCommerceAcommunicationDistributionFloworderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3493396771577468947L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 加密后手机号
	 */
	@ApiField("encrypted_mobile")
	private String encryptedMobile;

	/**
	 * 机构订单id
	 */
	@ApiField("inst_order_id")
	private String instOrderId;

	/**
	 * 分销商品id
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
	 * 支付类型
	 */
	@ApiField("pay_type")
	private String payType;

	/**
	 * 订购价格，单位元
	 */
	@ApiField("price")
	private String price;

	/**
	 * 协议id
	 */
	@ApiField("protocol_sequence_id")
	private String protocolSequenceId;

	/**
	 * 短信验证码
	 */
	@ApiField("sms_code")
	private String smsCode;

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

	public String getInstOrderId() {
		return this.instOrderId;
	}
	public void setInstOrderId(String instOrderId) {
		this.instOrderId = instOrderId;
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

	public String getPayType() {
		return this.payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getProtocolSequenceId() {
		return this.protocolSequenceId;
	}
	public void setProtocolSequenceId(String protocolSequenceId) {
		this.protocolSequenceId = protocolSequenceId;
	}

	public String getSmsCode() {
		return this.smsCode;
	}
	public void setSmsCode(String smsCode) {
		this.smsCode = smsCode;
	}

	public String getTargetAccount() {
		return this.targetAccount;
	}
	public void setTargetAccount(String targetAccount) {
		this.targetAccount = targetAccount;
	}

}
