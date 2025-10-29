package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.oudefinition.code.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-22 14:57:33
 */
public class AnttechOceanbaseOudefinitionCodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7353152484371893764L;

	/** 
	 * 支付宝账号
	 */
	@ApiField("alipay_account")
	private String alipayAccount;

	/** 
	 * 2088xx1131，2088账户
	 */
	@ApiField("alipay_virtual_id")
	private String alipayVirtualId;

	/** 
	 * 156，人民币
	 */
	@ApiField("base_currency_value")
	private String baseCurrencyValue;

	/** 
	 * 生效开始时间
	 */
	@ApiField("from_effective_date")
	private Date fromEffectiveDate;

	/** 
	 * ZN7(澳星贝斯)
	 */
	@ApiField("ou_code")
	private String ouCode;

	/** 
	 * 澳星贝斯-ZN7
	 */
	@ApiField("ou_name")
	private String ouName;

	/** 
	 * 156,人民币
	 */
	@ApiField("payment_currency_value")
	private String paymentCurrencyValue;

	/** 
	 * 地区
	 */
	@ApiField("region")
	private String region;

	/** 
	 * 生效结束时间
	 */
	@ApiField("to_effective_date")
	private Date toEffectiveDate;

	/** 
	 * 社会统一信用代码
	 */
	@ApiField("unified_social_credit_code")
	private String unifiedSocialCreditCode;

	public void setAlipayAccount(String alipayAccount) {
		this.alipayAccount = alipayAccount;
	}
	public String getAlipayAccount( ) {
		return this.alipayAccount;
	}

	public void setAlipayVirtualId(String alipayVirtualId) {
		this.alipayVirtualId = alipayVirtualId;
	}
	public String getAlipayVirtualId( ) {
		return this.alipayVirtualId;
	}

	public void setBaseCurrencyValue(String baseCurrencyValue) {
		this.baseCurrencyValue = baseCurrencyValue;
	}
	public String getBaseCurrencyValue( ) {
		return this.baseCurrencyValue;
	}

	public void setFromEffectiveDate(Date fromEffectiveDate) {
		this.fromEffectiveDate = fromEffectiveDate;
	}
	public Date getFromEffectiveDate( ) {
		return this.fromEffectiveDate;
	}

	public void setOuCode(String ouCode) {
		this.ouCode = ouCode;
	}
	public String getOuCode( ) {
		return this.ouCode;
	}

	public void setOuName(String ouName) {
		this.ouName = ouName;
	}
	public String getOuName( ) {
		return this.ouName;
	}

	public void setPaymentCurrencyValue(String paymentCurrencyValue) {
		this.paymentCurrencyValue = paymentCurrencyValue;
	}
	public String getPaymentCurrencyValue( ) {
		return this.paymentCurrencyValue;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	public String getRegion( ) {
		return this.region;
	}

	public void setToEffectiveDate(Date toEffectiveDate) {
		this.toEffectiveDate = toEffectiveDate;
	}
	public Date getToEffectiveDate( ) {
		return this.toEffectiveDate;
	}

	public void setUnifiedSocialCreditCode(String unifiedSocialCreditCode) {
		this.unifiedSocialCreditCode = unifiedSocialCreditCode;
	}
	public String getUnifiedSocialCreditCode( ) {
		return this.unifiedSocialCreditCode;
	}

}
