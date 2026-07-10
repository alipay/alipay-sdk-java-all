package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 货运企业支付主账户实时查余
 *
 * @author auto create
 * @since 1.0, 2026-02-26 14:16:36
 */
public class AlipayCommerceLogisticsFreightflowParentaccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3437636551214477787L;

	/**
	 * 账户卡号
	 */
	@ApiField("account_card_no")
	private String accountCardNo;

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
	 * 网商解决方案CODE,当mode为ANT_MYBANK时由网商提供给商户
	 */
	@ApiField("mybank_scene_code")
	private String mybankSceneCode;

	/**
	 * 如果mode为网商银行，则为网商银行分配,网商银行可不填。
如果mode为浦发银行，则为浦发APP对应的X-SPDB-Client-ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 浦发银行特定场景参数,当mode=SPDB时必选
	 */
	@ApiField("spdb_spec_params")
	private FreightFlowSpdbSpecParams spdbSpecParams;

	public String getAccountCardNo() {
		return this.accountCardNo;
	}
	public void setAccountCardNo(String accountCardNo) {
		this.accountCardNo = accountCardNo;
	}

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

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public FreightFlowSpdbSpecParams getSpdbSpecParams() {
		return this.spdbSpecParams;
	}
	public void setSpdbSpecParams(FreightFlowSpdbSpecParams spdbSpecParams) {
		this.spdbSpecParams = spdbSpecParams;
	}

}
