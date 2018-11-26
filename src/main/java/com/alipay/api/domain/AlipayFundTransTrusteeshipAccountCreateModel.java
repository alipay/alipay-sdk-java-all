package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建托管账号接口
 *
 * @author auto create
 * @since 1.0, 2018-09-27 11:10:03
 */
public class AlipayFundTransTrusteeshipAccountCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3135322859815379711L;

	/**
	 * 开户产品码，开户的具体业务类型
	 */
	@ApiField("account_product_code")
	private String accountProductCode;

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
