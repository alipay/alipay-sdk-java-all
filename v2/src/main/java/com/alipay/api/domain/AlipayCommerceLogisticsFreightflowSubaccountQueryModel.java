package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 货运企业支付子账户实时查余
 *
 * @author auto create
 * @since 1.0, 2025-07-02 19:13:41
 */
public class AlipayCommerceLogisticsFreightflowSubaccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6887872544572367155L;

	/**
	 * 物流公司编码，由支付宝分配
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 银行管理模式。 本期： ANT_MYBANK(网商银行模式)
	 */
	@ApiField("mode")
	private String mode;

	/**
	 * 网商银行应用id,当mode为ANT_MYBANK时由网商提供给商户
	 */
	@ApiField("mybank_app_id")
	private String mybankAppId;

	/**
	 * 网商银行解决方案COED,当mode=ANT_MYBANK时必选
	 */
	@ApiField("mybank_scene_code")
	private String mybankSceneCode;

	/**
	 * 用于区分开户场景，映射解决方案实例配置。可与网商确认传入的必要性
	 */
	@ApiField("mybank_scene_type")
	private String mybankSceneType;

	/**
	 * 用于区分开户子场景，映射解决方案实例配置。可与网商确认传入的必要性
	 */
	@ApiField("mybank_sub_scene")
	private String mybankSubScene;

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
