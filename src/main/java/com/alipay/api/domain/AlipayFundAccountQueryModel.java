package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝资金账户资产查询接口
 *
 * @author auto create
 * @since 1.0, 2018-10-10 21:27:26
 */
public class AlipayFundAccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4438188392289426277L;

	/**
	 * 开户产品码。如果查询托管子户余额，必传且必须传入与开户时传入的值一致。
	 */
	@ApiField("account_product_code")
	private String accountProductCode;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 商户会员的唯一标识。如果传入的user_id为虚拟账户userId，此字段必传并比对一致性。
	 */
	@ApiField("merchant_user_id")
	private String merchantUserId;

	public String getAccountProductCode() {
		return this.accountProductCode;
	}
	public void setAccountProductCode(String accountProductCode) {
		this.accountProductCode = accountProductCode;
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

}
