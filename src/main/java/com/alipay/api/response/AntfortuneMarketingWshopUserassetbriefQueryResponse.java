package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.marketing.wshop.userassetbrief.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AntfortuneMarketingWshopUserassetbriefQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6121121948752886826L;

	/** 
	 * 表示持有货币基金资产数量：ZERO("持有0个"), ONE("持有1个"), MORE("超过1个");
	 */
	@ApiField("currency_asset")
	private String currencyAsset;

	/** 
	 * 表示持有非货币基金资产数量：ZERO("持有0个"), ONE("持有1个"), MORE("超过1个");
	 */
	@ApiField("un_currency_asset")
	private String unCurrencyAsset;

	/** 
	 * 支付宝用户userID
	 */
	@ApiField("user_id")
	private String userId;

	public void setCurrencyAsset(String currencyAsset) {
		this.currencyAsset = currencyAsset;
	}
	public String getCurrencyAsset( ) {
		return this.currencyAsset;
	}

	public void setUnCurrencyAsset(String unCurrencyAsset) {
		this.unCurrencyAsset = unCurrencyAsset;
	}
	public String getUnCurrencyAsset( ) {
		return this.unCurrencyAsset;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
