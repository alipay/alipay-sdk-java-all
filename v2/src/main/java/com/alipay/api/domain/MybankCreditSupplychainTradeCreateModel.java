package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易创建
 *
 * @author auto create
 * @since 1.0, 2022-03-10 16:26:56
 */
public class MybankCreditSupplychainTradeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5573433682712346524L;

	/**
	 * 买家会员信息
	 */
	@ApiField("buyer")
	private Member buyer;

	/**
	 * 渠道，枚举如下：TMGXBL：天猫供销保理，TYZBL：通用自保理，TMZBL：天猫自保理，DSCYFRZ：大搜车预付融资，CNBILL：菜鸟电票
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 账款到期支付日期
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/**
	 * 由具体业务决定填充内容，JSON格式
	 */
	@ApiField("ext_data")
	private String extData;

	/**
	 * 外部订单号，格式：机构ipRoleId_外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 订单标题
	 */
	@ApiField("out_order_title")
	private String outOrderTitle;

	/**
	 * 买家付款账户信息
	 */
	@ApiField("pay_account")
	private Account payAccount;

	/**
	 * 卖家收款账户信息
	 */
	@ApiField("rcv_account")
	private Account rcvAccount;

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
	 * 卖家会员信息
	 */
	@ApiField("seller")
	private Member seller;

	/**
	 * 交易金额（单位：元），只支持两位小数点的正数
	 */
	@ApiField("trade_amount")
	private String tradeAmount;

	/**
	 * FACTORING：保理，PREPAYMENT：预付融资，CREDITPAY：信任付，PREPAYBILL：电票预付
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

	public Date getExpireDate() {
		return this.expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public String getExtData() {
		return this.extData;
	}
	public void setExtData(String extData) {
		this.extData = extData;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getOutOrderTitle() {
		return this.outOrderTitle;
	}
	public void setOutOrderTitle(String outOrderTitle) {
		this.outOrderTitle = outOrderTitle;
	}

	public Account getPayAccount() {
		return this.payAccount;
	}
	public void setPayAccount(Account payAccount) {
		this.payAccount = payAccount;
	}

	public Account getRcvAccount() {
		return this.rcvAccount;
	}
	public void setRcvAccount(Account rcvAccount) {
		this.rcvAccount = rcvAccount;
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

	public Member getSeller() {
		return this.seller;
	}
	public void setSeller(Member seller) {
		this.seller = seller;
	}

	public String getTradeAmount() {
		return this.tradeAmount;
	}
	public void setTradeAmount(String tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

}
