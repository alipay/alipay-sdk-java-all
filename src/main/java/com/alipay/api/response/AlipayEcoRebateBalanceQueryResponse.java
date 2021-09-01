package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.rebate.balance.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-26 14:52:49
 */
public class AlipayEcoRebateBalanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4761197899154497916L;

	/** 
	 * 商户侧商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 给用户发放的集分宝数量
	 */
	@ApiField("rebate_jfb")
	private String rebateJfb;

	/** 
	 * 表示商品的返利比例，例如0.1表示返利比例为10%
	 */
	@ApiField("rebate_rate")
	private String rebateRate;

	/** 
	 * 表示当前用户是否已注册返利卡，如果已注册，则显示相应的返利信息，否则，显示开卡信息
	 */
	@ApiField("registered")
	private Boolean registered;

	/** 
	 * 商家集分宝余额是否足够，如果足够，就显示相应的返利比例，如果不够，则不显示返利信息
	 */
	@ApiField("sufficient_balance")
	private Boolean sufficientBalance;

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId( ) {
		return this.itemId;
	}

	public void setRebateJfb(String rebateJfb) {
		this.rebateJfb = rebateJfb;
	}
	public String getRebateJfb( ) {
		return this.rebateJfb;
	}

	public void setRebateRate(String rebateRate) {
		this.rebateRate = rebateRate;
	}
	public String getRebateRate( ) {
		return this.rebateRate;
	}

	public void setRegistered(Boolean registered) {
		this.registered = registered;
	}
	public Boolean getRegistered( ) {
		return this.registered;
	}

	public void setSufficientBalance(Boolean sufficientBalance) {
		this.sufficientBalance = sufficientBalance;
	}
	public Boolean getSufficientBalance( ) {
		return this.sufficientBalance;
	}

}
