package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.payment.trade.subaccount.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 07:55:00
 */
public class MybankPaymentTradeSubaccountCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3292336634656254369L;

	/** 
	 * 账户名称
	 */
	@ApiField("account_name")
	private String accountName;

	/** 
	 * 开户行名称
	 */
	@ApiField("branch_name")
	private String branchName;

	/** 
	 * 银行联行号
	 */
	@ApiField("branch_no")
	private String branchNo;

	/** 
	 * 币种
	 */
	@ApiField("currency_value")
	private String currencyValue;

	/** 
	 * 开户时间戳（yyyyMMddHHmmss）
	 */
	@ApiField("open_account_time")
	private String openAccountTime;

	/** 
	 * 外部渠道ID
	 */
	@ApiField("out_channel_id")
	private String outChannelId;

	/** 
	 * 母户卡号
	 */
	@ApiField("parent_card_no")
	private String parentCardNo;

	/** 
	 * 请求流水号
	 */
	@ApiField("request_no")
	private String requestNo;

	/** 
	 * 外部平台判断是否需要重试，失败时有值，true=需要重试，false=不需要重试，是否重试可以由业务决定
	 */
	@ApiField("retry")
	private String retry;

	/** 
	 * 子户卡号
	 */
	@ApiField("sub_card_no")
	private String subCardNo;

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountName( ) {
		return this.accountName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchName( ) {
		return this.branchName;
	}

	public void setBranchNo(String branchNo) {
		this.branchNo = branchNo;
	}
	public String getBranchNo( ) {
		return this.branchNo;
	}

	public void setCurrencyValue(String currencyValue) {
		this.currencyValue = currencyValue;
	}
	public String getCurrencyValue( ) {
		return this.currencyValue;
	}

	public void setOpenAccountTime(String openAccountTime) {
		this.openAccountTime = openAccountTime;
	}
	public String getOpenAccountTime( ) {
		return this.openAccountTime;
	}

	public void setOutChannelId(String outChannelId) {
		this.outChannelId = outChannelId;
	}
	public String getOutChannelId( ) {
		return this.outChannelId;
	}

	public void setParentCardNo(String parentCardNo) {
		this.parentCardNo = parentCardNo;
	}
	public String getParentCardNo( ) {
		return this.parentCardNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}
	public String getRequestNo( ) {
		return this.requestNo;
	}

	public void setRetry(String retry) {
		this.retry = retry;
	}
	public String getRetry( ) {
		return this.retry;
	}

	public void setSubCardNo(String subCardNo) {
		this.subCardNo = subCardNo;
	}
	public String getSubCardNo( ) {
		return this.subCardNo;
	}

}
