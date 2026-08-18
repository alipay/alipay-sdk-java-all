package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流量订单预校验
 *
 * @author auto create
 * @since 1.0, 2026-08-18 09:40:17
 */
public class AlipayCommerceAcommunicationDistributionFlowPreconsultModel extends AlipayObject {

	private static final long serialVersionUID = 8649897261658213714L;

	/**
	 * 触达渠道
	 */
	@ApiField("access_channel")
	private String accessChannel;

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
	 * 一级投流平台
	 */
	@ApiField("first_channel")
	private String firstChannel;

	/**
	 * 固定点位
	 */
	@ApiField("fixed_position_code")
	private String fixedPositionCode;

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
	 * 订购页URL
	 */
	@ApiField("proxy_order_url")
	private String proxyOrderUrl;

	/**
	 * 报备素材编号
	 */
	@ApiField("report_materials_no")
	private String reportMaterialsNo;

	/**
	 * 请求号
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 二级投流平台
	 */
	@ApiField("second_channel")
	private String secondChannel;

	/**
	 * 目标账号
	 */
	@ApiField("target_account")
	private String targetAccount;

	public String getAccessChannel() {
		return this.accessChannel;
	}
	public void setAccessChannel(String accessChannel) {
		this.accessChannel = accessChannel;
	}

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

	public String getFirstChannel() {
		return this.firstChannel;
	}
	public void setFirstChannel(String firstChannel) {
		this.firstChannel = firstChannel;
	}

	public String getFixedPositionCode() {
		return this.fixedPositionCode;
	}
	public void setFixedPositionCode(String fixedPositionCode) {
		this.fixedPositionCode = fixedPositionCode;
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

	public String getProxyOrderUrl() {
		return this.proxyOrderUrl;
	}
	public void setProxyOrderUrl(String proxyOrderUrl) {
		this.proxyOrderUrl = proxyOrderUrl;
	}

	public String getReportMaterialsNo() {
		return this.reportMaterialsNo;
	}
	public void setReportMaterialsNo(String reportMaterialsNo) {
		this.reportMaterialsNo = reportMaterialsNo;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSecondChannel() {
		return this.secondChannel;
	}
	public void setSecondChannel(String secondChannel) {
		this.secondChannel = secondChannel;
	}

	public String getTargetAccount() {
		return this.targetAccount;
	}
	public void setTargetAccount(String targetAccount) {
		this.targetAccount = targetAccount;
	}

}
