package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 货运企业支付子户开户
 *
 * @author auto create
 * @since 1.0, 2025-10-16 15:21:26
 */
public class AlipayCommerceLogisticsFreightflowSubaccountCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6567289675696957498L;

	/**
	 * 物流公司编码
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 银行管理模式。
	 */
	@ApiField("mode")
	private String mode;

	/**
	 * 网商银行应用id,当mode为ANT_MYBANK时由网商提供给商户
	 */
	@ApiField("mybank_app_id")
	private String mybankAppId;

	/**
	 * 网商银行解决方案CODE,当mode为ANT_MYBANK时由网商提供给商户
	 */
	@ApiField("mybank_scene_code")
	private String mybankSceneCode;

	/**
	 * 网商场景.当mode为ANT_MYBANK时由网商提供给商户
	 */
	@ApiField("mybank_scene_type")
	private String mybankSceneType;

	/**
	 * 网商子场景,当mode为ANT_MYBANK时由网商提供给商户
	 */
	@ApiField("mybank_sub_scene")
	private String mybankSubScene;

	/**
	 * 唯一性区分
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 业务方自己的用户标识（类似于网商2266，主站相关的一般用支付宝2088开头的id）不要有中文
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 网点名称
	 */
	@ApiField("out_user_name")
	private String outUserName;

	/**
	 * 母户信息
	 */
	@ApiField("parent_info")
	private FreigtFlowAccount parentInfo;

	/**
	 * 如果mode为网商银行，则为网商银行分配
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 运企付开户时子户归属人信息,网货平台必填
	 */
	@ApiField("sub_account_owner_info")
	private FreightFlowSubAccountOwnerInfo subAccountOwnerInfo;

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getMode() {
		return this.mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getMybankAppId() {
		return this.mybankAppId;
	}
	public void setMybankAppId(String mybankAppId) {
		this.mybankAppId = mybankAppId;
	}

	public String getMybankSceneCode() {
		return this.mybankSceneCode;
	}
	public void setMybankSceneCode(String mybankSceneCode) {
		this.mybankSceneCode = mybankSceneCode;
	}

	public String getMybankSceneType() {
		return this.mybankSceneType;
	}
	public void setMybankSceneType(String mybankSceneType) {
		this.mybankSceneType = mybankSceneType;
	}

	public String getMybankSubScene() {
		return this.mybankSubScene;
	}
	public void setMybankSubScene(String mybankSubScene) {
		this.mybankSubScene = mybankSubScene;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

	public String getOutUserName() {
		return this.outUserName;
	}
	public void setOutUserName(String outUserName) {
		this.outUserName = outUserName;
	}

	public FreigtFlowAccount getParentInfo() {
		return this.parentInfo;
	}
	public void setParentInfo(FreigtFlowAccount parentInfo) {
		this.parentInfo = parentInfo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public FreightFlowSubAccountOwnerInfo getSubAccountOwnerInfo() {
		return this.subAccountOwnerInfo;
	}
	public void setSubAccountOwnerInfo(FreightFlowSubAccountOwnerInfo subAccountOwnerInfo) {
		this.subAccountOwnerInfo = subAccountOwnerInfo;
	}

}
