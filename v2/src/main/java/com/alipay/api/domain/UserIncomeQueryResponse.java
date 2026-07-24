package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-04-14 14:27:45
 */
public class UserIncomeQueryResponse extends AlipayObject {

	private static final long serialVersionUID = 6797483425326981297L;

	/**
	 * 收入金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 收入月份
	 */
	@ApiField("biz_month")
	private String bizMonth;

	/**
	 * 币种
	 */
	@ApiField("currency_code")
	private String currencyCode;

	/**
	 * 官网用户id
	 */
	@ApiField("passport_id")
	private String passportId;

	/**
	 * 海图用户id
	 */
	@ApiField("platform_id")
	private String platformId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBizMonth() {
		return this.bizMonth;
	}
	public void setBizMonth(String bizMonth) {
		this.bizMonth = bizMonth;
	}

	public String getCurrencyCode() {
		return this.currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getPassportId() {
		return this.passportId;
	}
	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}

	public String getPlatformId() {
		return this.platformId;
	}
	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

}
