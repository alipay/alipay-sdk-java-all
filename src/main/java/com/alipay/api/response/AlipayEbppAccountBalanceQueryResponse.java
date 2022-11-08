package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.account.balance.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-31 16:35:36
 */
public class AlipayEbppAccountBalanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4821543427645167497L;

	/** 
	 * 机构子账号编码
	 */
	@ApiField("account")
	private String account;

	/** 
	 * 可用余额，单位分
	 */
	@ApiField("available_money")
	private String availableMoney;

	/** 
	 * 总余额，单位分
	 */
	@ApiField("balance")
	private String balance;

	/** 
	 * 余额对应的事件 YYYYMMDD
	 */
	@ApiField("date")
	private String date;

	/** 
	 * 冻结 余额单位分
	 */
	@ApiField("freeze_money")
	private String freezeMoney;

	/** 
	 * YYYYMMDDHHmmss，精确到秒的请求事件，代表请求账务返回数据时的时间
	 */
	@ApiField("request_time")
	private String requestTime;

	public void setAccount(String account) {
		this.account = account;
	}
	public String getAccount( ) {
		return this.account;
	}

	public void setAvailableMoney(String availableMoney) {
		this.availableMoney = availableMoney;
	}
	public String getAvailableMoney( ) {
		return this.availableMoney;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getBalance( ) {
		return this.balance;
	}

	public void setDate(String date) {
		this.date = date;
	}
	public String getDate( ) {
		return this.date;
	}

	public void setFreezeMoney(String freezeMoney) {
		this.freezeMoney = freezeMoney;
	}
	public String getFreezeMoney( ) {
		return this.freezeMoney;
	}

	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}
	public String getRequestTime( ) {
		return this.requestTime;
	}

}
