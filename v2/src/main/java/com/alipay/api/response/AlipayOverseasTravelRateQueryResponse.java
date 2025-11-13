package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.rate.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:21
 */
public class AlipayOverseasTravelRateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6827872772398766166L;

	/** 
	 * 货币代码，ISO标准alpha- 3币种代码，为当前查询的币种、或者根据国家码、经纬度定位所在国家对应的币种
	 */
	@ApiField("currency")
	private String currency;

	/** 
	 * 货币icon的url地址
	 */
	@ApiField("currency_icon")
	private String currencyIcon;

	/** 
	 * 支付宝会员等级，只有在入参user_id存在的情况下才返回
	 */
	@ApiField("customer_level")
	private String customerLevel;

	/** 
	 * 汇率，为支付宝当面付的当前币种/CNY的汇率值，如1美元=6.2345人民币元，即汇率为6.2345
	 */
	@ApiField("rate")
	private Long rate;

	/** 
	 * 汇率描述
	 */
	@ApiField("rate_desc")
	private String rateDesc;

	/** 
	 * 汇率来源说明
	 */
	@ApiField("rate_source")
	private String rateSource;

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCurrency( ) {
		return this.currency;
	}

	public void setCurrencyIcon(String currencyIcon) {
		this.currencyIcon = currencyIcon;
	}
	public String getCurrencyIcon( ) {
		return this.currencyIcon;
	}

	public void setCustomerLevel(String customerLevel) {
		this.customerLevel = customerLevel;
	}
	public String getCustomerLevel( ) {
		return this.customerLevel;
	}

	public void setRate(Long rate) {
		this.rate = rate;
	}
	public Long getRate( ) {
		return this.rate;
	}

	public void setRateDesc(String rateDesc) {
		this.rateDesc = rateDesc;
	}
	public String getRateDesc( ) {
		return this.rateDesc;
	}

	public void setRateSource(String rateSource) {
		this.rateSource = rateSource;
	}
	public String getRateSource( ) {
		return this.rateSource;
	}

}
