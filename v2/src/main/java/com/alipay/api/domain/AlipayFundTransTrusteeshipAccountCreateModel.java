package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建托管账号接口
 *
 * @author auto create
 * @since 1.0, 2023-01-09 15:59:51
 */
public class AlipayFundTransTrusteeshipAccountCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7834485478456596836L;

	/**
	 * 开户产品码，开户的具体业务类型
	 */
	@ApiField("account_product_code")
	private String accountProductCode;

	/**
	 * 开户场景码
	 */
	@ApiField("account_scene_code")
	private String accountSceneCode;

	/**
	 * 支付宝用户openid
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 外部商户系统会员的唯一标识
	 */
	@ApiField("merchant_user_id")
	private String merchantUserId;

	/**
	 * 用户类型
党组织:PARTY_ORGANIZATION
企业组织:BUSINESS_ORGANIZATION
企业员工:BUSINESS_EMPLOYEE
	 */
	@ApiField("merchant_user_type")
	private String merchantUserType;

	public String getAccountProductCode() {
		return this.accountProductCode;
	}
	public void setAccountProductCode(String accountProductCode) {
		this.accountProductCode = accountProductCode;
	}

	public String getAccountSceneCode() {
		return this.accountSceneCode;
	}
	public void setAccountSceneCode(String accountSceneCode) {
		this.accountSceneCode = accountSceneCode;
	}

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getMerchantUserId() {
		return this.merchantUserId;
	}
	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}

	public String getMerchantUserType() {
		return this.merchantUserType;
	}
	public void setMerchantUserType(String merchantUserType) {
		this.merchantUserType = merchantUserType;
	}

}
