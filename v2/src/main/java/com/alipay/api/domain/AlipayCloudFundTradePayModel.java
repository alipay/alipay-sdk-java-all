package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 钱包代扣支付
 *
 * @author auto create
 * @since 1.0, 2024-10-18 16:03:22
 */
public class AlipayCloudFundTradePayModel extends AlipayObject {

	private static final long serialVersionUID = 1888256346671939392L;

	/**
	 * 代扣协议号, 对应于签约时，支付宝返回的协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 钱包场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 代扣协议中标示用户的唯一签约号(确保在商户系统中 唯一)。 格式规则:支持大写小写字母和数字，最长 32 位。 注意：签约时传入 external_agreement_no 则该值必填且需与签约接口传入值相同。
	 */
	@ApiField("external_agreement_no")
	private String externalAgreementNo;

	/**
	 * 待邀请用户的支付宝账号： identity_type是ALIPAY_USER_ID填支付宝会员账号； 是ALIPAY_LOGON_ID 填支付宝登录号（支持邮箱和手机号格式）
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 当identity_type=ALIPAY_OPEN_ID时才需要传入identity_open_id
	 */
	@ApiField("identity_open_id")
	private String identityOpenId;

	/**
	 * 待邀请的用户支付宝账号类型，目前支持如下类型： 1、ALIPAY_USER_ID 支付宝的会员ID 2、ALIPAY_LOGON_ID 支付宝登录号，支持邮箱和手机号格式
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 二级商户id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 商户订单号，需要保证不重复
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 钱包产品code一般为FUND_TRUSTSHIP
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 订单标题
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 场景钱包id
	 */
	@ApiField("user_wallet_id")
	private String userWalletId;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getExternalAgreementNo() {
		return this.externalAgreementNo;
	}
	public void setExternalAgreementNo(String externalAgreementNo) {
		this.externalAgreementNo = externalAgreementNo;
	}

	public String getIdentity() {
		return this.identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getIdentityOpenId() {
		return this.identityOpenId;
	}
	public void setIdentityOpenId(String identityOpenId) {
		this.identityOpenId = identityOpenId;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getUserWalletId() {
		return this.userWalletId;
	}
	public void setUserWalletId(String userWalletId) {
		this.userWalletId = userWalletId;
	}

}
