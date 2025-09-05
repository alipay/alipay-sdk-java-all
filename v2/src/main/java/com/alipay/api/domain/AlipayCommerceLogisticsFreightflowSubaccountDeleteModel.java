package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 货运企业支付子户销户
 *
 * @author auto create
 * @since 1.0, 2025-07-02 17:39:35
 */
public class AlipayCommerceLogisticsFreightflowSubaccountDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2124935472133728164L;

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
	 * 网商场景,当mode为ANT_MYBANK时由网商提供给商户
	 */
	@ApiField("mybank_scene_type")
	private String mybankSceneType;

	/**
	 * 网商子场景,当mode为ANT_MYBANK时由网商提供给商户
	 */
	@ApiField("mybank_sub_scene")
	private String mybankSubScene;

	/**
	 * 外部商户请求流水号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 子户唯一标识ID,与子户开户时使用的out_user_id需要保持一致
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 如果mode为网商银行，则为网商银行分配
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 子户卡号
	 */
	@ApiField("sub_bank_card_no")
	private String subBankCardNo;

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

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getSubBankCardNo() {
		return this.subBankCardNo;
	}
	public void setSubBankCardNo(String subBankCardNo) {
		this.subBankCardNo = subBankCardNo;
	}

}
