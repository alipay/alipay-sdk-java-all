package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用信息模型
 *
 * @author auto create
 * @since 1.0, 2024-11-26 13:18:04
 */
public class CreditInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 3878377149932754938L;

	/**
	 * 芝麻先享受理台用户开通成功后，商家自定义页面跳转地址
	 */
	@ApiField("acceptance_jump_url")
	private String acceptanceJumpUrl;

	/**
	 * 芝麻免押周期扣款类型，使用芝麻免押产品时该字段必传
	 */
	@ApiField("credit_deposit_period_pay_type")
	private String creditDepositPeriodPayType;

	/**
	 * 芝麻任务信息
	 */
	@ApiField("credit_go_info")
	private CreditGoInfo creditGoInfo;

	/**
	 * 使用芝麻信用服务的产品码，不传默认使用芝麻先享服务
	 */
	@ApiField("credit_product_code")
	private String creditProductCode;

	/**
	 * 使用芝麻信用先享服务，是否不需要核身，默认false：表示需要当前订单需要核身
	 */
	@ApiField("no_need_verify_identity")
	private Boolean noNeedVerifyIdentity;

	/**
	 * 商户外部协议号，不同的支付宝用户需要传递不同的外部单号,使用芝麻先享能力必传
	 */
	@ApiField("out_agreement_no")
	private String outAgreementNo;

	/**
	 * 传smid在芝麻侧生成的信用服务id,使用芝麻先享能力必传
	 */
	@ApiField("zm_service_id")
	private String zmServiceId;

	public String getAcceptanceJumpUrl() {
		return this.acceptanceJumpUrl;
	}
	public void setAcceptanceJumpUrl(String acceptanceJumpUrl) {
		this.acceptanceJumpUrl = acceptanceJumpUrl;
	}

	public String getCreditDepositPeriodPayType() {
		return this.creditDepositPeriodPayType;
	}
	public void setCreditDepositPeriodPayType(String creditDepositPeriodPayType) {
		this.creditDepositPeriodPayType = creditDepositPeriodPayType;
	}

	public CreditGoInfo getCreditGoInfo() {
		return this.creditGoInfo;
	}
	public void setCreditGoInfo(CreditGoInfo creditGoInfo) {
		this.creditGoInfo = creditGoInfo;
	}

	public String getCreditProductCode() {
		return this.creditProductCode;
	}
	public void setCreditProductCode(String creditProductCode) {
		this.creditProductCode = creditProductCode;
	}

	public Boolean getNoNeedVerifyIdentity() {
		return this.noNeedVerifyIdentity;
	}
	public void setNoNeedVerifyIdentity(Boolean noNeedVerifyIdentity) {
		this.noNeedVerifyIdentity = noNeedVerifyIdentity;
	}

	public String getOutAgreementNo() {
		return this.outAgreementNo;
	}
	public void setOutAgreementNo(String outAgreementNo) {
		this.outAgreementNo = outAgreementNo;
	}

	public String getZmServiceId() {
		return this.zmServiceId;
	}
	public void setZmServiceId(String zmServiceId) {
		this.zmServiceId = zmServiceId;
	}

}
