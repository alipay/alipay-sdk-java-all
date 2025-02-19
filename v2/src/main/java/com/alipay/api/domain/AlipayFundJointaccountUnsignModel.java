package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业跳端解约
 *
 * @author auto create
 * @since 1.0, 2023-08-14 19:18:24
 */
public class AlipayFundJointaccountUnsignModel extends AlipayObject {

	private static final long serialVersionUID = 7158567383678267866L;

	/**
	 * 合花群ID<br>
补充说明：<br>
1. 该字段可在签约接口调用后，由alipay.fund. jointaccount.account.completed返回<br>
2. 该字段可在签约接口调用后，由alipay.fund. jointaccount.detail.query返回
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权协议号<br>
补充说明：<br>
1. 该字段可在签约接口调用后，由alipay.fund. jointaccount.account.completed返回<br>
2. 该字段可在签约接口调用后，由alipay.fund. jointaccount.detail.query返回
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * {"k":"v"}
	 */
	@ApiField("business_params")
	private String businessParams;

	/**
	 * （发起人）用户唯一标识
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * （发起人）账号类型，参考值如下<br>
ALIPAY_USER_ID：支付宝侧用户唯一标识
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 销售产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getBusinessParams() {
		return this.businessParams;
	}
	public void setBusinessParams(String businessParams) {
		this.businessParams = businessParams;
	}

	public String getIdentity() {
		return this.identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
