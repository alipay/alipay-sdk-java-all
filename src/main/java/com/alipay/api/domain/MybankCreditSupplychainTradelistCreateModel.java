package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 供应链金融-批量交易创建
 *
 * @author auto create
 * @since 1.0, 2018-07-03 23:32:54
 */
public class MybankCreditSupplychainTradelistCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6158185642426294735L;

	/**
	 * 买家会员信息
	 */
	@ApiField("buyer")
	private Member buyer;

	/**
	 * 渠道，枚举如下：TMGXBL：天猫供销保理，TYZBL：通用自保理，TMZBL：天猫自保理，DSCYFRZ：大搜车预付融资，CNBILL：菜鸟电票，CHENGYISHE：诚e赊
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 买家付款账户信息
	 */
	@ApiField("pay_account")
	private Account payAccount;

	/**
	 * 幂等编号，用于幂等控制，格式：机构ipRoleId_yyyymmddhhmmss_8位uniqId
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 销售产品码
	 */
	@ApiField("sale_pd_code")
	private String salePdCode;

	/**
	 * 关联的交易明细列表
	 */
	@ApiListField("scp_trade_list")
	@ApiField("scp_trade")
	private List<ScpTrade> scpTradeList;

	/**
	 * FACTORING：保理，PREPAYMENT：预付融资，CREDITPAY：信任付，PREPAYBILL：电票预付，CHENGYISHE：诚e赊
	 */
	@ApiField("trade_type")
	private String tradeType;

	public Member getBuyer() {
		return this.buyer;
	}
	public void setBuyer(Member buyer) {
		this.buyer = buyer;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Account getPayAccount() {
		return this.payAccount;
	}
	public void setPayAccount(Account payAccount) {
		this.payAccount = payAccount;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSalePdCode() {
		return this.salePdCode;
	}
	public void setSalePdCode(String salePdCode) {
		this.salePdCode = salePdCode;
	}

	public List<ScpTrade> getScpTradeList() {
		return this.scpTradeList;
	}
	public void setScpTradeList(List<ScpTrade> scpTradeList) {
		this.scpTradeList = scpTradeList;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

}
